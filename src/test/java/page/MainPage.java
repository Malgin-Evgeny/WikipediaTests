package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;
    private final By mainPageButton = By.xpath("//*[@id=\"n-mainpage-description\"]");
    private final By mainPageTitle = By.xpath("//*[@id=\"Добро_пожаловать_в_Википедию,\"]");
    private final By contentButton = By.xpath("//*[@id=\"n-content\"]");
    private final By titlePage = By.xpath("//*[@id=\"firstHeading\"]/span[3]");
    private final By favoritesButton = By.xpath("//*[@id=\"n-featured\"]/a/span");
    private final By currentEventsButton = By.xpath("//*[@id=\"n-currentevents\"]/a/span");
    private final By randomArticlesButton = By.xpath("//*[@id=\"n-randompage\"]/a/span");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMainPageButton() {
        driver.findElement(mainPageButton).click();
    }

    public void clickContentButton() {
        driver.findElement(contentButton).click();
    }

    public void clickFavoritesButton() {
        driver.findElement(favoritesButton).click();
    }

    public void clickCurrentEventsButton() {
        driver.findElement(currentEventsButton).click();
    }

    public void clickRandomArticlesButton() {
        driver.findElement(randomArticlesButton).click();
    }

    public String checkTitleMainPage() {
        String text = driver.findElement(mainPageTitle).getText();
        return text;
    }

    public String checkTitlePage() {
        String text = driver.findElement(titlePage).getText();
        return text;
    }

    public String checkURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
}

