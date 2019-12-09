package MobileAutomation.MobileAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchingProduct {

	WebDriver driver;

	@Test
	public void searchElement() {
		System.setProperty("webdriver.chrome.driver", "E://Selenium//Selenium_Jars//chromedriver.exe");
		driver = new ChromeDriver();


		// Launch the application		
		driver.get("http://www.ebay.com");
        // setting capability for screen resolution
		driver.setCapability("resolution", "1920x1080");
		
	
		//Search tab
		driver.findElement(By.id("gh-ac-box").sendkeys("
				"65 inch TV ").senkKeys(Keys.Return);

		//Add item in cart
		driver.findElemet("By.class("vi-contv2  lhdr-ie- vi-hd-ops  vi-ds3-global gh-1199").click();

				driver.findElement("By.id("isCartBtn_btn")).click();"
						driver.findElement("By.id("isCheckoutBtn_btn")).click();


								//Purchase item
								driver.findElement(By.linkText("cofirm and pay").click();
								driver.findElement(By.linkText("userID").sendKeys("XXXX");"
								driver.findElement(By.linkText("password").sendKeys("XXXX");
								driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
								Thread.sleep(10000);
								driver.quit();


	}
}
