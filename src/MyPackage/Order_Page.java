package MyPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import MyPackage2.LandingPage;
@Test
public class Order_Page {

	public void sign() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/megha.kulkarni/Downloads/chromedriver_win32/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       
	       LandingPage OrderNow = new LandingPage(driver);
	       OrderNow.goTo();
	       OrderNow.orderapplication("Megha","Kulkarni","mas123@gmail.com","passcode","9876543219","ho.no11","3rd main","Gulbarga","1123456789","1","2");

}
}