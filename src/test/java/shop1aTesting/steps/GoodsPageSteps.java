package shop1aTesting.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import shop1aTesting.pages.GoodsPage;
import shop1aTesting.pages.ItemPage;

public class GoodsPageSteps {
    @And("I select desired category")
    public void userSelectsSSDDiskCategory() {
        GoodsPage.ssdDiskSelect();

    }

    @And("I sort items by lower price")
    public void userSortsItemsByLowerPrice() {
        GoodsPage.goodsPageSort();
    }

    @And("I select desired product")
    public void userSelectsDesiredProduct() {
        GoodsPage.goodsSelect();
    }

    @Then("I validate item name and price")
    public void userValidateItemNameAndPrice() {
        ItemPage.validateItem();
    }
}





