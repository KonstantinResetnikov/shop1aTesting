package shop1aTesting.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class goodsPage {
    private static final SelenideElement ssdDisk = $x("//img[contains(@title,'(SSD)')]");
    private static final SelenideElement diskCapacity = $("img[src='https://images.1a.lv/display/aikido/store/ac0ac498b95a6ca36e13500675bf0b44.png?h=270&op=fit&w=300']");
    private static final SelenideElement priceSortButton = $x("//div[@class='catalog-taxons-view-tools__sort-button-container']");
    private static final SelenideElement priceSortAsc = $x("//li[@class='select2-results__option select2-results__option--highlighted']");
    private static final SelenideElement goodsSelectHover = $x("//div[@data-variant-id='796435']");
    private static final SelenideElement goodsBuyButton = $x("//button[contains(@onclick,'(SSD) Silicon Power P34A60')]");
    private static final SelenideElement goodsAddToCart = $x("//a[@class='main-button'][contains(@href,'/cart')]");
    private static final SelenideElement toPaymentPage =$x("//input[@class='main-button cart-main-button cart-main-button--large']");
    private static final SelenideElement price = $x("//p[@class='detailed-cart-item__price']");
    private static final SelenideElement goodsName = $x("//a[@class='detailed-cart-item__name-link']");
    public static void ssdDiskSelect() {
        $(ssdDisk).click();
        $(diskCapacity).click();
        sleep(1000);
    }
    public static void goodsPageSort() {
        $(priceSortButton).scrollIntoView(true);
        sleep(1000);
        $(priceSortButton).hover().click();
        sleep(1000);
        $(priceSortAsc).scrollIntoView(true);
        $(priceSortAsc).hover().click();
        sleep(1000);

    }
    public static void goodsSelect() {
        $(goodsSelectHover).scrollTo();
        $(goodsSelectHover).hover();
        sleep(1000);
        $(goodsBuyButton).hover().click();
        $(goodsAddToCart).click();
    }
    public static void validateItem() {
        String goodsActualName = $(goodsName).getText();
        String goodsActualPrice = $(price).getText();
        $(goodsName).shouldHave(Condition.exactText(goodsActualName));
        $(price).shouldHave(Condition.exactText(goodsActualPrice));
        $(toPaymentPage).hover().click();}
    }


