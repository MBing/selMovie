import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // To give a specific version (other than latest stable)
        // WebDriverManager.chromedriver().version("75.0.3770.8").setup();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:3000");
//        driver.get("https://multishare.me/");
        WebElement textBox = driver.findElement(By.name("search"));
        textBox.sendKeys("Hello");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }

        driver.close();
        driver.quit();
    }
}
