package Pages_Objets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebElement;

public class Home_page {

	WebDriver driver;

	private By Box_Search = By.xpath("//input[@title='Rechercher']");
	private By Btn_Search = By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]");
	
	//private By Cookies_Accept = By.xpath("//input[@class='tHlp8d']");
	
	private By Cookies_Accept = By.id("zV9nZe");

	public Home_page(WebDriver driver) {
		this.driver=driver;
		
	}

	public WebElement Box_Search_ID() {

		return driver.findElement(Box_Search);
	}

	public WebElement Btn_Search_ID() {

		return driver.findElement(Btn_Search);
	}

	public WebElement Cookies_Accept_ID() {

		return driver.findElement(Cookies_Accept);
	}


	
}
