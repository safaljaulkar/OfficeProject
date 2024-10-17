package signinsignup;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class Registration extends BaseTest {

	@Test(priority = 1)

	public static void VerifyRegisterWithNewUser() {

		System.out.println("Start Execution");
	
		driver.findElement(By.xpath("//*[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("tom");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("jerry");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Jerry1489@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Jerry@1997");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Jerry@1997");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();

		String Exp = "Your registration completed";
		String Act = driver.findElement(By.xpath("//div[@class='result']")).getText();
		Assert.assertEquals(Exp, Act);

		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();

	}
}
