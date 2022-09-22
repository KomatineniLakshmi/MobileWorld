package page;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact3 {

	WebDriver driver;

	public Contact3(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Support")
	WebElement Support;


	@FindBy(linkText="Contact Us")
	WebElement ContactUs;

	@FindBy(css="input[placeholder='Username']")
	WebElement UserName;

	@FindBy(css="input[placeholder='Email']")
	WebElement email;

	@FindBy(xpath="//input[@placeholder='Phone']")
	WebElement phonee;
	
	@FindBy(css="textarea[placeholder='Message']")
	WebElement message;
	@FindBy(xpath="//input[@value='Send']")
    WebElement send;
	public void clickSupport(){
		Support.click();
	}
	public void clickContactUs(){
		ContactUs.click();
	
	
		Set<String> windows = driver.getWindowHandles(); 
		Iterator<String> it = windows.iterator(); 
		String parentId = (String) it.next(); 
		String childId = (String) it.next(); 
		driver.switchTo().window(childId);
	}
	public void setdetails(String uname,String uemail,String uphone,String umessage) {
	  
		UserName.sendKeys(uname);
		email.sendKeys(uemail);
		phonee.sendKeys(uphone);
		message.sendKeys(umessage);

		}
	public void clicksend() {
		send.click();
	}
		public void move() {
			driver.get("https://mobileworld.banyanpro.com/");
		}

//-------------------------------------------------------------------------------//
               @FindBy(xpath="//*[text()='SIGN IN']")
               WebElement signin;

               @FindBy(css="a[href='signup.html']")
               WebElement signup;

               @FindBy(xpath="//input[@id='myName']")
               WebElement Firstname;

               @FindBy(css="input[placeholder='Last Name']")
               WebElement Lastname;

               @FindBy(css="input[placeholder='Enter Email']")
               WebElement Signupemail;

               @FindBy(css="input[placeholder='Password']")
               WebElement Singuppassword;

               @FindBy(css="input[type='date']")
               WebElement date;

               @FindBy(xpath="//div[@class='col-md-3']/input[@name='gender']")
               WebElement gender;

               @FindBy(css="input[placeholder='91XXXXXXXXXX']")
               WebElement mobile;

               @FindBy(css="textarea[placeholder='Short Bio']")
               WebElement shortbio;

               @FindBy(xpath="//button[normalize-space()='Register']")
               WebElement register;
              
               public void recv() {
       		   driver.get("https://mobileworld.banyanpro.com/");
       	       }
               
               public void signin() {
            	   signin.click();
               }

               public void signup()
               {
            	   signup.click();
               }
               
               public void setinfo(String uname,String ulname,String usemail,String uspass,String udate,String umobile,String ushortbio) {
            		  
            	   Firstname.sendKeys(uname);
            	   Lastname.sendKeys(ulname);
            	   Signupemail.sendKeys(usemail);
            	   Singuppassword.sendKeys(uspass);
            	   date.sendKeys(udate);
            	   gender.click();
           		   mobile.sendKeys(umobile);
           		   shortbio.sendKeys(ushortbio);
               }
               public void  register() {
            	   register.click();
               }
//---------------------------------------------------------------------------------------------------//
               
               @FindBy(xpath="//*[text()='SIGN IN']")
               WebElement Signin;
               
               @FindBy(id="username")
               WebElement Cusername;
               
               @FindBy(id="password")
               WebElement Csigninpassword;
               
               @FindBy(css="a[type='submit']")
               WebElement submit;
               
               public void moveto () {
           		   driver.get("https://mobileworld.banyanpro.com/");
           	       }
               
               public void Signin() {
            	   Signin.click();
               }
               public void form(String cname,String cpass)
               {
            	   Cusername.sendKeys(cname);
            	   Csigninpassword.sendKeys(cpass);
               }
               public void submit() {
            	   submit.click();
               }
}
               