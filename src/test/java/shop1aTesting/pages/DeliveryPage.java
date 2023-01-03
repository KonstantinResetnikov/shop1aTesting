package shop1aTesting.pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

public class DeliveryPage {
    private static final ElementsCollection enterEmail = $$(By.id("user_email"));
    private static final ElementsCollection acceptEmailButton = $$x("//input[@class='users-session-form__submit']");
    private static final SelenideElement selectDeliveryShop = $("input[name='shipping_unused'][value='2']");
    private static final SelenideElement selectShop = $x("//input[@value='3543']");


    public static void enterEmail(String email) {
        $$(enterEmail).get(1).sendKeys(email);
        $$(acceptEmailButton).get(1).click();

    }

    public static void selectDelivery() {
        $(selectDeliveryShop).click();
        $(selectShop).click();

    }
}
