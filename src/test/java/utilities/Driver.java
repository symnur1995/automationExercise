package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {


    /*
     Creating the private constructor so this class' object
     is not reachable from outside
      */
    private Driver() {
    }

    /*
    Making our 'driver' instance private so that it is not reachable from outside the class.
    We make it static, because we want it to run before everything else, and also we will use it in a static method
     */
    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    /*
    Creating re-usable utility method that will return same 'driver' instance everytime we call it.
     */
    public static WebDriver getDriver() {
        //setting various capabilities for browsers
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("use-fake-ui-for-media-stream");

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("use-fake-ui-for-media-stream");

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("use-fake-ui-for-media-stream");

        if (driverPool.get() == null) {
            synchronized (Driver.class) {

            /*
            We read our browser type from configuration.properties file using
            .getProperty method we create in ConfigurationReader class.
             */
                String browserType = ConfigReader.getProperty("browser");
            /*
            Depending on the browser type our switch statement will determine
            to open specific type of browser/driver
             */
                switch (browserType) {

                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver(chromeOptions));
                        break;

                    case "chrome-headless":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver(new ChromeOptions().setHeadless(true)));
                        break;

                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver(firefoxOptions));
                        break;

                    case "firefox-headless":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver(new FirefoxOptions().setHeadless(true)));
                        break;

                    case "ie":
                        if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                            throw new WebDriverException("Your OS doesn't support Internet Explorer");
                        WebDriverManager.iedriver().setup();
                        driverPool.set(new InternetExplorerDriver());
                        break;

                    case "edge":
                        if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                            throw new WebDriverException("Your OS doesn't support Edge");
                        WebDriverManager.edgedriver().setup();
                        driverPool.set(new EdgeDriver());
                        break;

                    case "safari":
                        if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                            throw new WebDriverException("Your OS doesn't support Safari");
                        WebDriverManager.getInstance(SafariDriver.class).setup();
                        driverPool.set(new SafariDriver());
                        break;
                }
                driverPool.get().manage().window().maximize();
                driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            }
        }
        /*
        Same driver instance will be returned every time we call Driver.getDriver(); method
         */
        return driverPool.get();
    }

    /*
    This method makes sure we have some form of driver session or driver id has.
    Either null or not null it must exist.
     */
    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}


