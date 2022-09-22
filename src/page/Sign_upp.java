package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sign_upp {
	@BeforeMethod
	public void begin() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\komatineni.lakshmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

	@Test(dataProvider="details")
    public void register(String Firstname,String Lastname,String Signupemail,String Signuppassword ,String date,String mobile,String shortbio)
	{
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	}
	
	@Test()
    public void Firstname_lessthan_3char()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "ko";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail.com";
	String Signuppassword = "laks456";
	String date = "11/09/2001";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Firstname, Expected);
	}
	
	@Test()
    public void Firstname_morethan_20char()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatinenilakshmiiiiiiiiii";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail.com";
	String Signuppassword = "laks456";
	String date = "11/09/2001";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Firstname, Expected);
	}
	
	@Test()
    public void Firstname_contain_numerics()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "laks1111111111";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail.com";
	String Signuppassword = "laks456";
	String date = "11/09/2001";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Firstname, Expected);
	}
	
	@Test()
    public void Firstname_contain_specialchar()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "koma@@@@@@@@@";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail.com";
	String Signuppassword = "laks456";
	String date = "11/09/2001";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Firstname, Expected);
	}
	
	@Test()
    public void Firstname_empty()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "            ";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail.com";
	String Signuppassword = "laks456";
	String date = "11/09/2001";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Firstname, Expected);
	}
	
	@Test()
    public void Lastname_lessthan_3char()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "la";
	String Signupemail = "komatineni@gmail.com";
	String Signuppassword = "laks456";
	String date = "11/09/2001";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Lastname, Expected);
	}
	
	@Test()
    public void Lastname_morethan_20char()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "lakshmikomatineniiiiiiiiiiiii";
	String Signupemail = "komatineni@gmail.com";
	String Signuppassword = "laks456";
	String date = "11/11/1999";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Lastname, Expected);
    }
	
	@Test()
    public void Lastname_contain_specialchar()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "laks@@@@@@@";
	String Signupemail = "komatineni@gmail.com";
	String Signuppassword = "laks456";
	String date = "11/11/1999";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Lastname, Expected);
    }
	
	@Test()
    public void Lastname_empty()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "                 ";
	String Signupemail = "komatineni@gmail.com";
	String Signuppassword = "laks456";
	String date = "11/11/1999";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Lastname, Expected);
    }
	
	@Test()
    public void email_invalid_info1()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail";
	String Signuppassword = "laks456";
	String date = "11/11/1999";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Signupemail, Expected);
    }
	
	@Test()
    public void email1_invalid_info()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@mnk";
	String Signuppassword = "laks456";
	String date = "11/11/1999";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Signupemail, Expected);
    }
	
	@Test()
    public void email_address_empty()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "lakshmi";
	String Signupemail = "               ";
	String Signuppassword = "laks456";
	String date = "11/11/1999";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Signupemail, Expected);
    }
	
	@Test()
    public void pass_lessthan_3char()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail";
	String Signuppassword = "la";
	String date = "11/11/1999";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Signuppassword, Expected);
    }
	
	@Test()
    public void pass_morethan_10_char()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail";
	String Signuppassword = "lakshmikomati";
	String date = "11/11/1999";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Signuppassword, Expected);
    }
	
	@Test()
    public void pass_contain_alphachar()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail";
	String Signuppassword = "lakshmikom";
	String date = "11/11/1999";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Signuppassword, Expected);
    }
	
	@Test()
    public void pass_be_empty()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail";
	String Signuppassword = "            ";
	String date = "11/11/1999";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(Signuppassword, Expected);
    }
	
	@Test()
    public void date_empty()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail";
	String Signuppassword = "la";
	String date = "       ";
	String mobile = "9618484594";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(date, Expected);
    }
	
	@Test()
    public void num_lessthan_10digit()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail";
	String Signuppassword = "la";
	String date = "11/11/1999";
	String mobile = "961848459";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(mobile, Expected);
    }
	
	@Test()
    public void num_morethan_10digit()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail";
	String Signuppassword = "la";
	String date = "11/11/1999";
	String mobile = "96184845944";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(mobile, Expected);
    }
	
	@Test()
    public void num_be_empty()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail";
	String Signuppassword = "la";
	String date = "11/11/1999";
	String mobile = "            ";
	String shortbio = "lucky hello";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(mobile, Expected);
    }
	
	@Test()
    public void shortbio_empty()
    {
	WebDriver driver = new ChromeDriver();	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	String Expected = "Proper error message should be displayed";
	String Firstname = "komatineni";
	String Lastname = "lakshmi";
	String Signupemail = "komatineni@gmail";
	String Signuppassword = "la";
	String date = "11/11/1999";
	String mobile = "961848459";
	String shortbio = "          ";
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	Assert.assertEquals(shortbio, Expected);
    }
	
	
	@DataProvider(name="details")
	public Object[][] Testcase()
	{
	Object[][] data = new Object[1][7];
	data[0][0]="komatineni";
	data[0][1]="lakshmi";
	data[0][2]="lucky@gmail.com";
	data[0][3]="lakhm123i";
	data[0][4]="11/11/1999";
	data[0][5]="9618484594";
	data[0][6]="luncky hello";
	return data;
	}
}