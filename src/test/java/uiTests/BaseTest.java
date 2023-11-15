package uiTests;

import com.codeborne.selenide.Configuration;

import data.FakeData;
import org.testng.annotations.BeforeClass;
import helper.ReadFile;
import pages.google.MainPage;
import pages.google.SearchResultPage;

import static com.codeborne.selenide.Selenide.open;


public abstract class BaseTest {
    public MainPage mainPage;
    public FakeData data;
    public ReadFile readFileExample;
    public SearchResultPage searchResultPage;

    @BeforeClass
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 100000;
        open("https://www.google.ru/");

        searchResultPage = new SearchResultPage();
        data = new FakeData();
        mainPage = new MainPage();
        readFileExample = new ReadFile();

    }
}
