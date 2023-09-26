package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private final By searchBox = By.id("simpleSearch");
    private final By date = By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[4]/td");

    private final By result = By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[6]/td/p");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void inputTextSearch(String text) {
        Actions action = new Actions(driver);
        action.click(driver.findElement(searchBox))
                .sendKeys(text)
                .pause(Duration.ofSeconds(1))
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
    }

    public String checkURL() {
        String url = driver.getCurrentUrl();
        return url;
    }

    public String checkDateEvent() {
        String text = driver.findElement(date).getText();
        return text;
    }

    public String checkResultEvent() {
        String text = driver.findElement(result).getText();
        return text;
    }
}
