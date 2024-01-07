package stepdef;

import Pages.AboutUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AboutUsStepdef extends BaseTest {

    AboutUsPage aboutUsPage;


    @And("user is on About Us page")
    public void userIsOnAboutUsPage() {
        aboutUsPage = new AboutUsPage(driver);
        aboutUsPage.userIsOnAboutUsPage();
    }

    @Then("user can see the video")
    public void userCanSeeTheVideo() {
        aboutUsPage.userCanSeeTheVideo();

    }

}
