package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private static final Logger log = LoggerFactory.getLogger(TestListener.class);

    @Override

    public void onTestStart(ITestResult result){
        System.out.printf("Test started %s %n",result.getName());
    }

    @Override

    public void onTestSuccess(ITestResult result) {
        log.info("Тест успешен");
        System.out.printf("Test %s success %n",result.getName());
    }

    @Override

    public void onTestFailure(ITestResult result) {
        log.info("Тест неуспешно");
        System.out.printf("Test %s failed %n",result.getName());
    }

    @Override

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
        log.info("Неудача с таймаутом");
    }
}
