package testNGFailedTestRerun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FailRerunExample {

	WebDriver driver;
	String baseURL = "https://www.linkedin.com/";

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void verifySingInButtonText() {
		driver.get(baseURL);
		System.out.println("Verify login page test started");
		WebElement element = driver.findElement(By.xpath("//*[contains(@class,'submit-button')]"));
		String SignInText = element.getAttribute("value");
		Assert.assertEquals(SignInText, "Sign in");
		System.out.println("Verify login page test ended");
	}

	@Test(priority = 2)
	public void verifyForgotPasswordText() {
		driver.get(baseURL);
		System.out.println("Verify Forgot password page test started");
		WebElement element1 = driver.findElement(By.xpath("//*[contains(@class,'forgot-password')]"));
		String ForgotPasswordText = element1.getText();
		System.out.println(ForgotPasswordText);
		Assert.assertEquals(ForgotPasswordText, "Wrong text");
		System.out.println("Verify Forgot password page test ended");
	}
}
