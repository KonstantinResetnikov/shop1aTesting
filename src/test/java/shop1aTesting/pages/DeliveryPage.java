package shop1aTesting.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

public class DeliveryPage {
    private static final ElementsCollection enterEmail = $$(By.id("user_email"));
    private static final ElementsCollection acceptEmailButton = $$x("//input[@class='users-session-form__submit']");
    private static final SelenideElement selectDelivery = $("input[name='shipping_unused'][value='3']");
    private static final SelenideElement selectProvider = $x("//img[contains(@src,'omniva')]");
    private static final SelenideElement deliveryAddress = $x("//span[@id='select2-pickup-point-container']");
    private static final SelenideElement deliverySearch = $x("//input[@type='search']");
    private static final SelenideElement selectAddress = $x("//li[@class='select2-results__option select2-results__option--highlighted']");

    public static void enterEmail(String email) {
        $$(enterEmail).get(1).sendKeys(email);
        $$(acceptEmailButton).get(1).click();

    }

    public static void selectDelivery() {
        $(selectDelivery).click();
        $(selectProvider).click();
        sleep(1000);
        $(deliveryAddress).click();
        $(deliverySearch).sendKeys("Bikirn");
        $(selectAddress).click();
    }
}
