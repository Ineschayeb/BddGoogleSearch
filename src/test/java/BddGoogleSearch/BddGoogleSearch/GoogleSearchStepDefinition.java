package BddGoogleSearch.BddGoogleSearch;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import Pages_Objets.Home_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchStepDefinition {

	public static WebDriver driver;

	@Given("that I have gone to the Google page")
	public void that_i_have_gone_to_the_google_page() {

		System.setProperty("webdriver.chrome.driver", "D:\\Formation selenium Mouna\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

		driver.manage().window().maximize();
	}

	@When("I add {string} to the search box")
	public void i_add_to_the_search_box(String string) throws InterruptedException {

		Home_page Hp = new Home_page(driver);
		WebElement Box_Search = Hp.Box_Search_ID();
		Box_Search.sendKeys("Publicis Sapient Engineering");
		WebElement Cookies_Accept = Hp.Cookies_Accept_ID();
		Cookies_Accept.click();
	}

	@When("click the Search Button")
	public void click_the_search_button() throws InterruptedException {

		Home_page Hp = new Home_page(driver);

		WebElement Btn_Search = Hp.Btn_Search_ID();

		Btn_Search.click();

	}

	@Then("{string} should be mentioned in the results")
	public void should_be_mentioned_in_the_results(String string) {

		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Publicis Sapient Engineering"));

	}

}
