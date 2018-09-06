package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTip {

	public static WebDriver driver;

	public static void main(String ar[]) throws InterruptedException {
		toolTipWithoutActions();
		toolTipWithActions();
	}

	public static void toolTipWithoutActions() throws InterruptedException {
		String baseURL = "http://docs.seleniumhq.org";
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);

		WebElement toolTip = driver.findElement(By.xpath(".//*[@id='menu_projects']/a"));
		String toopTipText = toolTip.getAttribute("title");
		System.out.println("ToolTip Text " + toopTipText);
		Thread.sleep(2000);
		driver.close();
	}

	public static void toolTipWithActions() throws InterruptedException {
		String baseURL = "https://jqueryui.com/tooltip/";
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		WebElement input = driver.findElement(By.cssSelector("#age"));
		Actions action = new Actions(driver);
		action.moveToElement(input).build().perform();
		WebElement toolTip = driver.findElement(By.cssSelector(".ui-tooltip-content"));

		String toopTipText = toolTip.getText();
		System.out.println("ToolTip Text " + toopTipText);
		Thread.sleep(2000);
		driver.close();
	}
}
