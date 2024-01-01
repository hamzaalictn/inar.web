import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.OrderPage;
import pages.WebOrderHomePage;
import pages.WeborderLoginPage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrderChromeDriverTest {

    WebDriver driver;

    @BeforeEach
    void setUpTestEnvironment() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    void testSeleniumWebDriver() throws InterruptedException {
        driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com");
        HomePage homePage = new HomePage(driver);
        WeborderLoginPage weborderLoginPage = homePage.clickOnWeborderLink();
        WebOrderHomePage webOrderHomePage = weborderLoginPage.login("Inar", "Academy");
        OrderPage orderPage = webOrderHomePage.navigateToOrder();
        orderPage.enterProduct("Books", "10", "10");
        orderPage.enterCustomerInfo("Francois", "Main", "NewYork", "NW", "1004");
        orderPage.enterPaymentInformation("visa", "4938281746192845", "11/32");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,1000)");
        Thread.sleep(5000);

        orderPage.clickOnProcessButton();

    }

    @AfterEach
    void tearDownTestEnvironment() {
        if (driver != null)
            driver.quit();
    }

}
