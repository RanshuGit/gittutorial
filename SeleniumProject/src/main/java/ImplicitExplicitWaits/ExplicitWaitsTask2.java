package ImplicitExplicitWaits;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExplicitWaitsTask2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Change Text to Selenium Webdriver
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//button[@id=\"populate-text\"]")).click();
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
		boolean status = element.isDisplayed();
		if(status) {
			System.out.println("Displayed...");
		} else {
			System.out.println("Not Displayed...");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}