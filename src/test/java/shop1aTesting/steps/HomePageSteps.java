package shop1aTesting.steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import shop1aTesting.pages.HomePage;




public class HomePageSteps {
    @Given("I open base url and close cookies")
    public void userOpensBaseUrlAndCloseCookies() {
     HomePage.openBaseUrl();
        
    }


    @And("I mouse over Computer components category and selects HDD and SSD disk category")
    public void iMouseOverComputerComponentsCategoryAndSelectsHDDAndSSDDiskCategory() {
        HomePage.selectCategory();
    }
}



