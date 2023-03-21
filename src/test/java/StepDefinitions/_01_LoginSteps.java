package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        System.out.println("merhaba 1");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        System.out.println("merhaba 2");
    }

    @Then("user should login successfully")
    public void userShouldLoginSuccessfully() {
        System.out.println("merhaba 3");
    }
}
