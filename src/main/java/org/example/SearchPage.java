package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div[3]/div/div[1]/div/div[2]/div[2]/h4/a")
    WebElement firstElement;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div[3]/div/div[3]/div/div[2]/div[2]/h4/a")
    WebElement secondElement;

    @FindBy(xpath = "//*[@id=\"button-cart\"]")
    WebElement compareBtn;

    public void clickFirst(){
        firstElement.click();
    }

    public void clickSecond(){
        secondElement.click();
    }

    public void clickCompareBtn(){
        compareBtn.click();
    }
}
