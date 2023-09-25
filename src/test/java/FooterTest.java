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
        Assert.assertEquals(footer.checkURl(), "https://foundation.wikimedia.org/wiki/Policy:Privacy_policy");
    }

    @Test
    public void checkButtonWikipediaDescription() {
        LOG.info("Проверяем кнопку Описание Вкипедии");
        footer.clickButtonWikipediaDescription();
        Assert.assertEquals(footer.checkURl(), "https://ru.wikipedia.org/wiki/%D0%92%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%" +
                "D0%B4%D0%B8%D1%8F:%D0%9E%D0%BF%D0%B8%D1%81%D0%B0%D0%BD%D0%B8%D0%B5");
    }

    @Test
    public void checkButtonDenialResponsibility() {
        LOG.info("Проверяем кнопку Отказ от ответсвенности");
        footer.clickButtonDenialResponsibility();
        Assert.assertEquals(footer.checkURl(), "https://ru.wikipedia.org/wiki/%D0%92%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%" +
                "D0%B4%D0%B8%D1%8F:%D0%9E%D1%82%D0%BA%D0%B0%D0%B7_%D0%BE%D1%82_%D0%BE%D1%82%D0%B2%D0%B5%D1%82%D1%81" +
                "%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D0%BE%D1%81%D1%82%D0%B8");
    }

    @Test
    public void checkButtonContactUs() {
        LOG.info("Проверяем кнопку Свяжитесь с нами");
        footer.clickButtonContactUs();
        Assert.assertEquals(footer.checkURl(), "https://ru.wikipedia.org/wiki/%D0%92%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%D" +
                "0%B4%D0%B8%D1%8F:%D0%9A%D0%BE%D0%BD%D1%82%D0%B0%D0%BA%D1%82%D1%8B");
    }

    @Test
    public void checkButtonCodeConduct() {
        LOG.info("Проверяем кнопку Кодекс поведения");
        footer.clickButtonCodeConduct();
        Assert.assertEquals(footer.checkURl(), "https://foundation.wikimedia.org/wiki/Policy:Universal_Code_of_Conduct");
    }

    @Test
    public void checkButtonMobileVersion() {
        LOG.info("Проверяем кнопку Мобильная версия");
        footer.clickButtonMobileVersion();
        Assert.assertEquals(footer.checkURl(), "https://ru.m.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B" +
                "2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
    }

    @Test
    public void checkButtonDevelopers() {
        LOG.info("Проверяем кнопку Разработчики");
        footer.clickButtonDevelopers();
        Assert.assertEquals(footer.checkURl(), "https://developer.wikimedia.org/");
    }

    @Test
    public void checkButtonStatistics() {
        LOG.info("Проверяем кнопку Статистика");
        footer.clickButtonStatistics();
        Assert.assertEquals(footer.checkURl(), "https://stats.wikimedia.org/#/ru.wikipedia.org");
    }

    @Test
    public void checkIconWikimediaFoundationIcon() {
        LOG.info("Проверяем иконку Фонд Википедия");
        footer.clickIconWikimediaFoundation();
        Assert.assertEquals(footer.checkURl(), "https://wikimediafoundation.org/");
    }

    @Test
    public void checkButtonTermsUse() {
        LOG.info("Проверяем кнопку Условия использования");
        footer.clickButtonTermsUse();
        Assert.assertEquals(footer.checkURl(), "https://foundation.wikimedia.org/wiki/Policy:Terms_of_Use/ru");
    }

    @Test
    public void checkButtonWikimediaFoundation() {
        LOG.info("Проверяем кнопку Фонд Википедия");
        footer.clickButtonWikimediaFoundation();
        Assert.assertEquals(footer.checkURl(), "https://wikimediafoundation.org/ru/");
    }

    @Test
    public void checkButtonLicense() {
        LOG.info("Проверяем кнопку Лицензия");
        footer.clickButtonLicense();
        Assert.assertEquals(footer.checkURl(), "https://creativecommons.org/licenses/by-sa/4.0/deed.ru");
    }

    @Test
    public void checkIconMediaWiki() {
        LOG.info("Проверяем иконку Медия Вики");
        footer.clickIconMediaWiki();
        Assert.assertEquals(footer.checkURl(), "https://www.mediawiki.org/wiki/MediaWiki");
    }

    @Test
    public void checkButtonCookieStatement() {
        LOG.info("Проверяем кнопку заявление о куки");
        footer.clickButtonCookieStatement();
        Assert.assertEquals(footer.checkURl(), "https://foundation.wikimedia.org/wiki/Policy:Cookie_statement");
    }
}
