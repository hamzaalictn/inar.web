import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrderChromeDriverTest {

	WebDriver driver;

	@BeforeEach
	void setUpTestEnvironment() {
		driver = new ChromeDriver();
	}

	@Test
	void testSeleniumWebDriver() throws InterruptedException {
		driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com");
		String currentUrl = driver.getCurrentUrl();
		assertEquals("https://InarAcademy:Fk160621.@test.inar-academy.com/", currentUrl);
		assertTrue(driver.getPageSource().contains("Inar Academy"));
		assertEquals("Inar Academy", driver.getTitle());
		WebElement webOrderButton = driver.findElement(By.xpath("//*[@id='navbar']/div/a[1]"));
		webOrderButton.click();
		WebElement userNameTextBox = driver.findElement(By.id("login-username-input"));
		userNameTextBox.sendKeys("Inar");
		WebElement passwordTextBox = driver.findElement(By.id("login-password-input"));
		passwordTextBox.sendKeys("Academy");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		Thread.sleep(4000);
		assertEquals("https://InarAcademy:Fk160621.@test.inar-academy.com/weborder", driver.getCurrentUrl());
	}

	@AfterEach
	void tearDownTestEnvironment() throws InterruptedException {
		driver.quit();
	}

}
