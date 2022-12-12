package shop1aTesting.pages;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class HomePage {
    private static final String baseUrl = "https://www.1a.lv/";
    private static final SelenideElement closePopUps = $x("//a[@class='c-button-inverse']");
    private static final SelenideElement categoryBar = $x("//li[@class='submenu-lvl1__list-item color-theme-21 submenu-lvl1__list-item--has-child']");
    private static final ElementsCollection subMenu = $$x("//a[@class='submenu-lvl2__block-title-link'][contains(@href,'ssd')]");


    public static void openBaseUrl() {

        open(baseUrl);
        $(closePopUps).click();
        getWebDriver().manage().window().maximize();
        Configuration.holdBrowserOpen = false;
    }

    public static void selectCategory() {
        $(categoryBar).hover();
        $$(subMenu).get(1).click();
    }
}
