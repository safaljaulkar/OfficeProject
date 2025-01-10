package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.BaseTest;
import locators.AddComputerCartLocator;

public class AddComputerCartAction extends BaseTest {

	AddComputerCartLocator computer = new AddComputerCartLocator();

	public void AddComputer() {

		driver.findElement(By.xpath(computer.Computer)).click();
		driver.findElement(By.xpath(computer.Desktop)).click();

		WebElement DropdownSelect = driver.findElement(By.xpath(computer.OrderBy));
		Select drp = new Select(DropdownSelect);
		drp.selectByVisibleText("Name: A to Z");

		driver.findElement(By.xpath(computer.title)).click();
		driver.findElement(By.xpath(computer.attribute1)).click();
		driver.findElement(By.xpath(computer.attribute2)).click();
		driver.findElement(By.xpath(computer.attribute3)).click();
		driver.findElement(By.xpath(computer.attribute4)).click();
		driver.findElement(By.xpath(computer.attribute5)).clear();
		driver.findElement(By.xpath(computer.quantity)).sendKeys("3");
		driver.findElement(By.xpath(computer.addtocart)).click();

		String Act = driver.findElement(By.xpath(computer.verify)).getText();
		String Exp = "The product has been added to your + shopping cart";
		Assert.assertEquals(Act, Exp);

	}
}
