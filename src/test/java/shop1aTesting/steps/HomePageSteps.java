package shop1aTesting.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import shop1aTesting.pages.HomePage;




public class HomePageSteps {
    @Given("open base url and close cookies")
    public void userOpensBaseUrlAndCloseCookies() {
     HomePage.openBaseUrl();
        
    }

    @When("I mouse over Computer components category and selects HDD and SSD disk category")
    public void userMouseOverComputerComponentsCategory() {
        HomePage.selectCategory();
        
    }}



