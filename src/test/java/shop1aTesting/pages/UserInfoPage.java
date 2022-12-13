package shop1aTesting.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static shop1aTesting.models.ItemModel.itemModel;
import static shop1aTesting.models.UserModel.userModel;

public class UserInfoPage{

    private static final SelenideElement enterName = $(By.id("address_first_name"));
    private static final SelenideElement enterSurname = $(By.id("address_last_name"));
    private static final SelenideElement enterPhone = $(By.id("address_phone_number"));
    private static final ElementsCollection firstSubmit = $$x("//button[@name='button'][@type='submit']");
    private static final SelenideElement checkName = $x("//div[@class='name']");
    private static final SelenideElement checkPrice = $x("//span [@class='checkout-order-summary-total__price']");



    public void fillDelivery(String name, String surname, String phone) {

        userModel.setUserName(name);
        userModel.setUserSurname(surname);
        userModel.setUserPhone(phone);
        userModel.setUserNameSurname(name + " " + surname);

        $(enterName).sendKeys(userModel.getUserName());
        $(enterSurname).sendKeys(userModel.getUserSurname());
        $(enterPhone).sendKeys(userModel.getUserPhone());
        $$(firstSubmit).get(0).click();
        $$(firstSubmit).get(1).click();
        $(checkName).shouldHave(Condition.exactText(userModel.getUserNameSurname()));
        $(checkPrice).shouldHave(Condition.exactText(itemModel.getGoodsPrice()));
    }

}
