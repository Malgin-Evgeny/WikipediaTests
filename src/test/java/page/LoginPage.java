package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

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
    private final By nickNameIcon = By.xpath("//*[@id=\"pt-userpage\"]");
    private final By noticeIcon = By.id("pt-notifications-notice");
    private final By buttonAllNotifications = By.xpath("/html/body/div[6]/div[4]/div[1]/div[3]/div/span/span[1]/a/span[2]");
    private final By draftButton = By.id("pt-sandbox");
    private final By settingButton = By.id("pt-preferences");
    private final By listButton = By.id("pt-watchlist");

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

    public void checkNickNameIconIsVisible() {
        driver.findElement(nickNameIcon).isDisplayed();
    }

    public void checkNotificIconIsVisible() {
        driver.findElement(noticeIcon).isDisplayed();
    }

    public void clickNoticeButton() {
        driver.findElement(noticeIcon).click();
    }

    public void clickAllNotifications() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(buttonAllNotifications))
                .click()
                .build()
                .perform();
    }

    public void attemptLogin(String login, String password) {
        clickJoinButton();
        setLogin(login);
        setPassword(password);
        clickLoginButton();
    }

    public void clickNickNameIconButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(nickNameIcon))
                .click()
                .build()
                .perform();
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

    public void clickDraftButton() {
        driver.findElement(draftButton).click();
    }

    public void checkDraftIsVisible() {
        driver.findElement(draftButton).isDisplayed();
    }

    public void clickSettingButton() {
        driver.findElement(settingButton).click();
    }

    public void checkSettingIsVisible() {
        driver.findElement(settingButton).isDisplayed();
    }

    public void clickListButton() {
        driver.findElement(listButton).click();
    }

    public void checkListIsVisible() {
        driver.findElement(listButton).isDisplayed();
    }

    public String authorizationIsError() {
        return driver.findElement(invalidLoginAndPassword).getText();
    }

    public String checkTitle() {
        String title = driver.getTitle();
        return title;
    }
}
