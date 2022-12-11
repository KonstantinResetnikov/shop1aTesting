package shop1aTesting.steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import shop1aTesting.pages.cartPage;

public class cartPageSteps {

    @When("User enters {string}")
    public void userEnters(String email) {
        cartPage.enterEmail(email);
    }


    @Then("User select delivery, fill {string}, {string}, {string} and validate name and price")
    public void userSelectDeliveryFillAndValidateNameAndPrice(String name, String surname, String phone) {
        cartPage.fillDelivery(name,surname,phone);
    }
}
