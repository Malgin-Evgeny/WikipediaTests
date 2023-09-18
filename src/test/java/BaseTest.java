import helper.WebDriverContainer;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseTest {
    protected Logger LOG = Logger.getLogger(String.valueOf(BaseTest.class));
    public WebDriver driver;

    @BeforeMethod(description = "Вход на сайт")
    public void beforeTest() {
        driver = WebDriverContainer.getDriver();
        driver.get("https://ru.wikipedia.org/");
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod(description = "Закрываем браузер")
    public void afterTest() {
        driver.quit();
    }
}
