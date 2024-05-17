package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div/div[2]/div/nav/div/div[2]/div/div/ul/li[8]/a")
    WebElement buildYourBundle;

    @FindBy(id = "search-box")
    WebElement searchField;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/div/div/div[2]/div/div[2]/form/div/div/span/button")
    WebElement searchBtn;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/div/div[1]/div[2]/ul/form[1]/li/a")
    WebElement compareButton;

    public void clickBuildYourBundle(){
        buildYourBundle.click();
    }

    public void sendKeysSearch(String keys){
        searchField.sendKeys(keys);
    }

    public void clickSearchBtn(){
        searchBtn.click();
    }

    public void clickCompareButton(){
        compareButton.click();
    }

}
