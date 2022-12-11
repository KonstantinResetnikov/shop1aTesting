package shop1aTesting.pages;
//Need to assert name and price


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class cartPage {

    private static final ElementsCollection enterEmail = $$(By.id("user_email"));
    private static final SelenideElement acceptEmailButton = $x("//input[contains(@data-disable-with,'Turpin')]");
    private static final SelenideElement selectDelivery = $("input[name='shipping_unused'][value='3']");
    private static final SelenideElement selectProvider = $x("//img[contains(@src,'omniva')]");
    private static final SelenideElement deliveryAddress = $x("//span[@data-select2-id='191']");
    private static final SelenideElement deliverySearch = $x("//input[@type='search']");
    private static final SelenideElement selectAddress = $x("//li[@data-select2-id='select2-pickup-point-result-98hx-60']");
    private static final SelenideElement enterName = $(By.id("address_first_name]"));


    public static void enterEmail(String email){

        $$(enterEmail).get(1).sendKeys(email);
        $(acceptEmailButton).click();
    }

    public static void fillDelivery (){
        $(selectDelivery).click();
        sleep(1000);
        $(selectProvider).click();
        $(deliveryAddress).hover().click();
        $(deliverySearch).sendKeys("Bikirn");


    }

}
