package com.Azure.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Azure.TestBase.AzureTestBase;

public class AzureListner extends AzureTestBase implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) 
	{
		
		System.out.println("Execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		
		System.out.println("Success of test cases and its details are :"+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		
		System.out.println("Failure of test cases and its details are :"+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		System.out.println("Skip of test cases and its details are :"+ result.getName());
	}
	}

	