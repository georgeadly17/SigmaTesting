package Tests;

import org.example.HomePage;
import org.example.SearchPage;
import org.testng.annotations.Test;

public class CompareTest extends TestBase{
    HomePage homePage;
    SearchPage searchPage;

    @Test
    public void compare() throws InterruptedException {
        homePage = new HomePage(driver);

        homePage.sendKeysSearch("monitors");
        homePage.clickSearchBtn();

        Thread.sleep(10000);

        searchPage = new SearchPage(driver);
        searchPage.clickFirst();
        searchPage.clickCompareBtn();

        driver.navigate().back();
        Thread.sleep(10000);

        searchPage.clickSecond();
        Thread.sleep(5000);
        searchPage.clickCompareBtn();

        homePage.clickCompareButton();

        Thread.sleep(30000);
    }
}
