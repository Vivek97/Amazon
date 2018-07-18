package com.amazon.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.pojo.HomePage;

public class AmazonTest2 {

	HomePage homePage = new HomePage();
	
	
	//@Parameters("myBrowser")
	@BeforeClass
	public void getStart()
	{
		homePage.InnitializeDriver("IE");
		homePage.navigateToApplication();
		
	}
	
	@Test
	public void method21()
	{
		System.out.println("done  21");
	}
	
	@Test
	public void method22()
	{
		System.out.println("done   22");
	}
	
	@Test
	public void method23()
	{
		System.out.println("done   23");
	}
	
	
	
	
	@AfterClass
	public void tearDown()
	{
		homePage.closeBrowser();
	}
	
}
