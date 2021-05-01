import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.sysdigcloud.com/");

        new WebDriverWait(driver, 20).until(
        webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //WebElement usernameBox = driver.findElement(By.xpath("//input[@id='ember1620']"));
        //usernameBox.sendKeys("prova@gmail.com");
        //WebElement passwordBox = driver.findElement(By.xpath("//input[@id='ember1621']"));
        //passwordBox.sendKeys("P@assw0rd");

        WebElement confirmButton = driver.findElement(By.xpath("//input[@id=\"ember1630\"]"));
        confirmButton.click();
    }
}