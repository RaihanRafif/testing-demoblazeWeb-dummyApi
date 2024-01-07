package stepdef;

import Pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class Signupstepdef extends BaseTest {

    SignUpPage signUpPage;

    private String generatedUsername;

    @And("user is on Sign Up page")
    public void userIsOnSignUpPage() {
        signUpPage = new SignUpPage(driver);
        signUpPage.userIsOnSignUpPage();
    }


    @When("user input username")
    public void userInputUsername() {
//        generatedUsername = generateRandomUsername();
//
//        signUpPage.inputSignUpUsername();
//        generatedUsername = signUpPage.inputSignUpUsername();
//        signUpPage.inputSignUpUsername();
        generatedUsername = "user_" + RandomStringUtils.randomAlphanumeric(8); // Menghasilkan suatu username acak
        signUpPage.inputSignUpUsername(generatedUsername);
        System.out.println(generatedUsername);
    }

    @And("user input username with the same last username that already been registered \\(for loginPage)")
    public void userInputUsernameWithTheSameLastUsernameThatAlreadyBeenRegisteredForLoginPage() {
        signUpPage.inputLoginUsername(generatedUsername);


    }

    @And("user input username with the same last username that already been registered")
    public void userInputUsernameWithTheSameLastUsernameThatAlreadyBeenRegistered() {

        signUpPage.inputSignUpUsername(generatedUsername);;
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {

        signUpPage.inputSignUpPassword(password);
    }

    @And("user click Sign Up button on the sign up page")
    public void userClickSignUpButtonOnTheSignUpPage() {
        signUpPage.userClickSignUpButtonOnTheSignUpPage();
    }

    @Then("user will see {string}")
    public void userWillSee(String username) {
        signUpPage.userWillSee(username);

    }




    @Then("user will see alert {string}")
    public void userWillSeeAlert(String username) {
        signUpPage.userWillSeeAlert(username);
    }
}
