package book;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


//child
public class EmailFriend extends BookAddToCart {
	// child //parent

	@Test
	public void Email() {

		EmailFriend obj = new EmailFriend();
		obj.VerifyBookPurchase();
		
		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
		driver.findElement(By.xpath("//input[@id='FriendEmail']")).sendKeys("jaulkarsafal28@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='PersonalMessage']")).sendKeys("Hii Rahul");
		driver.findElement(By.xpath("//input[@class='button-1 send-email-a-friend-button']")).click();

//		String Act = driver.findElement(By.xpath("//div[@class='result']")).getText();
//		String Exp = "Your message has been sent.";
//		Assert.assertEquals(Act, Exp);

	}

}
