package shop1aTesting;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import shop1aTesting.pages.cartPage;
import shop1aTesting.pages.goodsPage;
import shop1aTesting.pages.homePage;

import static com.codeborne.selenide.Selenide.open;

public class shop1aTestLauncher {
    @Test
    public void shop1aPage(){
      homePage.openBaseUrl();
      homePage.selectCategory();
      goodsPage.ssdDiskSelect();
      goodsPage.goodsPageSort();
      goodsPage.goodsSelect();
      cartPage.enterEmail("konre93@gmail.com");
      cartPage.fillDelivery();

    }


}
