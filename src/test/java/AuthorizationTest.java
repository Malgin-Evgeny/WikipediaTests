import helper.ActionFunctionInterface;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.LoginPage;

public class AuthorizationTest extends BaseTest {
    private LoginPage loginPage;

    @BeforeMethod
    public void init() {
        loginPage = new LoginPage(driver);
    }

    @DataProvider(name = "testAuthorization")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"Analginchik", "123456_Test", (ActionFunctionInterface) () -> loginPage.checkNickNameIsVisible()},
                {"Analgin", "123456_Test", (ActionFunctionInterface) () ->
                        Assert.assertEquals(loginPage.authorizationIsError(),
                                "Введены неверные имя участника или пароль. Попробуйте ещё раз.")},
                {"Analginchik", "123-", (ActionFunctionInterface) () ->
                        Assert.assertEquals(loginPage.authorizationIsError(),
                                "Введены неверные имя участника или пароль. ")}
        };
    }

    @Test(dataProvider = "testAuthorization", testName = "Проверка авторизации на сайт")
    public void authorization(String login, String password, ActionFunctionInterface func) {
        LOG.info("Авторизация на сайте");
        loginPage.attemptLogin(login, password);
        func.apply();
    }

    @Test
    public void checkLoginHelp() {
        LOG.info("Кликаем на ссылку справки по входу в систему");
        loginPage.clickLoginHelp();
        Assert.assertEquals(loginPage.checkTitleLoginHelpPage(), "Представление системе");
    }

    @Test
    public void checkResetYourPassword() {
        LOG.info("Кликаем на ссылку сброс пароля");
        loginPage.clickResetYourPassword();
        Assert.assertEquals(loginPage.checkTittleResetYourPasswordPage(), "Сброс пароля");
    }

    @Test
    public void checkJoinProject() {
        LOG.info("Кликаем на ссылку присоедениться к проекту");
        loginPage.clickJoinProject();
        Assert.assertEquals(loginPage.checkTittleJoinProjectPage(), "Создать учётную запись");
    }
}
