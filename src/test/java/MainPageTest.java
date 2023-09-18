import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.MainPage;

public class MainPageTest extends BaseTest{

    private MainPage mainPage;

    @BeforeMethod
    public void init() {
        mainPage = new MainPage(driver);
    }

    @Test
    public void clickButtonMainPage() {
        LOG.info("Проверяем кнопку Заглавная страница");
        mainPage.clickMainPageButton();
        Assert.assertEquals(mainPage.checkTitleMainPage(), "Добро пожаловать в Википедию,");
    }

    @Test
    public void clickButtonContent() {
        LOG.info("Проверяем кнопку содержание");
        mainPage.clickContentButton();
        Assert.assertEquals(mainPage.checkTitlePage(), "Содержание");
    }

    @Test
    public void clickButtonFavorites() {
        LOG.info("Проверяем кнопку Избранные");
        mainPage.clickFavoritesButton();
        Assert.assertEquals(mainPage.checkTitlePage(), "Избранные статьи");
    }

    @Test
    public void clickButtonRandomArticles() {
        LOG.info("Проверяем кнопку Случайная статья");
        Assert.assertEquals(mainPage.checkURL(), "https://ru.wikipedia.org/wiki/" +
                "%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_" +
                "%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        mainPage.clickRandomArticlesButton();
        Assert.assertNotEquals(mainPage.checkURL(),"https://ru.wikipedia.org/wiki/" +
                "%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_" +
                "%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");

    }

    @Test
    public void clickButtonCurrentEvents() {
        LOG.info("Проверяем кнопку Текущие события");
        mainPage.clickCurrentEventsButton();
        Assert.assertEquals(mainPage.checkTitlePage(), "Текущие события");
    }
}
