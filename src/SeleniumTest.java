import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.sysdigcloud.com/");

        WebElement usernameBox = driver.findElement(By.id("ember1620"));
        usernameBox.sendKeys("prova@gmail.com");
        WebElement passwordBox = driver.findElement(By.id("ember1621"));
        passwordBox.sendKeys("P@assw0rd");

        WebElement confirmButton = driver.findElement(By.id("ember1630"));
        confirmButton.click();
    }
}