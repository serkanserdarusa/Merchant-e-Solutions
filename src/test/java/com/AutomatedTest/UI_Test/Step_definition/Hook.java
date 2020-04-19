package com.AutomatedTest.UI_Test.Step_definition;

import com.AutomatedTest.UI_Test.Utils.ConfigurationReader;
import com.AutomatedTest.UI_Test.Utils.MyDriver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setup() {
        System.out.println("#### setup! start d######\n");
        MyDriver.get().manage().window().maximize();
        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MyDriver.get().get(ConfigurationReader.getProperty("urlUI"));
    }
    @After
    public void teardown(Scenario scenario) {
        //if test failed - do this
        if (scenario.isFailed()) {
            System.out.println("Test failed! Check your ScreenShot");
            byte[] screenshot = ((TakesScreenshot) MyDriver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } else {
            System.out.println("Cleanup!");
            System.out.println("Test completed! Thumbs Up");
        }
        System.out.println("###########-THE END-###################");
        //after every test, we gonna close browser
        MyDriver.close();
    }
}
