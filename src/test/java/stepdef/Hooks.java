package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest{
    @Before("@web")
    public void beforeTest() {
        getDriver();
    }

    @After("@web")
    public void afterTest() {
        driver.quit();
    }
    }
