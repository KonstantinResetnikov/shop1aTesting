package shop1aTesting.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public static ChromeDriver chromeDriver;
    public static void startDriver() {
        String path = "C:\\Users\\Konstantin\\IdeaProjects\\shop1aTest\\src\\test\\resources\\ChromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        chromeDriver = new ChromeDriver();
        new WebDriverWait(chromeDriver, Duration.ofSeconds(10));

    }
}
