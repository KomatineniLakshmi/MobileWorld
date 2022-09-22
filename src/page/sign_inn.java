package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sign_inn {
	
	@BeforeMethod
	public void begin() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\komatineni.lakshmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}
	
	@Test(dataProvider="details")
    public void login(String Cusername,String Csigninpassword ){
	WebDriver driver = new ChromeDriver();	
	Contact3 Alexa = new Contact3(driver);
	Alexa.moveto();
	Alexa.Signin();
	Alexa.form(Cusername,Csigninpassword);
	Alexa.submit();

	}
	@Test(dataProvider="details1")
	 public void lessthan3char(String Cusername,String Csigninpassword ){
			WebDriver driver = new ChromeDriver();		
			Contact3 Alexa = new Contact3(driver);
			Alexa.moveto();
			Alexa.Signin();
			Alexa.form(Cusername,Csigninpassword);
			String expected = "error messagege should be displayed";
			Alexa.submit();
			Assert.assertEquals(Cusername,expected);
	}
	@Test(dataProvider="details2")
	 public void morethan20char(String Cusername,String Csigninpassword ){
			WebDriver driver = new ChromeDriver();			
			Contact3 Alexa = new Contact3(driver);
			Alexa.moveto();
			Alexa.Signin();
			Alexa.form(Cusername,Csigninpassword);
			String expected = "error messagege should be displayed";
			Alexa.submit();
			Assert.assertEquals(Cusername,expected);
	}
	@Test
	 public void usernameempty()
	{
			WebDriver driver = new ChromeDriver();		
			Contact3 Alexa = new Contact3(driver);
			Alexa.moveto();
			Alexa.Signin();
			String Cusername = "           ";
			String Csigninpassword ="laks1233";
			String expected = "error messagege should be displayed";
			Alexa.form(Cusername,Csigninpassword);
			Alexa.submit();
			Assert.assertEquals(Cusername,expected);
	}
	@Test
	 public void usernamenumerics()
	{
			WebDriver driver = new ChromeDriver();		
			Contact3 Alexa = new Contact3(driver);
			Alexa.moveto();
			Alexa.Signin();
			String Cusername = "11111111111111";
			String Csigninpassword ="laks123";
			String expected = "error messagege should be displayed";
			Alexa.form(Cusername,Csigninpassword);
			Alexa.submit();
			Assert.assertEquals(Cusername,expected);
	}
	@Test
	 public void username_speacial_char()
	{
			WebDriver driver = new ChromeDriver();		
			Contact3 Alexa = new Contact3(driver);
			Alexa.moveto();
			Alexa.Signin();
			String Cusername = "@@@@@@@@@@@@@@@";
			String Csigninpassword ="laks1233";
			String expected = "error messagege should be displayed";
			Alexa.form(Cusername,Csigninpassword);
			Alexa.submit();
			Assert.assertEquals(Cusername,expected);
	}
	@Test
	 public void passwlessthan3char()
	{
			WebDriver driver = new ChromeDriver();		
			Contact3 Alexa = new Contact3(driver);
			Alexa.moveto();
			Alexa.Signin();
			String Cusername = "lakshmi";
			String Csigninpassword ="la";
			String expected = "error messagege should be displayed";
			Alexa.form(Cusername,Csigninpassword);
			Alexa.submit();
			Assert.assertEquals(Csigninpassword,expected);
	}
	
	@Test
	 public void passmorethan10char()
	{
			WebDriver driver = new ChromeDriver();		
			Contact3 Alexa = new Contact3(driver);
			Alexa.moveto();
			Alexa.Signin();
			String Cusername = "lakshmi";
			String Csigninpassword ="lakshmikoma";
			String expected = "error messagege should be displayed";
			Alexa.form(Cusername,Csigninpassword);
			Alexa.submit();
			Assert.assertEquals(Csigninpassword,expected);
	}
	@Test
	 public void pass_only_numerics()
	{
			WebDriver driver = new ChromeDriver();		
			Contact3 Alexa = new Contact3(driver);
			Alexa.moveto();
			Alexa.Signin();
			String Cusername = "lakshmi";
			String Csigninpassword ="12345678";
			String expected = "error messagege should be displayed";
			Alexa.form(Cusername,Csigninpassword);
			Alexa.submit();
			Assert.assertEquals(Csigninpassword,expected);
	}
	@Test
	 public void pass_only_alpha_char()
	{
			WebDriver driver = new ChromeDriver();		
			Contact3 Alexa = new Contact3(driver);
			Alexa.moveto();
			Alexa.Signin();
			String Cusername = "lakshmi";
			String Csigninpassword ="lakshmi";
			String expected = "error messagege should be displayed";
			Alexa.form(Cusername,Csigninpassword);
			Alexa.submit();
			Assert.assertEquals(Csigninpassword,expected);
	}
	@Test
	 public void pass_emptyinfo()
	{
			WebDriver driver = new ChromeDriver();		
			Contact3 Alexa = new Contact3(driver);
			Alexa.moveto();
			Alexa.Signin();
			String Cusername = "lakshmi";
			String Csigninpassword ="          ";
			String expected = "error messagege should be displayed";
			Alexa.form(Cusername,Csigninpassword);
			Alexa.submit();
			Assert.assertEquals(Csigninpassword,expected);
			
	}
	@Test
	 public void empty_info()
	{
			WebDriver driver = new ChromeDriver();		
			Contact3 Alexa = new Contact3(driver);
			Alexa.moveto();
			Alexa.Signin();
			String Cusername = "            ";
			String Csigninpassword ="          ";
			String expected = "error messagege should be displayed";
			Alexa.form(Cusername,Csigninpassword);
			Alexa.submit();
			Assert.assertEquals(Cusername,Csigninpassword,expected);
			
	}
	@DataProvider(name="details")
	public Object[][] Testcase()
	{
	Object[][] data = new Object[1][2];
	data[0][0]="Lakshmi";
	data[0][1]="lak123";
	return data;
	}
	@DataProvider(name="details1")
	public Object[][] Testcase1()
	{
	Object[][] data1 = new Object[1][2];
	data1[0][0]="La";
	data1[0][1]="lak123";
	return data1;
	}
	@DataProvider(name="details2")
	public Object[][] Testcase2()
	{
	Object[][] data2 = new Object[1][2];
	data2[0][0]="Lakshmiiiiiiiiiiiiiiiiiiiikkkkkkkk";
	data2[0][1]="lak123";
	return data2;
	}
}