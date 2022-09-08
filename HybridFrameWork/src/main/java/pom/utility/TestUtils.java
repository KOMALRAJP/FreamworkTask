package pom.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import pom.base.Testbase;

public class TestUtils extends Testbase{

	public TestUtils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static WebDriver driver;
	
		public static void takescreenshot(WebDriver driver){
			try {
				TakesScreenshot shot= (TakesScreenshot)driver;
				File scrFile = shot.getScreenshotAs(OutputType.FILE);
				//String screenshotName;
				FileUtils.copyFile(scrFile, new File("E:\\HybridFrameWork\\screenshot.png"));
				System.out.println("Screenshot taken");
				
			}catch (Exception e) {
				
			}
			
		}
				
}		
	


