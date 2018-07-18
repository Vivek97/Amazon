package com.amazon.pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;





public class HomePage {
	
	private static WebDriver driver;
	private String driverPath;
	private WebElement element;
	private String url="http://www.amazon.in";
	
	
	public void InnitializeDriver(String browserName)
	{
		System.out.println("Browser name passed successfully "+browserName);
		
		if(browserName.equalsIgnoreCase("fireFox"))
		{
			System.out.println("----------------------");
			System.out.println("----------------------");
			System.out.println("firefox  launched");
			driver = new FirefoxDriver();
			System.out.println("----------------------");
			System.out.println("----------------------");
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
			driverPath   = "drivers//IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", driverPath);
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.out.println("----------------------");
			System.out.println("----------------------");
			System.out.println("IE  launched");
			driverPath  = "drivers//IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", driverPath);
			DesiredCapabilities capIElocal = DesiredCapabilities.internetExplorer();
            capIElocal.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capIElocal.setCapability("requireWindowFocus", true);
            driver = new InternetExplorerDriver(capIElocal);
            System.out.println("----------------------");
			System.out.println("----------------------");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void navigateToApplication()
	{
		driver.get(url);
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void searchItem(String itemDetail)
	{
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).clear();
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(itemDetail);
		driver.findElement(By.cssSelector("input[value='Go']")).click();
		
	}
	
	public void verifyDropdown(String [] list)
	{
		element = driver.findElement(By.cssSelector("span[text()='Category']"));
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(element).build();
		mouseOverHome.perform();
		
		for(String item: list)
		{   String locator ="span[text()='"+item+"']";
			element = driver.findElement(By.cssSelector(locator));
			
			element.isDisplayed();
		}
	}
	
	
	

}
