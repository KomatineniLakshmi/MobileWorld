package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sign_in{


		@Test(dataProvider="details")
		  public void signin ( String username,String password ) throws InterruptedException
	    {
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\komatineni.lakshmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://mobileworld.banyanpro.com/");
	   driver.manage().window().maximize();
	   driver.findElement(By.linkText("Sign In")).click();
	   driver.findElement(By.id("username")).sendKeys("Lakshmi");
	   driver.findElement(By.name("password")).sendKeys("Laksh1@9");
	   Thread.sleep(2000);
	   driver.findElement(By.linkText("Log In")).click();


		}
		@DataProvider(name="details")
		public Object[][] Testinfo()
		{
			Object[][] data = new Object[5][2];
			data[0][0]="la";
			data[0][1]="LLLLLLLLLLLL"	;
			
			data[1][0]="lakkkkkkkkkkkkkkkkssssssss";
			data[1][1]="1111111111"	;
			
			data[2][0]="      ";
			data[2][1]="@@@@@@@@@@@"	;
			
			data[3][0]="lakshmi";
			data[3][1]="          "	;
			
			data[4][0]="      ";
			data[4][1]="       "	;
			
			return data;
		}
}
