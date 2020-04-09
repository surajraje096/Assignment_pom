package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {

	//	WebDriver driver = new ChromeDriver();
	//	System.setProperty("webdriver.chrom.driver","D:\\JARs\\chromeSelinium\\finalpath\\chromedriver.exe");
	

	/*WebDriver	driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\JARs\\chromeSelinium\\finalpath\\chromedriver.exe");
		driver.get("https://www.google.com/");
		
*/
		System.setProperty("webdriver.chrome.driver","D:\\Krishna\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("hello");
		
		driver.findElement(By.id("email")).sendKeys("surajraje096@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("suraj@123");
		Thread.sleep(5000);
		driver.findElement(By.id("u_0_2")).click();
		System.out.println("done");
		
		
	}

}
