import org.testng.annotations.Test;
import pages.HomePage;
import pages.OrderPage;
import pages.WebOrderHomePage;
import pages.WeborderLoginPage;
import utils.BrowserUtils;

public class WebOrderTest3 extends Hooks {

	@Test
	void testSeleniumWebDriver() throws InterruptedException {
		HomePage homePage = new HomePage();
		homePage.clickOnWeborderLink();
		WeborderLoginPage weborderLoginPage = new WeborderLoginPage();
		weborderLoginPage.login("Inar", "Academy");
		WebOrderHomePage webOrderHomePage = new WebOrderHomePage();
		webOrderHomePage.navigateToOrder();

	}

}
