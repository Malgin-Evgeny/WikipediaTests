package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverContainer {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            Browsers browsers = Browsers.valueOf(System.getProperty("browser", "chrome"));

            switch (browsers) {
                case chrome:
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(options);
                    break;
                case firefox:
                    driver = new FirefoxDriver();
                    break;
                case ie:
                    driver = new EdgeDriver();
                    EdgeOptions options1 = new EdgeOptions();
                    options1.addArguments("--remote-allow-origins=*");
                    driver = new EdgeDriver(options1);
                    break;
            }
        }
        return driver;
    }

    public static void close() {
        if (driver != null) {
            driver.quit();
        }
        driver = null;
    }
}
