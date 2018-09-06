package dailyPractice;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCode {

	static WebDriver driver;

	public static void main(String ar[]) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		ScreenShotCode.ScreenCapture();
		driver.close();
		System.out.println("Code Completed");

	}

	public static void ScreenCapture() throws IOException {
		File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File(".//src//main//resources//Screen//tesScreen.jpg"));
	}

}