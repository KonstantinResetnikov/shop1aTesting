package shop1aTesting.steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import shop1aTesting.pages.UserInfoPage;
import shop1aTesting.pages.DeliveryPage;

public class UserInfoSteps {

    @When("I enter {string}")
    public void userEnters(String email) {

        DeliveryPage.enterEmail(email);
    }


    @Then("Fill {string}, {string}, {string} and Validate name and price")
    public void userSelectDeliveryFillAndValidateNameAndPrice(String name, String surname, String phone) {
        UserInfoPage.fillDelivery(name,surname,phone);
    }
}
