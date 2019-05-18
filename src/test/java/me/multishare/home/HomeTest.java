package me.multishare.home;

import io.github.bonigarcia.wdm.WebDriverManager;
import me.multishare.constants.GLOBAL;
import me.multishare.constants.HOME;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static me.multishare.util.Util.*;

public class HomeTest {
    private WebDriver driver;

    @BeforeEach
    public void testSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(GLOBAL.HOST);
    }

    @AfterEach
    public void cleanUp() {
        driver.close();
        driver.quit();
    }

//    @AfterAll
//    public void tearDown() {
//        driver.quit();
//    }

    @Test
    public void HomeSearchTest () {
        WebElement textBox = findBy(driver, HOME.SEARCHBAR_INPUT);
        textBox.sendKeys("Hello");

        WebElement image = waitForBeingLoaded(driver, HOME.MOVIE_THUMB_IMAGE);
        String altText = image.getAttribute("alt");

        Assertions.assertTrue(altText.contains("Hello"));
    }
}
