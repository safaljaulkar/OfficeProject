package shoppingcart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import signinsignup.Login;

public class Checkout extends Login{

	
	@Test
	public void VerifyUpdateShoppingCart() {
		
		Checkout product =new Checkout();
		product.VerifyLogin();
		
		driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		
		List<WebElement>list=driver.findElements(By.xpath("//input[@class='qty-input']"));
		for(WebElement w:list) {
			w.clear();
			w.sendKeys("2");
			
			driver.findElement(By.xpath("//input[@class='button-2 update-cart-button']")).click();
			driver.findElement(By.xpath("//input[@class='button-2 continue-shopping-button']")).click();
			
			
			
		}
	}
}
