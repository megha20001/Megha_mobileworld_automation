package MyPackage2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LandingPage {
    
    WebDriver driver;
    
    public LandingPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
 
    //PageFactor
    //SignUp
    @FindBy(xpath="//*[text()='SIGN IN']")
    WebElement signin;
    
    @FindBy(css="a[href='signup.html']")
    WebElement signup;
    
    @FindBy(id="myName")
    WebElement firstname;
    
    @FindBy(css="input[placeholder='Last Name']")
    WebElement lastname;
    
    @FindBy(css="input[placeholder='Enter Email']")
    WebElement email;
    
    @FindBy(css="input[placeholder='Password']")
    WebElement singuppassword;
    
    @FindBy(css="input[type='date']")
    WebElement date;
    
    @FindBy(css="div[class='col-md-3'] input[name='gender']")
    WebElement gender;
    
    @FindBy(css="input[placeholder='91XXXXXXXXXX']")
    WebElement mobile;
    
    @FindBy(css="textarea[placeholder='Short Bio']")
    WebElement shortbio;
    
    @FindBy(xpath="//button[normalize-space()='Register']")
    WebElement register;
    
  //signin
    @FindBy(id="username")
    WebElement username;
    
    @FindBy(id="password")
    WebElement signinpassword;
    
    @FindBy(css="a[type='submit']")
    WebElement submit;
    
  //orders
    @FindBy(xpath="//body/nav[@id='navbar']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mx-auto']/li[4]/a[1]")
    WebElement support;
    
    @FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Order']")
    WebElement Orders;
    
    @FindBy(css ="body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)")
    WebElement Firstname;
    
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)")
    WebElement Lastname;
    
    @FindBy(id = "inputEmail")
    WebElement Email;
    
    @FindBy(id ="inputPassword")
    WebElement Password;
    
    @FindBy(xpath = "//div[normalize-space()='Gender']")
    WebElement Gender;
    
    @FindBy(xpath = "//input[@id='flexRadioDefault1']")
    WebElement Male;
    
    @FindBy(xpath = "//input[@id='flexRadioDefault2']")
    WebElement Female;
    
    @FindBy(css ="input[placeholder='00000000000']")
    WebElement MobileNumber;
    
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(4) > div:nth-child(1) > input:nth-child(2)")
    WebElement Address1;
    
    @FindBy(id = "address2")
    WebElement Address2;
    
    @FindBy(id = "inputCity")
    WebElement City;
    
    @FindBy(xpath ="//select[@id='inputState']")
    WebElement state;
    
    @FindBy(id = "inputZip")
    WebElement Zip;
    
    //@FindBy(xpath = "//legend[@class='col-form-label col-sm-2 pt-0']")
    //WebElement Brand;
    
    @FindBy(xpath = "//input[@rel='apple']")
    WebElement Apple;
    
    @FindBy(xpath = "//input[@rel='samsung']")
    WebElement Samsung;
    
    @FindBy(xpath = "//input[@rel='lenovo']")
    WebElement Lenovo;
    
    @FindBy(xpath = "//label[normalize-space()='Model']")
    WebElement Model;
    
    @FindBy(xpath = "//div[@class='samsung']//option[1]")
    WebElement SamsungS21;
    
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > select:nth-child(1) > option:nth-child(2)")
    WebElement SamsungA13;
    
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > select:nth-child(1) > option:nth-child(3)")
    WebElement SamsungZFLip;
    
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > select:nth-child(1) > option:nth-child(1)")
    WebElement LenovoK13;
    
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > select:nth-child(1) > option:nth-child(2)")
    WebElement LenovoLegion;
    
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > select:nth-child(1) > option:nth-child(3)")
    WebElement Lenovoa8;
    
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(3) > select:nth-child(1) > option:nth-child(1)")
    WebElement AppleXs;
    
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(3) > select:nth-child(1) > option:nth-child(2)")
    WebElement  Apple13;
    
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(3) > select:nth-child(1) > option:nth-child(3)")
    WebElement Apple12;
    
    @FindBy(xpath = "//input[@placeholder='no of mobiles']")
    WebElement count;
    
    @FindBy(xpath = "//select[@id='bought']")
    WebElement bought;
    
    @FindBy(xpath ="//select[@id='bought']")
    WebElement boughtno;
    
    @FindBy(xpath = "//input[@id='time']")
    WebElement times;
    
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(10) > div:nth-child(2) > input:nth-child(1)")
    WebElement Input1;
    
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(11) > div:nth-child(2) > input:nth-child(1)")
    WebElement Input2;
    
    @FindBy(xpath = "//button[normalize-space()='Order Now']")
    WebElement Order;
    
 
    
    
    
    //action
    public void goTo()
    {
        driver.get("https://mobileworld.banyanpro.com/");
    }



   public void signinapplication(String name,String pwd) throws InterruptedException
    {
        signin.click();
        username.sendKeys(name);
        Thread.sleep(1000);
        signinpassword.sendKeys(pwd);
        Thread.sleep(1000);
        submit.click();
    }
    public void signupapplication(String fname,String lname,String mail,String uppwd,String dob,String phone,String bio)
    {
        signin.click();
        signup.click();
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        email.sendKeys(mail);
        singuppassword.sendKeys(uppwd);
        date.sendKeys(dob);
        gender.click();
        mobile.sendKeys(phone);
        shortbio.sendKeys(bio);
        register.click();
    }
    public void orderapplication(String fname,String lname,String eml,String pss,String Mob, String add1,String add2,String ct,String zp,String cnt,String tm) throws InterruptedException
    {
        support.click();
        Orders.click();
         Set windows = driver.getWindowHandles();
        Iterator it = windows.iterator(); String parentId = (String) it.next(); String childId = (String) it.next(); driver.switchTo().window(childId);



       Firstname.sendKeys(fname);
        Thread.sleep(1000);
        Lastname.sendKeys(lname);
        Thread.sleep(1000);
        Email.sendKeys(eml);
        Thread.sleep(1000);
        Password.sendKeys(pss);
        Thread.sleep(1000);
        Female.click();
        Thread.sleep(1000);
        MobileNumber.sendKeys(Mob);
        Thread.sleep(1000);
        Address1.sendKeys(add1);
        Thread.sleep(1000);
        Address2.sendKeys(add2);https://mobileworld.banyanpro.com/
        Thread.sleep(1000);
        City.sendKeys(ct);
        Thread.sleep(1000);
        state.click();
        Thread.sleep(1000);
        Zip.sendKeys(zp);
        Thread.sleep(1000);
        //Brand.sendKeys(br);
        Samsung.click();
        Thread.sleep(1000);
        //Model.sendKeys(md);
        SamsungS21.click();
        count.sendKeys(cnt);
        Thread.sleep(1000);
        bought.click();
        Thread.sleep(1000);
        times.sendKeys(tm);
        Thread.sleep(1000);
        Input1.click();
        Thread.sleep(1000);
        Input2.click();
        Thread.sleep(1000);
        Order.click();
    }
}
    


    	
    

