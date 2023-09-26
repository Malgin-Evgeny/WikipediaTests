import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.SearchPage;

public class SearсhTest extends BaseTest {

    private SearchPage searchPage;

    @BeforeMethod
    public void init() {
        searchPage = new SearchPage(driver);
    }

    @Test
    public void checkSearchArzamas() {
        LOG.info("Проверяем результат поиска по запросу Арзамас");
        searchPage.inputTextSearch("Арзамас");
        Assert.assertEquals(searchPage.checkURL(), System.getProperty("urlArzamas"));
    }

    @Test
    public void checkSearchSPB() {
        LOG.info("Проверяем результат поиска по запросу Санкт-Петербург");
        searchPage.inputTextSearch("Санкт-Петербург");
        Assert.assertEquals(searchPage.checkURL(), System.getProperty("urlSPB"));
    }

    @Test
    public void checkSearchMoscow() {
        LOG.info("Проверяем результат поиска по запросу Москва");
        searchPage.inputTextSearch("Москва");
        Assert.assertEquals(searchPage.checkURL(), System.getProperty("urlMoscow"));
    }

    @Test
    public void checkSearchEventDateBattleKursk() {
        LOG.info("Проверяем даты Курской битвы");
        searchPage.inputTextSearch("Курская битва");
        Assert.assertEquals(searchPage.checkDateEvent(), "5 июля — 23 августа 1943");
    }

    @Test
    public void checkSearchEventResultBattleKursk() {
        LOG.info("Проверяем результат Курской битвы");
        searchPage.inputTextSearch("Курская битва");
        Assert.assertEquals(searchPage.checkResultEvent(), "Победа Красной армии");
    }
}
