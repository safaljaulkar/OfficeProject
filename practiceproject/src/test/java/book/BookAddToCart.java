package book;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import computer.Computers;
import signinsignup.Login;

//Parent
public class BookAddToCart extends Login {

	@Test
	public void VerifyBookPurchase() {
		
		Computers  dk =new Computers();
	    dk.VerifyLogin();
			
		driver.findElement(By.xpath("//a[normalize-space()='Books']")).click(); // absolute xpath used
        driver.findElement(By.xpath("//*[@class='active']")).click(); // dynamic xpath
	    driver.findElement(By.xpath("//select[@id='products-orderby']")).click();

		WebElement dropdownOption =driver.findElement(By.xpath("//select[@id='products-orderby']")); //locate dropdown element
		Select dropdown =new Select(dropdownOption);   //select Object 
		dropdown.selectByVisibleText("Name: A to Z");  //select by visible text
	
		driver.findElement(By.xpath("(//h2[@class ='product-title'])[3]")).click();
		driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
	 	driver.findElement(By.xpath("//input[@class='qty-input']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-45']")).click();
	
//		String Act = driver.findElement(By.xpath("//p[@class='content']")).getText();
//		String Exp = "The product has been added to your + shopping cart";
//
//		Assert.assertEquals(Act, Exp);

		
	}
}
//a[normalize-space()='Fiction']