package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	public static WebDriver driver; // driver reference

	public static Properties prop = new Properties();
	public static FileReader fr;

	
	@BeforeTest    //annoted method run before  test
	public void setup() throws IOException {

		
//		FileReader fr = new FileReader("C:\\Users\\admin\\git\\repository\\practiceproject\\src\\main\\resources\\configfiles\\config.properties");
//         prop.load(fr); // load the properties reader, object
//		
//		driver = new ChromeDriver();
//		driver.get(prop.getProperty("testurl"));
		
		if (driver == null) {
			FileReader fr = new FileReader("C:\\Users\\admin\\git\\repository\\practiceproject\\src\\main\\resources\\configfiles\\config.properties");
			prop.load(fr); // load the properties reader, object
		}
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));

		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));

		}

	}
@AfterTest 
	public void teardown() { // use to close
		//driver.close();
		System.out.println("Done");

	}

}
	
	
	

