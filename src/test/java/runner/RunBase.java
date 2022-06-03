package runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class RunBase {

    public static WebDriver driver;
    //public enum Browser {CHROME, FIREFOX, EDGE}

    public static WebDriver initDriver() {
        String browser = System.getProperty("browser");

        switch (browser) {
            case "chrome":
                startChrome();
                break;
            case "firefox":
                startFirefox();
                break;
            case "edge":
                startEdge();
                break;
            default:
                startChrome();
        }
        return driver;
    }

    private static void startEdge() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        maximizeDriver();
        waitImplicitly();
    }

    private static void startFirefox() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setAcceptInsecureCerts(true);
        driver = new FirefoxDriver();
        maximizeDriver();
        waitImplicitly();
    }

    private static void startChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        maximizeDriver();
        waitImplicitly();
    }

    private static void maximizeDriver() {
        driver.manage().window().maximize();
    }

    private static void waitImplicitly() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public String getProperties(String nameProperties) throws IOException {
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("src/test/resources/application-local.properties");
        properties.load(file);
        file.close();
        return properties.getProperty(nameProperties);
    }

}