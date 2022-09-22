package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sign_Up {

	@Test(dataProvider="details")
	public void Com(String firstname,String LastName,String Email,String password,String date,String phone,String message ) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\komatineni.lakshmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.className("btn-warning")).click();
	    driver.findElement(By.linkText("Sign up")).click(); 
	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys(firstname);
	        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LastName);
	        driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys(Email);
	        driver.findElement(By.xpath("//input[@type='Password']")).sendKeys(password);
	        driver.findElement(By.xpath("//input[@type='date']")).sendKeys(date);
	        driver.findElement(By.xpath("//input[@type='radio']")).click();
	        driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[3]/div[4]/input")).click();
	        driver.findElement(By.xpath("//input[@min='0']")).sendKeys(phone);
			driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys(message);
	        driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
	        driver.switchTo().alert().accept();
	        Thread.sleep(3000);
            driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
            driver.quit();
	     }
	@DataProvider(name="details")
	public Object[][] Testcase()
	{
	return new Object[][] {{"ko","laksmi","lucky@gmail.com","lakhm123i","11/11/1999","9618484594","luncky hello"},
		{"komatittttttttttttnEEDDD","laksmi","lucky@gmail.com","12lakhmi","11/11/1999","9618484594","luncky hello"},
		{"@@@@@@@@@@@@@@@@","laksmi","lucky@gmail.com","la12khmi","11/11/1999","9618484594","luncky hello"},
		{"1111111111111111","laksmi","lucky@gmail.com","12lakhmi","11/11/1999","9618484594","luncky hello"},
		{"       ","laksmi","lucky@gmail.com","lakhmi12","11/11/1999","9618484594","luncky hello"},
		{"komatineni","la","lucky@gmail.com","lakhm12i","11/11/1999","9618484594","luncky hello"},
		{"komatinei","laksmiiiiiiiiiiiiiiiii","lucky@gmail.com","l12akhmi","11/11/1999","9618484594","luncky hello"},
		{"komatinei","###############","lucky@gmail.com","la12khmi","11/11/1999","9618484594","luncky hello"},
		{"komatinei","111111111111111","lucky@gmail.com","lakh12mi","11/11/1999","9618484594","luncky hello"},
		{"komatinei","             ","lucky@gmail.com","la12khmi","11/11/1999","9618484594","luncky hello"},
		{"komatinei","laksmii","lucky@gmail","lakhmi12","11/11/1999","9618484594","luncky hello"},
		{"komatinei","lakshmi","lucky@mnl","lakh12mi","11/11/1999","9618484594","luncky hello"},
		{"komatinei","lakshmi","LUcky@gmil.com","lakhm12i","11/11/1999","9618484594","luncky hello"},
		{"komatinei","lakshmi","lucky@gmail.com","123456777","11/11/1999","9618484594","luncky hello"},
		{"komatinei","lakshmi","lucky@gmail.com","lakhmiiiii","11/11/1999","9618484594","luncky hello"},
		{"komatinei","laksmii","lucky@gmail.com","lakhmi123","          ","9618484594","luncky hello"},
		{"komatinei","laksmii","lucky@gmail.com","lakhmi123","11/11/1999","961484594","luncky hello"},
		{"komatinei","laksmii","lucky@gmail.com","lakhmi123","11/11/1999","96188484594","luncky hello"},
		{"komatinei","laksmii","lucky@gmail.com","lakhmi123","11/11/1999","             ","luncky hello"},
		{"komatinei","laksmii","lucky@gmail.com","lakhmi123","11/11/1999","9618484594"," lucky hello"},
		{"komatinei","laksmii","lucky@gmail.com","lakhmi123","11/11/1999","9618484594","         "}};
	}
}