import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.FooterMainPage;

public class FooterTest extends BaseTest {

    private FooterMainPage footer;

    @BeforeMethod
    public void init() {
        footer = new FooterMainPage(driver);
    }

    @Test
    public void checkButtonPrivacyPolicy() {
        LOG.info("Проверяем кнопку Политика конфиденциальности");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 1500)");
        footer.clickButtonPrivacyPolicy();
        Assert.assertEquals(footer.checkURl(),System.getProperty("urlPrivacyPolicy"));
    }

    @Test
    public void checkButtonWikipediaDescription() {
        LOG.info("Проверяем кнопку Описание Вкипедии");
        footer.clickButtonWikipediaDescription();
        Assert.assertEquals(footer.checkURl(), System.getProperty("urlWikipediaDescription"));
    }

    @Test
    public void checkButtonDenialResponsibility() {
        LOG.info("Проверяем кнопку Отказ от ответсвенности");
        footer.clickButtonDenialResponsibility();
        Assert.assertEquals(footer.checkURl(),System.getProperty("urlDenialResponsibility") );
    }

    @Test
    public void checkButtonContactUs() {
        LOG.info("Проверяем кнопку Свяжитесь с нами");
        footer.clickButtonContactUs();
        Assert.assertEquals(footer.checkURl(), System.getProperty("urlContactUs"));
    }

    @Test
    public void checkButtonCodeConduct() {
        LOG.info("Проверяем кнопку Кодекс поведения");
        footer.clickButtonCodeConduct();
        Assert.assertEquals(footer.checkURl(), System.getProperty("urlCodeConduct"));
    }

    @Test
    public void checkButtonMobileVersion() {
        LOG.info("Проверяем кнопку Мобильная версия");
        footer.clickButtonMobileVersion();
        Assert.assertEquals(footer.checkURl(), System.getProperty("urlMobileVersion"));
    }

    @Test
    public void checkButtonDevelopers() {
        LOG.info("Проверяем кнопку Разработчики");
        footer.clickButtonDevelopers();
        Assert.assertEquals(footer.checkURl(), System.getProperty("urlDevelopers"));
    }

    @Test
    public void checkButtonStatistics() {
        LOG.info("Проверяем кнопку Статистика");
        footer.clickButtonStatistics();
        Assert.assertEquals(footer.checkURl(), System.getProperty("urlStatistics"));
    }

    @Test
    public void checkIconWikimediaFoundationIcon() {
        LOG.info("Проверяем иконку Фонд Википедия");
        footer.clickIconWikimediaFoundation();
        Assert.assertEquals(footer.checkURl(), System.getProperty("urlWikimediaFound"));
    }

    @Test
    public void checkButtonTermsUse() {
        LOG.info("Проверяем кнопку Условия использования");
        footer.clickButtonTermsUse();
        Assert.assertEquals(footer.checkURl(), System.getProperty("urlTermsUse"));
    }

    @Test
    public void checkButtonWikimediaFoundation() {
        LOG.info("Проверяем кнопку Фонд Википедия");
        footer.clickButtonWikimediaFoundation();
        Assert.assertEquals(footer.checkURl(), System.getProperty("urlWikimediaFoundRU"));
    }

    @Test
    public void checkButtonLicense() {
        LOG.info("Проверяем кнопку Лицензия");
        footer.clickButtonLicense();
        Assert.assertEquals(footer.checkURl(), System.getProperty("urlLicense"));
    }

    @Test
    public void checkIconMediaWiki() {
        LOG.info("Проверяем иконку Медия Вики");
        footer.clickIconMediaWiki();
        Assert.assertEquals(footer.checkURl(), System.getProperty("urlMediaWiki"));
    }

    @Test
    public void checkButtonCookieStatement() {
        LOG.info("Проверяем кнопку заявление о куки");
        footer.clickButtonCookieStatement();
        Assert.assertEquals(footer.checkURl(), System.getProperty("urlCookieStatement"));
    }
}
