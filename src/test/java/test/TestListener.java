package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result){
        System.out.printf("Test started %s %n",result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.printf("Test %s success %n",result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.printf("Test %s failed %n",result.getName());
    }
}
