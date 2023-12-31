import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

public class AuthenticationFunctionalTests extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void init() {
        loginPage = new LoginPage(driver);
        loginPage.attemptLogin(System.getProperty("username"), System.getProperty("password"));
    }

    @Test
    public void checkNickNameTest() {
        LOG.info("Проверяем Имя пользователя после аутентификации");
        loginPage.checkNickNameIconIsVisible();
        loginPage.clickNickNameIconButton();
        Assert.assertEquals(loginPage.checkTitle(), "Здравствуйте, \u202AAnalginchik\u202C! — Википедия");
    }

    @Test
    public void checkNotificationsTest() {
        LOG.info("Проверяем Уведовления после аутентификации");
        loginPage.checkNotificIconIsVisible();
        loginPage.clickNoticeButton();
        loginPage.clickAllNotifications();
        Assert.assertEquals(loginPage.checkTitle(), "Уведомления — Википедия");
    }

    @Test
    public void checkDraftTest() {
        LOG.info("Проверяем Черновик после аутентификации");
        loginPage.checkDraftIsVisible();
        loginPage.clickDraftButton();
        Assert.assertEquals(loginPage.checkTitle(), "Создание страницы «Участник:Analginchik/Черновик» — Википедия");
    }

    @Test
    public void checkSettingTest() {
        LOG.info("Проверяем Настройки после аутентификации");
        loginPage.checkSettingIsVisible();
        loginPage.clickSettingButton();
        Assert.assertEquals(loginPage.checkTitle(), "Настройки — Википедия");
    }

    @Test
    public void checkObservationListTest() {
        LOG.info("Проверяем Список наблюдения после аутентификации");
        loginPage.checkListIsVisible();
        loginPage.clickListButton();
        Assert.assertEquals(loginPage.checkTitle(), "Список наблюдения — Википедия");
    }
}
