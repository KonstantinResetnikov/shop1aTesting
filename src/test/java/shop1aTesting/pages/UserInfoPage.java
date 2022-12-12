package shop1aTesting.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import shop1aTesting.models.DeliveryPriceModel;
import shop1aTesting.models.UserModel;

import static com.codeborne.selenide.Selenide.*;

public class UserInfoPage {

    private static final SelenideElement enterName = $(By.id("address_first_name"));
    private static final SelenideElement enterSurname = $(By.id("address_last_name"));
    private static final SelenideElement enterPhone = $(By.id("address_phone_number"));
    private static final ElementsCollection firstSubmit = $$x("//button[@name='button'][@type='submit']");
    private static final SelenideElement checkName = $x("//div[@class='name']");
    private static final SelenideElement checkPrice = $x("//span [@class='checkout-order-summary-total__price']");

    public static DeliveryPriceModel deliveryPriceModel = new DeliveryPriceModel();
    public static UserModel userModel = new UserModel();


    public static void fillDelivery(String name, String surname, String phone) {
        $(enterName).sendKeys(name);
        $(enterSurname).sendKeys(surname);
        $(enterPhone).sendKeys(phone);
        $$(firstSubmit).get(1).click();
        deliveryPriceModel.setFullPrice($(checkPrice).getText());
        userModel.setUserName(name);
        userModel.setUserSurname(surname);
        userModel.setUserNameSurname(name + " " + surname);
        $(checkName).shouldHave(Condition.exactText(userModel.getUserNameSurname()));
        $(checkPrice).shouldHave(Condition.exactText(deliveryPriceModel.getFullPrice()));

    }

}
