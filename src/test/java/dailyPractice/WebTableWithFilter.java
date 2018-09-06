package dailyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableWithFilter {

	static WebDriver driver;
	static boolean flag = false;

	public static void main(String ar[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://wet-boew.github.io/v4.0-ci/demos/tables/tables-en.html");

		Thread.sleep(3000);
		WebElement Filter = driver.findElement(By.xpath(".//*[@id='wb-auto-1_filter']//input[@type='search']"));
		Filter.sendKeys("Firefox");
		Thread.sleep(3000);
		String FilterText = driver.findElement(By.xpath(".//*[@id='wb-auto-1_filter']//input[@type='search']"))
				.getAttribute("value");
		System.out.println("FilterText " + FilterText);

		WebElement Table = driver.findElement(By.xpath(".//*[@id='wb-auto-1']/tbody"));

		List<WebElement> allRows = Table.findElements(By.tagName("tr"));

		for (int row = 0; row < allRows.size(); row++) {

			List<WebElement> allRowColumns = allRows.get(row).findElements(By.tagName("td"));

			for (int column = 0; column < allRowColumns.size(); column++) {

				String cellContent = allRowColumns.get(column).getText();

				if (cellContent != null && cellContent.contains(FilterText)) {
					//flag=true;
					System.out.println("Cell content of row number " + row + " and column number " + column + " Is "
							+ cellContent);
				}
			}
		}
		/*if (flag == false) {
			System.out.println(FilterText + " text not found");

		}*/

		driver.close();

	}

}
