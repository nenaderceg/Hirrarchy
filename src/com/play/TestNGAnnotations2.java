package com.play;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotations2 {
  @Test
  public void test1() {
	  System.out.println("Test 1 " + this.getClass().getSimpleName());
  }
  @Test
  public void test2() {
	  System.out.println("Test 2 " + this.getClass().getSimpleName());
  }
  @Test
  public void test3() {
	  System.out.println("Test 3 " + this.getClass().getSimpleName());
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method " + this.getClass().getSimpleName());
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method " + this.getClass().getSimpleName());
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class " + this.getClass().getSimpleName());
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class " + this.getClass().getSimpleName());
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test " + this.getClass().getSimpleName());
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test " + this.getClass().getSimpleName());
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite " + this.getClass().getSimpleName());
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite " + this.getClass().getSimpleName());
  }

}
