import helper.ScreenshotListener;
import helper.WebDriverContainer;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Listeners(ScreenshotListener.class)
public class BaseTest {

    protected Logger LOG = Logger.getLogger(BaseTest.class);
    public WebDriver driver;


    @BeforeMethod(description = "Вход на сайт")
    public void beforeTest() throws IOException {
        driver = WebDriverContainer.getDriver();
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("application.properties"));
        driver.get(System.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod(description = "Закрываем браузер")
    public void afterTest() {
        WebDriverContainer.close();
    }
}
