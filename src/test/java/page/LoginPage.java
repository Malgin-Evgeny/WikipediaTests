package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private final By buttonJoinToSite = By.xpath("//*[@id=\"pt-login\"]/a/span");
    private final By inputLogin = By.xpath("//*[@id=\"wpName1\"]");
    private final By inputPassword = By.xpath("//*[@id=\"wpPassword1\"]");
    private final By buttonJoin = By.xpath("//*[@id=\"wpLoginAttempt\"]");
    private final By nickName = By.xpath("//*[@id=\"pt-userpage\"]/a/span");
    private final By loginHelpButton = By.xpath("//*[@id=\"userloginForm\"]/form/div/div[5]/div/a");
    private final By loginHelpPageTitle = By.xpath("//*[@id=\"firstHeading\"]/span[3]");
    private final By resetYourPasswordButton = By.xpath("//*[@id=\"userloginForm\"]/form/div/div[6]/div/a");
    private final By resetYourPasswordTittlePage = By.xpath("//*[@id=\"firstHeading\"]");
    private final By joinProjectButton = By.xpath("//*[@id=\"mw-createaccount-join\"]");
    private final By joinProjectTittlePage = By.xpath("//*[@id=\"firstHeading\"]");
    private final By invalidLoginAndPassword = By.xpath("//*[@id=\"userloginForm\"]/form/div[1]/div");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickJoinButton() {
        driver.findElement(buttonJoinToSite).click();
    }

    private void setLogin(String login) {
        driver.findElement(inputLogin).sendKeys(login);
    }

    private void setPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
    }

    private void clickLoginButton() {
        driver.findElement(buttonJoin).click();
    }

    public void checkNickNameIsVisible() {
        driver.findElement(nickName).isDisplayed();
    }

    public void attemptLogin(String login, String password) {
        clickJoinButton();
        setLogin(login);
        setPassword(password);
        clickLoginButton();
    }

    public void clickLoginHelp() {
        clickJoinButton();
        driver.findElement(loginHelpButton).click();
    }

    public String checkTitleLoginHelpPage() {
        String text = driver.findElement(loginHelpPageTitle).getText();
        return text;
    }

    public void clickResetYourPassword() {
        clickJoinButton();
        driver.findElement(resetYourPasswordButton).click();
    }

    public String checkTittleResetYourPasswordPage() {
        String text = driver.findElement(resetYourPasswordTittlePage).getText();
        return text;
    }

    public void clickJoinProject() {
        clickJoinButton();
        driver.findElement(joinProjectButton).click();
    }

    public String checkTittleJoinProjectPage() {
        String text = driver.findElement(joinProjectTittlePage).getText();
        return text;
    }

    public String authorizationIsError() {
        return driver.findElement(invalidLoginAndPassword).getText();
    }
}
