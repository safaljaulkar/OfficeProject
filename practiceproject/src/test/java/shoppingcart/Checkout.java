package shoppingcart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.LoginBase;

public class Checkout extends LoginBase {

	@BeforeTest
	public void LoginT() {
		Checkout product = new Checkout();
		product.TestLogin();

	}

	@Test
	public void VerifyUpdateShoppingCart() {
		Checkout product = new Checkout();
		product.TestLogin();

		driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();

		List<WebElement> list = driver.findElements(By.xpath("//input[@class='qty-input']"));
		for (WebElement w : list) {
			w.clear();
			w.sendKeys("2");

			driver.findElement(By.xpath("//input[@class='button-2 update-cart-button']")).click();
			driver.findElement(By.xpath("//input[@class='button-2 continue-shopping-button']")).click();

			product.TestLogout();
		}
	}

	@AfterTest
	public void Logout() {
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
		
	
	}
}
