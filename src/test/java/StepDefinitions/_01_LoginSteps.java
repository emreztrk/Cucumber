package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {

    DialogContent dc=new DialogContent();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        //System.out.println("merhaba 1");
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();

    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

//        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.visibilityOf(dc.username));
//        dc.username.sendKeys("turkeyts");
//        dc.password.sendKeys("TechnoStudy123");
//        dc.loginButton.click();

//        dc.findAndSend(dc.username, "turkeyts");
//        dc.findAndSend(dc.password, "TechnoStudy123");
//        dc.findAndClick(dc.loginButton);

        // yukardakine de gerek kalmadı encapsulation ile aşağıdaki hala getirdik ve inherit ettik

        dc.sendKeysFunction(dc.username, "turkeyts");
        dc.sendKeysFunction(dc.password, "TechnoStudy123");
        dc.clickFunction(dc.loginButton);
    }
    @Then("user should login successfully")
    public void userShouldLoginSuccessfully() {
       dc.verifyContainsTextFunction(dc.txtTechnoStudy, "Techno Study");
    }
}
