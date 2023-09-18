package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FooterMainPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By buttonPrivacyPolicy = By.xpath("//*[@id=\"footer-places-privacy\"]");
    private final By buttonWikipediaDescription = By.xpath("//*[@id=\"footer-places-about\"]");
    private final By buttonDenialResponsibility = By.xpath("//*[@id=\"footer-places-disclaimers\"]");
    private final By buttonContactUs = By.xpath("//*[@id=\"footer-places-contact\"]");
    private final By buttonCodeConduct = By.xpath("//*[@id=\"footer-places-wm-codeofconduct\"]");
    private final By buttonMobileVersion = By.xpath("//*[@id=\"footer-places-mobileview\"]");
    private final By buttonDevelopers = By.xpath("//*[@id=\"footer-places-developers\"]");
    private final By buttonStatistics = By.xpath("//*[@id=\"footer-places-statslink\"]");
    private final By buttonWikimediaFoundationIcon = By.xpath("//*[@id=\"footer-copyrightico\"]");
    private final By buttonTermsUse = By.xpath("//*[@id=\"footer-info-copyright\"]/span/a");
    private final By buttonWikimediaFoundation = By.xpath("//*[@id=\"footer-info-copyright\"]/a[3]");
    private final By buttonLicense = By.xpath("//*[@id=\"footer-info-copyright\"]/a[1]");
    private final By buttonMediaWiki = By.xpath("//*[@id=\"footer-poweredbyico\"]");
    private final By buttonCookieStatement = By.xpath("//*[@id=\"footer-places-cookiestatement\"]");


    public FooterMainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void clickButtonPrivacyPolicy() {
        driver.findElement(buttonPrivacyPolicy).click();
    }

    public void clickButtonWikipediaDescription() {
        driver.findElement(buttonWikipediaDescription).click();
    }

    public void clickButtonDenialResponsibility() {
        driver.findElement(buttonDenialResponsibility).click();
    }

    public void clickButtonContactUs() {
        driver.findElement(buttonContactUs).click();
    }

    public void clickButtonCodeConduct() {
        driver.findElement(buttonCodeConduct).click();
    }

    public void clickButtonMobileVersion() {
        driver.findElement(buttonMobileVersion).click();
    }

    public void clickButtonDevelopers() {
        driver.findElement(buttonDevelopers).click();
    }

    public void clickButtonStatistics() {
        driver.findElement(buttonStatistics).click();
    }

    public void clickIconWikimediaFoundation() {
        driver.findElement(buttonWikimediaFoundationIcon).click();
    }

    public void clickButtonTermsUse() {
        driver.findElement(buttonTermsUse).click();
    }

    public void clickButtonWikimediaFoundation() {
        driver.findElement(buttonWikimediaFoundation).click();
    }

    public void clickButtonLicense() {
        driver.findElement(buttonLicense).click();
    }

    public void clickIconMediaWiki() {
        driver.findElement(buttonMediaWiki).click();
    }

    public void clickButtonCookieStatement() {
        driver.findElement(buttonCookieStatement).click();
    }

    public String checkURl() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
