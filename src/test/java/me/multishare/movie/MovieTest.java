package me.multishare.movie;

import io.github.bonigarcia.wdm.WebDriverManager;
import me.multishare.constants.GLOBAL;
import me.multishare.constants.HOME;
import me.multishare.constants.MOVIE;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static me.multishare.util.Util.*;

public class MovieTest {
    private WebDriver driver;

    @BeforeEach
    public void testSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(GLOBAL.HOST + GLOBAL.MOVIEID);
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
    public void MovieNavigationTest () {
        // TODO: Element is not clickable, Other element would receive the click: <div data-testid="navigation">...
        WebElement homeLink = waitForBeingLoaded(driver, MOVIE.NAVIGATION_HOME);
        homeLink.click();

        WebElement homePage = waitForBeingLoaded(driver, HOME.ROOT);

        Assertions.assertTrue(homePage.isDisplayed());
    }
}
