package shop1aTesting.steps;

import io.cucumber.java.en.And;
import shop1aTesting.pages.DeliveryPage;

public class DeliveryPageSteps {
    @And("I select delivery")
    public void iSelectDelivery() {
        DeliveryPage.selectDelivery();
    }
}
