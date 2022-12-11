package shop1aTesting.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import shop1aTesting.pages.goodsPage;

public class goodsPageSteps {
    @And("User selects desired category")
    public void userSelectsSSDDiskCategory() {
        goodsPage.ssdDiskSelect();
        
    }

    @And("User sorts items by lower price")
    public void userSortsItemsByLowerPrice() {
        goodsPage.goodsPageSort();
    }

    @And("User selects desired product")
    public void userSelectsDesiredProduct() {
        goodsPage.goodsSelect();
    }

    @Then("User validate item name and price")
    public void userValidateItemNameAndPrice() {
        goodsPage.validateItem();
    }
}





