package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildYourBundlePage extends PageBase{
    public BuildYourBundlePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "search-box1")
    WebElement motherBoard;

    @FindBy(id = "search-box2")
    WebElement CPU;

    @FindBy(id = "search-box3")
    WebElement RAM;

    @FindBy(id = "search-box4")
    WebElement SSD;

    @FindBy(id = "search-box5")
    WebElement HDD;

    @FindBy(id = "search-box6")
    WebElement VGA;

    @FindBy(id = "search-box7")
    WebElement CASE;

    @FindBy(id = "search-box12")
    WebElement powerSupply;

    @FindBy(id = "search-box13")
    WebElement pcCooling;

    @FindBy(id = "search-box8")
    WebElement monitors;

    @FindBy(id = "search-box9")
    WebElement headPhone;

    @FindBy(id = "search-box10")
    WebElement keyboard;

    @FindBy(id = "search-box11")
    WebElement mouse;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div/div/div/div/form/input[2]")
    WebElement buyNow;

    public void sendKeysMotherBoard(String keys){
        motherBoard.sendKeys(keys);
    }

    public void sendKeysCPU(String keys){
        CPU.sendKeys(keys);
    }

    public void sendKeysRAM(String keys){
        RAM.sendKeys(keys);
    }

    public void sendKeysSSD(String keys){
        SSD.sendKeys(keys);
    }

    public void sendKeysHDD(String keys){
        HDD.sendKeys(keys);
    }

    public void sendKeysVGA(String keys){
        VGA.sendKeys(keys);
    }

    public void sendKeysCASE(String keys){
        CASE.sendKeys(keys);
    }

    public void sendKeysPowerSupply(String keys){
        powerSupply.sendKeys(keys);
    }

    public void sendKeysPowerPcCooling(String keys){
        pcCooling.sendKeys(keys);
    }

    public void sendKeysMonitor(String keys){
        monitors.sendKeys(keys);
    }

    public void sendKeysPowerHeadphone(String keys){
        headPhone.sendKeys(keys);
    }

    public void sendKeysKeyboard(String keys){
        keyboard.sendKeys(keys);
    }

    public void sendKeysMouse(String keys){
        mouse.sendKeys(keys);
    }

    public void clickBuyNow(){
        buyNow.click();
    }

}
