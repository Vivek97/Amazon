package com.amazon.test;

import java.time.LocalDateTime;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.pojo.HomePage;

public class AmazonTest1Copy {

	HomePage homePage = new HomePage();
	Logger logger=null;
	
	//@Parameters("myBrowser")
	@BeforeClass
	public void getStart( )
	{
		logger = Logger.getLogger(AmazonTest1Copy.class);
		BasicConfigurator.configure();
		logger.info("Hi");
		homePage.InnitializeDriver("fireFox");
		homePage.navigateToApplication();
		
	}
	
	@Test
	public void method1()
	{
		logger.info("passTest: Test Case Status is passed");
		System.out.println("done  1");
		System.out.println("Time "+LocalDateTime.now());
		homePage.searchItem("mobile");
		System.out.println("Time "+LocalDateTime.now());
		homePage.searchItem("earphone");
		System.out.println("Time "+LocalDateTime.now());
	}
	
	@Test
	public void method2()
	{
		logger.info("failTest: Test Case (failTest) Status is failed");
		System.out.println("done   2");
	}
	
	@Test
	public void method3()
	{
		logger.info("skipTest: Test Case  Status is skipped");
		System.out.println("done   3");
	}
	
	
	
	
	@AfterClass
	public void tearDown()
	{
		homePage.closeBrowser();
	}
	
}
