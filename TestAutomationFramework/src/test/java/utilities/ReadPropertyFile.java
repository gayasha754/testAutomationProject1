package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

public static void main(String[] args) throws IOException {
		
		//create object from filereader
		FileReader fr = new FileReader("C:\\Users\\Sashini\\git\\testProject1\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties p = new Properties();
		
		//load the file reader
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testURL"));
		
		
	}
}
