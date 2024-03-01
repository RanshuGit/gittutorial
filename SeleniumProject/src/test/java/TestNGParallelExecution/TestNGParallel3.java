package TestNGParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallel3 {

	WebDriver driver;
	
	@Test(groups="Smoke")
	void testMethod1() {
		System.out.println("Class 3 >> Method1 >> "+Thread.currentThread().getId());
	}
	
	@Test
	void openTwitter() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://twitter.com/");
		System.out.println("Thread ID: "+Thread.currentThread().getId());
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(groups="Regression")
	void testMethod2() {
		System.out.println("Class 3 >> Method2 >> "+Thread.currentThread().getId());
	}
	
	@Test
	void testMethod3() {
		System.out.println("Class 3 >> Method3 >> "+Thread.currentThread().getId());
	}
}
