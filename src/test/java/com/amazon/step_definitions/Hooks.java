package com.amazon.step_definitions;

/*
In this class we will be able to pass pre- & post- conditions to
each scenario and each step
 */

import com.amazon.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
        //Driver.getDriver().manage().window().maximize();

    }


    @After
    public void tearDownScenario(Scenario scenario){

        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }

        Driver.closeDriver();

    }

}
