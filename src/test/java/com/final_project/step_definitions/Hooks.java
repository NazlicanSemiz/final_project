package com.final_project.step_definitions;

import com.final_project.utilities.BrowserUtils;
import com.final_project.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //import from io.cucumber.java not from junit
    @Before(order =1)
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }

    @Before(value = "@login",order = 2)
    public void setupScenarioForLogins(){
        System.out.println("====Setting up browser using cucumber @Before");
    }

    @Before(value ="@db", order = 0)
    public void setupForDatabaseScenarios(){
        System.out.println("====Setting up browser using cucumber @Before");
    }


    @After
    public void teardowndScenario(Scenario scenario){

        if (scenario.isFailed()){

            byte [] screenshot= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());

        }


        BrowserUtils.sleep(5);
        Driver.closeDriver();

        // System.out.println("====Closing browser using cucumber @After");
        // System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("--------applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("------- applying tearDown using @AfterStep");
    }

}
