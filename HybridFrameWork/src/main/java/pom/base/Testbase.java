package pom.base;

import java.io.*;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;




public class Testbase  {
	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"E:\\HybridFrameWork\\src\\main\\java\\pom\\TestData\\object.properties");
			prop.load(fis);
		} catch (Exception e) {
		}
	}

	public static void initialization() {
		String browser = prop.getProperty("browser");
		if (browser.equals("CHROME")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "E:\\HybridFrameWork\\Driver\\chromedriver.exe");
			driver = new ChromeDriver(option);
		}
		else if (browser.equals("edge")) {
			EdgeOptions opt = new EdgeOptions();
			opt.addArguments("--disable-notifications");
			System.setProperty("webdriver.edge.driver","E:\\HybridFrameWork\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver(opt);
		}

		
		
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("URL"));
	}

	
	
}
