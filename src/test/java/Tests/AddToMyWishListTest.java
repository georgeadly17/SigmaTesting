package Tests;

import org.example.HomePage;
import org.example.SearchPage;
import org.testng.annotations.Test;

public class AddToMyWishListTest extends TestBase{
    HomePage homePage;
    SearchPage searchPage;

    @Test
    public void addToMyWishList() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.sendKeysSearch("monitors");
        homePage.clickSearchBtn();
        Thread.sleep(5000);

        searchPage = new SearchPage(driver);
        searchPage.clickFirst();

        Thread.sleep(2000);
        searchPage.clickWishListBtn();
        Thread.sleep(2000);
    }
}
