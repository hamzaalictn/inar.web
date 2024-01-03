import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.OrderPage;
import pages.WebOrderHomePage;
import pages.WeborderLoginPage;
import utils.BrowserUtils;

public class WebOrderTest1 extends Hooks {

	@Test
	void testSeleniumWebDriver() throws InterruptedException {
		HomePage homePage = new HomePage();
		homePage.clickOnWeborderLink();
		WeborderLoginPage weborderLoginPage = new WeborderLoginPage();
		weborderLoginPage.login("Inar", "Academy");
		WebOrderHomePage webOrderHomePage = new WebOrderHomePage();
		webOrderHomePage.navigateToOrder();
		OrderPage orderPage = new OrderPage();
		orderPage.enterProduct("Books", "10", "10");
		orderPage.enterCustomerInfo("Francois", "Main", "NewYork", "NW", "1004");
		orderPage.enterPaymentInformation("visa", "4938281746192845", "11/32");
		BrowserUtils.scrollDown();
		Thread.sleep(1000);
		orderPage.clickOnProcessButton();

	}

}
