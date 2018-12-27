package com.testng.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("on test start: " + iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("on test success: " + iTestResult.getName());

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("on test failure: " + iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
