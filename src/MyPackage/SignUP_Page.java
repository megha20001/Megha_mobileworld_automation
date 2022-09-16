package MyPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import MyPackage2.LandingPage;
public class SignUP_Page {

	@Test

	public void sign() throws InterruptedException {
	    
	   System.setProperty("webdriver.chrome.driver","C:/Users/megha.kulkarni/Downloads/chromedriver_win32/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
	         
	         LandingPage landingpage2 = new LandingPage(driver);
	        
	         landingpage2.goTo();
	         landingpage2.signupapplication("Megha","Kulkarni","Kulkarni@gmail.com","s34//812" ,"01/01/1999","8989674534","Welcome to Qualitest");
	         Thread.sleep(1000);

	       //  landingpage2.signupapplication("Me","Kulkarni","Kulkarni@gmail.com","s34//812" ,"01/01/1999","8989674534","Welcome to Qualitest");
}
}