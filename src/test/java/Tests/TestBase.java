package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    public WebDriverWait wait;
    JavascriptExecutor executor;

    @BeforeClass
    public void openUrl(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sigma-computer.com/home");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void closeUrl() throws InterruptedException {
        driver.quit();
    }

    @AfterMethod
    public void take_screenShot(ITestResult result) throws IOException {
        if(ITestResult.FAILURE == result.getStatus())
        {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot...");
            TakesScreenshot sc=(TakesScreenshot) driver;
            File photo=sc.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(photo,new File("./screenshots/"+result.getName()+".png"));
        }
    }

    public void scroll(String x , String y){
        executor = (JavascriptExecutor) driver;
        executor.executeScript("scrollBy("+x+","+y+")");
    }
}

