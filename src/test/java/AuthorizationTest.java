import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

public class AuthorizationTest extends BaseTest {
    private LoginPage loginPage;

    @BeforeMethod
    public void init() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void authorization() {
        loginPage.attemptLogin("Analginchik", "123456_Test");
        loginPage.checkNickNameIsVisible();
    }

    @Test
    public void checkLoginHelp() {
        loginPage.clickLoginHelp();
        Assert.assertEquals(loginPage.checkTitleLoginHelpPage(), "Представление системе");
    }

    @Test
    public void checkResetYourPassword() {
        loginPage.clickResetYourPassword();
        Assert.assertEquals(loginPage.checkTittleResetYourPasswordPage(), "Сброс пароля");
    }

    @Test
    public void checkJoinProject() {
        loginPage.clickJoinProject();
        Assert.assertEquals(loginPage.checkTittleJoinProjectPage(), "Создать учётную запись");
    }
}
