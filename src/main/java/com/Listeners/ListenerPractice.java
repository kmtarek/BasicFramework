package com.Listeners;

import com.Base.TestBase;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class ListenerPractice extends TestBase implements ITestListener {

public void onTestStart(ITestResult result){

    System.out.println("This start of test ");

}
    public void onTestSuccess(ITestResult result){
        try {
            takePageScreenShot(driver,"OnPass");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void onTestFailure(ITestResult result){

    }

    public void onTestSkipp(ITestResult result){

    }
    public void onFinish(ITestContext context){

    System.out.println("This is END of test :"+context.getPassedTests());
        System.out.println("This is END of test :"+context.getFailedTests());
        System.out.println("This is END of test :"+context.getSkippedTests());
    }
}
