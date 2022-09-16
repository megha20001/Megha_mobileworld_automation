package MyPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import MyPackage2.LandingPage;

public class Sign_InPage {

@Test

public void sign() throws InterruptedException {
    
        System.setProperty("webdriver.chrome.driver","C:/Users/megha.kulkarni/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         //driver.get("https://mobileworld.azurewebsites.net/");
         LandingPage lp = new LandingPage(driver);
         lp.goTo();
         lp.signinapplication("Megha","megha@123");
         
 }
}