package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Contact1 {
	@BeforeMethod
	public void begin() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\komatineni.lakshmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}
    
	@Test(dataProvider="details")
    public void login(String UserName,String email,String phonee,String message)
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	Assert.assertEquals("https://mobileworld.banyanpro.com/","https://mobileworld.banyanpro.com/");
	}
	
	@Test
    public void username_lessthan3_char()
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	String Expected="proper error meesage should be displayed";
	String UserName="la";
	String email="komatineni@gmail.com";
	String phonee="9618484594 ";
	String message="hello lucky";
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	Assert.assertEquals(UserName, Expected);
	}
	
	@Test
    public void username_morethan_20_char()
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	String Expected="proper error meesage should be displayed";
	String UserName="lakshmikomatinenillllllllllllllll";
	String email="komatineni@gmail.com";
	String phonee="9618484594 ";
	String message="hello lucky";
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	Assert.assertEquals(UserName, Expected);
	}
	
	@Test
    public void username_empty()
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	String Expected="proper error meesage should be displayed";
	String UserName="             ";
	String email="komatineni@gmail.com";
	String phonee="9618484594 ";
	String message="hello lucky";
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	Assert.assertEquals(UserName, Expected);
	}
	
	@Test
    public void username_numerics()
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	String Expected="proper error meesage should be displayed";
	String UserName="111111111111111111";
	String email="komatineni@gmail.com";
	String phonee="9618484594 ";
	String message="hello lucky";
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	Assert.assertEquals(UserName, Expected);
	}
	
	@Test
    public void username_specialchar()
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	String Expected="proper error meesage should be displayed";
	String UserName="@@@@@@@@@@@@@@@";
	String email="komatineni@gmail.com";
	String phonee="9618484594 ";
	String message="hello lucky";
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	Assert.assertEquals(UserName, Expected);
	}
	
	@Test
    public void email_invalid()
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	String Expected="proper error meesage should be displayed";
	String UserName="lakshmikomatineni";
	String email="komatineni@gmail";
	String phonee="9618484594 ";
	String message="hello lucky";
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	Assert.assertEquals(email, Expected);
	}
	
	@Test
    public void email_invalid2()
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	String Expected="proper error meesage should be displayed";
	String UserName="lakshmikomatineni";
	String email="komatineni@mkl";
	String phonee="9618484594 ";
	String message="hello lucky";
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	Assert.assertEquals(email, Expected);
	}
	
	@Test
    public void email_empty()
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	String Expected="proper error meesage should be displayed";
	String UserName="lakshmikomatineni";
	String email="       ";
	String phonee="9618484594 ";
	String message="hello lucky";
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	Assert.assertEquals(email, Expected);
	}
	@Test
    public void phone_num_lessthan_10digit()
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	String Expected="proper error meesage should be displayed";
	String UserName="lakshmikomatineni";
	String email="komatineni@gmail.com";
	String phonee="961848459 ";
	String message="hello lucky";
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	Assert.assertEquals(phonee, Expected);
	}
	@Test
    public void phone_num_morethan_10digit()
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	String Expected="proper error meesage should be displayed";
	String UserName="lakshmikomatineni";
	String email="komatineni@gmail.com";
	String phonee="96184845944 ";
	String message="hello lucky";
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	Assert.assertEquals(phonee, Expected);
	}
	@Test
    public void phone_num_empty()
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	String Expected="proper error meesage should be displayed";
	String UserName="lakshmikomatineni";
	String email="komatineni@gmail.com";
	String phonee="             ";
	String message="hello lucky";
	Cont.setdetails(UserName,email,phonee,message);
	Cont.clicksend();
	Assert.assertEquals(phonee, Expected);
	}
	@Test
    public void message_lessthan_1000char()
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	String Expected="proper error meesage should be displayed";
	String UserName="lakshmikomatineni";
	String email="komatineni@gmail.com";
	String phonee="9618484594 ";
	String message="hellolucky";
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	Assert.assertEquals(message, Expected);
	}
	@Test
    public void message_empty()
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	String Expected="proper error meesage should be displayed";
	String UserName="lakshmikomatineni";
	String email="komatineni@gmail.com";
	String phonee="9618484594 ";
	String message="         ";
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	Assert.assertEquals(message, Expected);
	}
		
	@DataProvider(name="details")
	public Object[][] Testcase()
		{
		Object[][] data = new Object[1][4];
		data[0][0]="lakshmi";
		data[0][1]="komatineni@gmail.com";
		data[0][2]="9618484594";
		data[0][3]="hello";
		return data;
		}
 
}