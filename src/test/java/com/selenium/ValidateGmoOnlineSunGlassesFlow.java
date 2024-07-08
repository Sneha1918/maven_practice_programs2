package com.selenium;

import org.testng.annotations.Test;

import com.Utility.Constants;
import com.Utility.Library;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ValidateGmoOnlineSunGlassesFlow extends Library
{
  @Test
  public void ValidateLaunchOfGmoOnlineApplication() 
  {
	  System.out.println("inside ValidateLaunchOfGmoOnlineApplication");
	  driver.get(objProp.getProperty("GmoOnlineAppUrl"));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PageLoadTimeOut));
	  String titleOfGmoOnlineApp = driver.getTitle();
	  Assert.assertEquals(titleOfGmoOnlineApp, objProp.getProperty("TitleOfGmoOnlineHomePage"));
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("inside beforeMethod");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("inside afterMethod");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("inside beforeClass");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("inside afterClass");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("inside beforeTest");
	  LaunchBrowser();
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("inside afterTest"); 
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("inside beforeSuite");
	  try 
	  {
		ReadPropertiesFiles();
	  } catch (IOException e) 
	  	{
		  e.printStackTrace();
	  	}
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("inside afterSuite");
  }

}
