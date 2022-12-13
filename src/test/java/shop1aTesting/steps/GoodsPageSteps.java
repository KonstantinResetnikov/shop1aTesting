package shop1aTesting.steps;

import io.cucumber.java.en.And;
import shop1aTesting.pages.GoodsPage;
import shop1aTesting.pages.ItemPage;


public class GoodsPageSteps {
    @And("I select desired category")
    public void userSelectsSSDDiskCategory() {
        GoodsPage.ssdDiskSelect();
    }
    @And("I select desired product")
    public void userSelectsDesiredProduct() {
        GoodsPage.goodsSelect();
    }

    @And("I validate item name and price")
    public void userValidateItemNameAndPrice() {
        ItemPage itemPage = new ItemPage();
        itemPage.validateItem();
    }
}





