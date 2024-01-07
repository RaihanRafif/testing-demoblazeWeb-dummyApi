package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePage {

    WebDriver driver;

    By homeButton = By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");
    By contactButton = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By signUpButton = By.xpath("//*[@id=\"signin2\"]");

    By loginButton = By.id("login2");
    By aboutUsButton = By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a");
    By cartButton = By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a");

    By phonesButton = By.xpath("//*[@id=\"itemc\"]");
    By laptopsButton = By.xpath("//*[@id=\"itemc\"]");
    By monitorsButton = By.xpath("//*[@id=\"itemc\"]");


    By samsungGalaxyS6Title = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By nokiaLumia1520Title = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a");
    By nexus6Title = By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a");
    By samsungGalaxyS7Title = By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a");
    By iphone632GBTitle = By.xpath("//*[@id=\"tbodyid\"]/div[5]/div/div/h4/a");
    By sonyXperiaZ5Title = By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/div/h4/a");
    By htcOneM9Title = By.xpath("//*[@id=\"tbodyid\"]/div[7]/div/div/h4/a");
    By sonyVaioI5Title = By.xpath("//*[@id=\"tbodyid\"]/div[8]/div/div/h4/a");
    By sonyVaioI7Title = By.xpath("//*[@id=\"tbodyid\"]/div[9]/div/div/h4/a");
    By appleMonitor24Title = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By macBookAirTitle = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a");
    By dellI78GBTitle = By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a");
    By dell156Inch2017Title = By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a");
    By asusFullHDTitle = By.xpath("//*[@id=\"tbodyid\"]/div[5]/div/div/h4/a");
    By macBookProTitle = By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/div/h4/a");

    By nextButtonHomepage = By.id("next2");
    By previousButtonHomepage = By.xpath("//*[@id=\"prev2\"]");

    By addToCartButton = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void userIsOnTheHomePage() {
        driver.get("https://www.demoblaze.com/index.html");
    }

    public void userHomeButton(){
        WebElement element = driver.findElement(homeButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }
    public void userNextButtonHomepage() throws InterruptedException{

//        WebElement elementToDoubleClick = driver.findElement(nextButtonHomepage);
//        Actions actions = new Actions(driver);
//
//        // Lakukan double click pada elemen
//        actions.doubleClick(elementToDoubleClick).perform();

        WebElement element = driver.findElement(nextButtonHomepage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        Thread.sleep(12000);

        WebElement elmnt = driver.findElement(nextButtonHomepage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elmnt);
        elmnt.click();
        Thread.sleep(12000);

//        Thread.sleep(3000);

//        WebElement button = driver.findElement(nextButtonHomepage);
//        button = driver.findElement(nextButtonHomepage);
//        button.click();

//        WebElement nextButtonDef = driver.findElement(nextButtonHomepage);
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", nextButtonDef);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(nextButtonHomepage));
//        nextButton.click();

//        driver.findElement(nextButtonHomepage).click();



    }

    public void userOnTheNextHomepage() {
//        WebElement element = driver.findElement(nextButtonHomepage);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        element.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(previousButtonHomepage));
        productTitle.isDisplayed();
//        WebElement nextButtonDef = driver.findElement(nextButtonHomepage);
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", nextButtonDef);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//        WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(nextButtonHomepage));
//        signUpButton.click();

//        driver.findElement(signUpButton).click();

    }
    public void userClickSignUpButton() {
        WebElement signUpButtonDef = driver.findElement(signUpButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", signUpButtonDef);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//        WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"signin2\"]")));
//        signUpButton.click();
//        driver.findElement(signUpButton).click();

    }

    public void userClickLoginButton() {
        WebElement loginButtonDef = driver.findElement(loginButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", loginButtonDef);
    }

    public void userContactButton() {
        WebElement ContactButtonDef = driver.findElement(contactButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", ContactButtonDef);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//        WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"signin2\"]")));
//        signUpButton.click();
//        driver.findElement(signUpButton).click();

    }

    public void userAboutUsButton() {
        WebElement AboutUsButtonDef = driver.findElement(aboutUsButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", AboutUsButtonDef);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//        WebElement AboutUsButtonDef = wait.until(ExpectedConditions.elementToBeClickable(aboutUsButton));
//        AboutUsButtonDef.click();
//        driver.findElement(aboutUsButton).click();

    }

    public void userCartButton() {
        WebElement AboutUsButtonDef = driver.findElement(cartButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", AboutUsButtonDef);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//        WebElement AboutUsButtonDef = wait.until(ExpectedConditions.elementToBeClickable(aboutUsButton));
//        AboutUsButtonDef.click();
//        driver.findElement(aboutUsButton).click();

    }

    public void samsungGalaxyS6TitleHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(samsungGalaxyS6Title));
        productTitle.isDisplayed();

    }

    public void samsungGalaxyS6Homepage() {
        driver.findElement(samsungGalaxyS6Title).click();
    }

    public void userSeeNokiaLumiaOneFiveTwoZeroOnTheHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(nokiaLumia1520Title));
        productTitle.isDisplayed();
    }


    public void userClickNokiaLumiaOneFiveTwoZeroProduct() {
        driver.findElement(nokiaLumia1520Title).click();
    }

    public void userSeeNexusSixOnTheHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(nexus6Title));
        productTitle.isDisplayed();
    }


    public void userClickNexusSixProduct() {
        driver.findElement(nexus6Title).click();
    }

    public void samsungGalaxyS7TitleHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(samsungGalaxyS7Title));
        productTitle.isDisplayed();

    }

    public void samsungGalaxyS7Homepage() {
        driver.findElement(samsungGalaxyS7Title).click();
    }

    public void iphone632gbTitleHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(iphone632GBTitle));
        productTitle.isDisplayed();

    }

    public void iphone632gbHomepage() {
        driver.findElement(iphone632GBTitle).click();
    }

    public void sonyXperiaZ5TitleHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(sonyXperiaZ5Title));
        productTitle.isDisplayed();

    }

    public void sonyXperiaZ5Homepage() {
        driver.findElement(sonyXperiaZ5Title).click();
    }

    public void htcOneM9TitleHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(htcOneM9Title));
        productTitle.isDisplayed();

    }

    public void htcOneM9Homepage() {
        driver.findElement(htcOneM9Title).click();
    }

    public void sonyVaioI5TitleHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(sonyVaioI5Title));
        productTitle.isDisplayed();

    }

    public void sonyVaioI5Homepage() {

        driver.findElement(sonyVaioI5Title).click();
    }

    public void sonyVaioI7TitleHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(sonyVaioI7Title));
        productTitle.isDisplayed();

    }

    public void sonyVaioI7Homepage() {
        driver.findElement(sonyVaioI7Title).click();
    }

    public void appleMonitor24TitleHomepage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(appleMonitor24Title));
        productTitle.isDisplayed();

    }

    public void appleMonitor24Homepage() {
        driver.findElement(appleMonitor24Title).click();
    }

    public void macBookAirTitleHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(macBookAirTitle));
        productTitle.isDisplayed();

    }

    public void macBookAirHomepage() {
        driver.findElement(macBookAirTitle).click();
    }

    public void dellI78GBTitleHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(dellI78GBTitle));
        productTitle.isDisplayed();

    }

    public void dellI78GBHomepage() {
        driver.findElement(dellI78GBTitle).click();
    }

    public void dell156Inch2017TitleHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(dell156Inch2017Title));
        productTitle.isDisplayed();

    }

    public void dell156Inch2017Homepage() {
        driver.findElement(dell156Inch2017Title).click();
    }

    public void asusFullHDTitleHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(asusFullHDTitle));
        productTitle.isDisplayed();

    }

    public void asusFullHDHomepage() {
        driver.findElement(asusFullHDTitle).click();
    }

    public void macBookProTitleHomepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(macBookProTitle));
        productTitle.isDisplayed();

    }

    public void macBookProHomepage() {
        driver.findElement(macBookProTitle).click();
    }



    public void addToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        usernameInput.click();
    }

    public void userWillSeeTextAlertMessage(String username) {
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

        // Tutup browser setelah menanggapi alert
//        driver.quit();
    }


}

