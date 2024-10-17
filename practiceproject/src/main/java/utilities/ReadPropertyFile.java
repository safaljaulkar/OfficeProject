package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileReader fr=new FileReader("C:\\Users\\admin\\git\\repository\\practiceproject\\src\\main\\resources\\configfiles\\config.properties");
		Properties p =new Properties(); 
		p.load(fr);
	p.getProperty("browser");
	p.getProperty("testurl");
	

	
	}
	

}
