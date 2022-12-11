package shop1aTesting.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import shop1aTesting.pages.homePage;




public class homePageSteps {
    @Given("User opens base url and close cookies")
    public void userOpensBaseUrlAndCloseCookies() {
     homePage.openBaseUrl();
        
    }

    @When("User mouse over Computer components category and selects HDD and SSD disk category")
    public void userMouseOverComputerComponentsCategory() {
        homePage.selectCategory();
        
    }}



