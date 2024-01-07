package stepdef;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Homestepdef extends BaseTest {

    HomePage homePage;

    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        homePage = new HomePage(driver);
        homePage.userIsOnTheHomePage();
    }

    @And("user click Sign Up button")
    public void userClickSignUpButton() {
        homePage.userClickSignUpButton();
    }

    @And("user click Login button")
    public void userClickLoginButton() {
        homePage.userClickLoginButton();
        
    }


    @And("user click Contact button")
    public void userClickContactButton() {
        homePage.userContactButton();
    }

    @When("user click About Us button")
    public void userClickAboutUsButton() {
        homePage.userAboutUsButton();
    }

    @And("user see Samsung galaxy s\\(six) on the Homepage")
    public void userSeeSamsungGalaxySSixOnTheHomepage() {
        homePage.samsungGalaxyS6TitleHomepage();
    }

    @When("user click Samsung galaxy s\\(six) product")
    public void userClickSamsungGalaxySSixProduct() {
        homePage.samsungGalaxyS6Homepage();
    }

    @And("user click Add to cart")
    public void userClickAddToCart() {
        homePage.addToCart();
        
    }

    @And("user will see text alert message {string}")
    public void userWillSeeTextAlertMessage(String username) {
        homePage.userWillSeeTextAlertMessage(username);
    }

    @And("user click Cart button")
    public void userClickCartButton() {
        homePage.userCartButton();
    }


    @And("user see Nokia lumia\\(OneFiveTwoZero) on the Homepage")
    public void userSeeNokiaLumiaOneFiveTwoZeroOnTheHomepage() {
        homePage.userSeeNokiaLumiaOneFiveTwoZeroOnTheHomepage();
        
    }

    @When("user click Nokia lumia\\(OneFiveTwoZero) product")
    public void userClickNokiaLumiaOneFiveTwoZeroProduct() {
        homePage.userClickNokiaLumiaOneFiveTwoZeroProduct();
    }

    @And("user see  Nexus s\\(six) on the Homepage")
    public void userSeeSamsungNexusSSixOnTheHomepage() {
        homePage.userSeeNexusSixOnTheHomepage();
        
    }

    @When("user click  Nexus s\\(six) product")
    public void userClickSamsungNexusSSixProduct() {
        homePage.userClickNexusSixProduct();
    }

    @And("user see Samsung galaxy s\\(seven) on the Homepage")
    public void userSeeSamsungGalaxySSevenOnTheHomepage() {
        homePage.samsungGalaxyS7TitleHomepage();
        
    }

    @When("user click Samsung galaxy s\\(seven) product")
    public void userClickSamsungGalaxySSevenProduct() {
        homePage.samsungGalaxyS7Homepage();
    }

    @And("user see Iphone \\(six) \\(ThirtyTwo) gb on the Homepage")
    public void userSeeIphoneSixThirtyTwoGbOnTheHomepage() {
        homePage.iphone632gbTitleHomepage();
        
    }

    @When("user click Iphone \\(six) \\(ThirtyTwo) gb product")
    public void userClickIphoneSixThirtyTwoGbProduct() {
        homePage.iphone632gbHomepage();
    }

    @And("user see Sony xperia z\\(five) on the Homepage")
    public void userSeeSonyXperiaZFiveOnTheHomepage() {
        homePage.sonyXperiaZ5TitleHomepage();
        
    }

    @When("user click Sony xperia z\\(five) product")
    public void userClickSonyXperiaZFiveProduct() {
        homePage.sonyXperiaZ5Homepage();
    }

    @And("user see HTC One M\\(Nine) on the Homepage")
    public void userSeeHTCOneMNineOnTheHomepage() {
        homePage.htcOneM9TitleHomepage();

    }

    @When("user click HTC One M\\(Nine) product")
    public void userClickHTCOneMNineProduct() {
        homePage.htcOneM9Homepage();

    }

    @And("user see Sony vaio i\\(Five) on the Homepage")
    public void userSeeSonyVaioIFiveOnTheHomepage() {
        homePage.sonyVaioI5TitleHomepage();

    }

    @When("user click Sony vaio i\\(Five) product")
    public void userClickSonyVaioIFiveProduct() {
        homePage.sonyVaioI5Homepage();

    }

    @And("user see Sony vaio i\\(Seven) on the Homepage")
    public void userSeeSonyVaioISevenOnTheHomepage() {
        homePage.sonyVaioI7TitleHomepage();

    }

    @When("user click Sony vaio i\\(Seven) product")
    public void userClickSonyVaioISevenProduct() {
        homePage.sonyVaioI7Homepage();
    }

    @And("user click next button on the Homepage")
    public void userClickNextButtonOnTheHomepage() throws InterruptedException{
        homePage.userNextButtonHomepage();
//        Thread.sleep(10000);

    }

    @And("user is on the next home page")
    public void userIsOnTheNextHomePage() {
        homePage = new HomePage(driver);
        homePage.userOnTheNextHomepage();

    }

    @And("user see Apple monitor \\(TwentyFour) on the Homepage")
    public void userSeeAppleMonitorTwentyFourOnTheHomepage() {
        homePage = new HomePage(driver);
        homePage.appleMonitor24TitleHomepage();
        
    }

    @When("user click Apple monitor \\(TwentyFour) product")
    public void userClickAppleMonitorTwentyFourProduct() {
        homePage.appleMonitor24Homepage();
    }

    @And("user see MacBook air on the Homepage")
    public void userSeeMacBookAirOnTheHomepage() {
        homePage.macBookAirTitleHomepage();
    }

    @When("user click MacBook air product")
    public void userClickMacBookAirProduct() {
        homePage.macBookAirHomepage();
    }

    @And("user see Dell i\\(Seven) \\(Eight)gb on the Homepage")
    public void userSeeDellISevenEightGbOnTheHomepage() {
        homePage.dellI78GBTitleHomepage();
    }

    @When("user click Dell i\\(Seven) \\(Eight)gb product")
    public void userClickDellISevenEightGbProduct() {
        homePage.dellI78GBHomepage();
    }

    @And("user see \\(Twenty Seventeen) Dell \\(Five point Six) gb on the Homepage")
    public void userSeeTwentySeventeenDellFivePointSixGbOnTheHomepage() {
        homePage.dell156Inch2017TitleHomepage();
    }

    @When("user click \\(Twenty Seventeen) Dell \\(Five point Six) gb product")
    public void userClickTwentySeventeenDellFivePointSixGbProduct() {
        homePage.dell156Inch2017Homepage();
    }

    @And("user see ASUS Full HD on the Homepage")
    public void userSeeASUSFullHDOnTheHomepage() {
        homePage.asusFullHDTitleHomepage();
    }

    @When("user click ASUS Full HD product")
    public void userClickASUSFullHDProduct() {
        homePage.asusFullHDHomepage();
    }

    @And("user see MacBook Pro on the Homepage")
    public void userSeeMacBookProOnTheHomepage() {
        homePage.macBookProTitleHomepage();
    }

    @When("user click MacBook Pro product")
    public void userClickMacBookProProduct() {
        homePage.macBookProHomepage();
    }


    @And("user click Home button")
    public void userClickHomeButton() {
        homePage.userHomeButton();

    }
}
