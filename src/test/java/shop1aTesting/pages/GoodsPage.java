package shop1aTesting.pages;



import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.*;


public class GoodsPage extends BasePage {
    public static final SelenideElement ssdDisk = $x("//img[contains(@title,'(SSD)')]");
    private static final SelenideElement diskCapacity = $("img[src='https://images.1a.lv/display/aikido/store/ac0ac498b95a6ca36e13500675bf0b44.png?h=270&op=fit&w=300']");
    private static final SelenideElement priceSortButton = $x("//div[@class='catalog-taxons-view-tools__sort-button-container']");
    private static final ElementsCollection priceSortAsc = $$x("//li[@class='select2-results__option']");
    private static final SelenideElement goodsSelectHover = $x("//div[@data-variant-id='796435']");
    private static final SelenideElement goodsBuyButton = $x("//button[contains(@onclick,'(SSD) Silicon Power P34A60')]");
    private static final SelenideElement goodsAddToCart = $x("//a[@class='main-button'][contains(@href,'/cart')]");




    public static void ssdDiskSelect() {
        $(ssdDisk).shouldHave(Condition.exactText("")).click();
        $(diskCapacity).shouldBe(Condition.visible, Duration.ofMillis(5000)).click();

    }


    public static void goodsPageSort() {
        sleep(1000);
        $(priceSortButton).shouldHave(Condition.text(" "), Duration.ofSeconds(1000,18888));
        $(priceSortButton).hover().click();
        $$(priceSortAsc).get(0).should(Condition.visible, Duration.ofSeconds(10,10)).scrollIntoView(false);
        $$(priceSortAsc).get(0).shouldBe(Condition.exist).click();



    }
    public static void goodsSelect() {
        $(goodsSelectHover).scrollTo();
        $(goodsSelectHover).hover();
        $(goodsBuyButton).hover().click();
        $(goodsAddToCart).click();
    }}



