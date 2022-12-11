package shop1aTesting.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class cartPage {

    private static final ElementsCollection enterEmail = $$(By.id("user_email"));
    private static final ElementsCollection acceptEmailButton = $$x("//input[@class='users-session-form__submit']");
    private static final SelenideElement selectDelivery = $("input[name='shipping_unused'][value='3']");
    private static final SelenideElement selectProvider = $x("//img[contains(@src,'omniva')]");
    private static final SelenideElement deliveryAddress = $x("//span[@id='select2-pickup-point-container']");
    private static final SelenideElement deliverySearch = $x("//input[@type='search']");
    private static final SelenideElement selectAddress = $x("//li[@class='select2-results__option select2-results__option--highlighted']");
    private static final SelenideElement enterName = $(By.id("address_first_name"));
    private static final SelenideElement enterSurname = $(By.id("address_last_name"));
    private static final SelenideElement enterPhone = $(By.id("address_phone_number"));
    private static final ElementsCollection firstSubmit = $$x("//button[@name='button'][@type='submit']");
    private static final ElementsCollection secondSubmit = $$x("//button[@name='button'][@type='submit']");
    private static final SelenideElement assertName = $x("//div[@class='name']");
    private static final SelenideElement assertPrice = $x("//span [@class='checkout-order-summary-total__price']");

    public static void enterEmail(String email) {
        $$(enterEmail).get(1).sendKeys(email);
        $$(acceptEmailButton).get(1).click();
    }
    public static void fillDelivery(String name, String surname, String phone) {
        $(selectDelivery).click();
        sleep(1000);
        $(selectProvider).click();
        sleep(1000);
        $(deliveryAddress).hover().click();
        sleep(1000);
        $(deliverySearch).hover().sendKeys("Bikirn");
        sleep(1000);
        $(selectAddress).hover().click();
        sleep(1000);
        $(enterName).sendKeys(name);
        $(enterSurname).sendKeys(surname);
        $(enterPhone).sendKeys(phone);
        $$(firstSubmit).get(1).click();
        sleep(1000);
        $$(secondSubmit).get(1).click();

        String nameSurname = name + " " + surname;
        String currentPrice = $(assertPrice).getText();
        $(assertName).shouldHave(Condition.exactText(nameSurname));
        $(assertPrice).shouldHave(Condition.exactText(currentPrice));


    }

}
