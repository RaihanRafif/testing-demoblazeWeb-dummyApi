package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutUsPage {
    WebDriver driver;

    By aboutUsPageSymbol = By.xpath("//*[@id=\"videoModalLabel\"]");
    By videoAboutUsPage = By.xpath("//*[@id=\"example-video_html5_api\"]");

    public AboutUsPage(WebDriver driver){

        this.driver = driver;
    }
    public void userIsOnAboutUsPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement AboutUsSymbolDef = wait.until(ExpectedConditions.elementToBeClickable(aboutUsPageSymbol));
        AboutUsSymbolDef.isDisplayed();
        System.out.println("Is Element Displayed: " + AboutUsSymbolDef);
    }

    public void userCanSeeTheVideo() {
        driver.findElement(videoAboutUsPage).isDisplayed();
    }



}
