package ListWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import signinsignup.Login;

public class ListOfWebElement extends Login  {

	@Test
	
	public void VerifyListOfWebElement() {
		ListOfWebElement list =new ListOfWebElement();
		list.VerifyLogin();
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='top-menu-triangle']"));
	
		
		  for (WebElement test : elements) {
		  test.click();
		
		

	}
	
	}
}
