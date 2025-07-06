package stepDefinitions;

import utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Hooks {
    private static final Logger logger = LoggerFactory.getLogger(Hooks.class);
    @After
    public void after(Scenario scenerio) {
        logger.info("The scenario has finished");

        if (scenerio.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) GWD.getDriver();
            byte[] hafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
            scenerio.attach(hafizadakiHali, "image/png", "screen shot");
        }
        GWD.quitDriver();
    }
}
