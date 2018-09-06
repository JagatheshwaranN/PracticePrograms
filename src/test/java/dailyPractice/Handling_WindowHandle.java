package dailyPractice;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/ECLIPSE%20ENV/WorkSpace/From_Old_WorkSpace/SeleniumBasics/TestResources/Login.html");

		driver.findElement(By.linkText("Sign Up")).click();

		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();

		int BrowserCount = handles.size();
		System.out.println("Total number of browser windows "+BrowserCount);

		// TO change focus to Second Window
		for (String window : handles) {
			if (!window.equals(parent)) {
				driver.switchTo().window(window);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();

	}

}
