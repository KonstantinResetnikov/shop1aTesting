package shop1aTesting.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;


public class GoodsPage {
    public static final SelenideElement ssdDisk = $x("//img[contains(@title,'(SSD)')]");
    private static final SelenideElement diskCapacity = $("a[data-value='3js']");
    private static final SelenideElement goodsSelectHover = $x("//div[@data-variant-id='796435']");
    private static final SelenideElement goodsBuyButton = $x("//button[contains(@onclick,'(SSD) Silicon Power P34A60')]");
    private static final SelenideElement goodsAddToCart = $x("//a[@class='main-button'][contains(@href,'/cart')]");




    public static void ssdDiskSelect() {
        $(ssdDisk).click();
        $(diskCapacity).shouldBe(Condition.enabled).scrollIntoView(true).hover().click();
    }


    public static void goodsSelect() {
        $(goodsSelectHover).scrollIntoView(true);
        $(goodsSelectHover).hover();
        $(goodsBuyButton).hover().click();
        $(goodsAddToCart).click();
    }}



