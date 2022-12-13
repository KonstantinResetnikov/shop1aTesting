package shop1aTesting.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static shop1aTesting.models.ItemModel.itemModel;

public class ItemPage {
    private static final SelenideElement toPaymentPage =$x("//input[@class='main-button cart-main-button cart-main-button--large']");
    private static final SelenideElement price = $x("//p[@class='detailed-cart-item__price']");
    private static final SelenideElement goodsName = $x("//a[@class='detailed-cart-item__name-link']");


    public void validateItem() {

        itemModel.setGoodsName($(goodsName).getText());
        itemModel.setGoodsPrice($(price).getText());
        $(goodsName).shouldHave(Condition.exactText(itemModel.getGoodsName()));
        $(price).shouldHave(Condition.exactText(itemModel.getGoodsPrice()));
        $(toPaymentPage).hover().click();


    }

}

