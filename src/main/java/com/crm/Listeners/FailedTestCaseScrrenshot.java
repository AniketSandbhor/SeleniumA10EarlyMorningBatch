package com.crm.Listeners;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.crm.BaseClass.BaseOrangeHRM;

public class FailedTestCaseScrrenshot extends BaseOrangeHRM implements ITestListener{
  @Override
  public void onTestStart(ITestResult result) {
    String name = result.getMethod().getMethodName();
    Reporter.log(name+" is onTestStart",true);
    
  }

  @Override
  public void onTestSuccess(ITestResult result) {
    String name = result.getMethod().getMethodName();
    Reporter.log(name +" is Success",true);
    
  }

  @Override
  public void onTestFailure(ITestResult result) {
    LocalDateTime date = LocalDateTime.now();
    String time = date.toString().replace(":", "-");
    String name = result.getMethod().getMethodName();
    Reporter.log(name +" is Failure",true);
    TakesScreenshot ts = (TakesScreenshot)driver;
    File from = ts.getScreenshotAs(OutputType.FILE);
    File to = new File("C:\\Users\\Aniket Sandbhor\\eclipse-workspace2\\com.crm.AdvSeleniumA10\\src\\test\\resources\\Screenshots"+name+time+".png");
    try {
      FileHandler.copy(from, to);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void onTestSkipped(ITestResult result) {
    String name = result.getMethod().getMethodName();
    Reporter.log(name+" is Skipped",true);
    
  }

  @Override
  public void onStart(ITestContext context) {
    
    Reporter.log("onStart",true);
  }

  @Override
  public void onFinish(ITestContext context) {
    
    Reporter.log("onFinish",true);
  }

}