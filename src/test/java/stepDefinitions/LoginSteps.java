package stepDefinitions;

import io.cucumber.java.en.*;
import pages.DialogContent;
import utilities.GWD;

public class LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click button")
    public void enterUsernameAndPasswordAndClickButton() {
        dc.sendKeysFunction(dc.username, "Campus25");
        dc.sendKeysFunction(dc.password, "Campus.2524");
        dc.clickFunction(dc.loginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsTextFunction(dc.textTechnoStudy, "Techno Study");
    }
}
