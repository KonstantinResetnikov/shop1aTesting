package shop1aTesting;

import org.junit.jupiter.api.Test;
import shop1aTesting.pages.cartPage;
import shop1aTesting.pages.goodsPage;
import shop1aTesting.pages.homePage;



public class shop1aTestLauncher {
    @Test
    public void shop1aPage(){
      homePage.openBaseUrl();
      homePage.selectCategory();
      goodsPage.ssdDiskSelect();
      goodsPage.goodsPageSort();
      goodsPage.goodsSelect();
      goodsPage.validateItem();
      cartPage.enterEmail("konre93@gmail.com");
      cartPage.fillDelivery("Test","Test2","22222222");

    }


}
