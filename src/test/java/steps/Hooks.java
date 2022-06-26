package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import runner.Driver;

public class Hooks {

    @Before
    public void initDriver() {
        Driver.initDriver();
    }

    @After
    public void closeBrowser() {
        Driver.getDriver().quit();
    }
}
