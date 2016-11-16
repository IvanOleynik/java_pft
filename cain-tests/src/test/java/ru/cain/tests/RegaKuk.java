package ru.cain.tests;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class RegaKuk {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "none");
        wd = new FirefoxDriver(capabilities);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://cainft7.alfaintra.net/cain");
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).clear();
        wd.findElement(By.name("username")).sendKeys("7133822");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).clear();
        wd.findElement(By.name("password")).sendKeys("000000");
        wd.findElement(By.xpath("//div[@class='button-case']//button[.='Войти']")).click();
    }
    
    @Test
    public void testRegaKuk() {

        wd.findElement(By.xpath("//div[@class='app__content']/div[1]/div[2]/div[2]/div/div/div[1]/a/img")).click();
        wd.findElement(By.xpath("//div[@class='stock-calc__footer']//button[.='Купить 1 акцию за 44 ₽']")).click();
/*        wd.findElement(By.xpath("//div[@class='app__content']/form/div[1]/div[4]/div[2]/div/span/span/input")).click();
        wd.findElement(By.xpath("//div[@class='app__content']/form/div[1]/div[4]/div[2]/div/span/span/input")).clear();
        wd.findElement(By.xpath("//div[@class='app__content']/form/div[1]/div[4]/div[2]/div/span/span/input")).sendKeys("773600763099");
        wd.findElement(By.cssSelector("span.checkbox__box")).click();
        if (!wd.findElement(By.cssSelector("input.checkbox__control")).isSelected()) {
            wd.findElement(By.cssSelector("input.checkbox__control")).click();
        }
        wd.findElement(By.xpath("//div[@class='registration-form__controls']//button[.='Подтвердить']")).click();
        wd.findElement(By.cssSelector("div.page__content")).click();
        wd.findElement(By.cssSelector("div.footer__inner")).click();*/
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
