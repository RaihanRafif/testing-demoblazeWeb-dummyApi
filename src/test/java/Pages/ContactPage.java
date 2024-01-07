package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ContactPage {
    WebDriver driver;

    By validateContactPage = By.xpath("//*//*[@id=\"exampleModalLabel\"]");
    By inputFormContactEmail = By.xpath("//*[@id=\"recipient-email\"]");
    By inputFormContactName = By.xpath("//*[@id=\"recipient-name\"]");
    By inputFormContactMessage = By.xpath("//*[@id=\"message-text\"]");
    By sendMessageContactPageButton = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");


    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userIsOnContactPage() {
        driver.findElement(validateContactPage);
    }

    public void inputContactEmail(String generatedUsername) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement contactEmailInput = wait.until(ExpectedConditions.elementToBeClickable(inputFormContactEmail));
        contactEmailInput.sendKeys(generatedUsername);
    }

    public void inputContactName(String generatedUsername) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(inputFormContactName));
        usernameInput.sendKeys(generatedUsername);
    }

    public void inputMessage(String generatedUsername) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(inputFormContactMessage));
        usernameInput.sendKeys(generatedUsername);
    }

    public void userSendMessageButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Tunggu hingga tombol Sign Up benar-benar dapat diinteraksi
        WebElement sendMessageButton = wait.until(ExpectedConditions.elementToBeClickable(sendMessageContactPageButton));

        Actions actions = new Actions(driver);
        actions.moveToElement(sendMessageButton).perform();
        // Klik tombol Send Message
        sendMessageButton.click();
//        WebElement signUpButton = driver.findElement(By.cssSelector("button[onclick='register()']"));
//        signUpButton.click();
    }

    public void userWillSeeMessage(String username) {
        try {
            // Tunggu hingga alert muncul dengan waktu maksimal 10 detik
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());

            // Tangkap alert
            Alert alert = driver.switchTo().alert();

            // Tampilkan teks alert
            System.out.println("Alert Text: " + alert.getText());
            assertEquals(alert.getText(), username, "pesan sesuai");
            // Terima alert
            alert.accept();
        } catch (NoAlertPresentException e) {
            // Tidak ada alert yang muncul
            System.out.println("No alert present.");
        }


    }

}
