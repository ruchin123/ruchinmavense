package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MainRuchin {

	public static void main(String[] args) {
		bb
				
//				System.setProperty("webdriver.ie.driver","H:/SOFTWARE/SELENIUM/Driver/IEDriverServer.exe");
//				WebDriver driver =new InternetExplorerDriver();
				System.setProperty("webdriver.chrome.driver","H:/SOFTWARE/SELENIUM/Driver/chromedriver.exe");
				
				//Log.startTestCase("Selenium_Test_001");
				
				WebDriver driver =new ChromeDriver();
				//ruchin agarwal
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.get("http://newtours.demoaut.com/");
				driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ruchin123");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("lamar");
				driver.findElement(By.xpath("//input[@name='login']")).click();
				driver.quit();
				System.out.println("hi");
				
				//Log.endTestCase("Selenium_Test_001");

	}

}
