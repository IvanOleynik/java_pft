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

public class PokupkaTests {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "none");
        wd = new FirefoxDriver(capabilities);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://cainft7.alfaintra.net/cain");
    }
    
    @Test
    public void testPokupkaReject() {
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).clear();
        wd.findElement(By.name("username")).sendKeys("2677374");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).clear();
        wd.findElement(By.name("password")).sendKeys("000000");
        wd.findElement(By.xpath("//div[@class='button-case']//button[.='Войти']")).click();
        wd.findElement(By.id("pt1:password_key::content")).click();
        wd.findElement(By.id("pt1:password_key::content")).clear();
        wd.findElement(By.id("pt1:password_key::content")).sendKeys("0000");
        wd.findElement(By.id("pt1:next_button::button")).click();
        wd.findElement(By.xpath("//div[@class='app__content']/div[1]/div[1]/div[2]/div[2]/div/div[1]/a/img")).click();
        wd.findElement(By.xpath("//div[@class='stock-calc__footer']//button[.='Купить 1 акцию за 209 ₽']")).click();
        wd.findElement(By.xpath("//div[@class='app__content']/form/div[1]/div[4]/div[2]/div/span/span/input")).click();
        wd.findElement(By.xpath("//div[@class='app__content']/form/div[1]/div[4]/div[2]/div/span/span/input")).clear();
        wd.findElement(By.xpath("//div[@class='app__content']/form/div[1]/div[4]/div[2]/div/span/span/input")).sendKeys("773600763099");
        wd.findElement(By.cssSelector("span.checkbox__box")).click();
        if (!wd.findElement(By.cssSelector("input.checkbox__control")).isSelected()) {
            wd.findElement(By.cssSelector("input.checkbox__control")).click();
        }
        wd.findElement(By.xpath("//div[@class='registration-form__controls']//button[.='Подтвердить']")).click();
        wd.findElement(By.xpath("//div[@class='sms-confirm__sumbit-box']//button[.='Подтвердить']")).click();
        wd.findElement(By.cssSelector("input.input__control")).click();
        wd.findElement(By.cssSelector("input.input__control")).clear();
        wd.findElement(By.cssSelector("input.input__control")).sendKeys("123456");
        wd.findElement(By.xpath("//span[@class='input__addons-layout']//button[.='Подтвердить']")).click();
        wd.findElement(By.xpath("//div[@class='sms-confirm__sumbit-box']//button[.='Подтвердить']")).click();
        wd.findElement(By.cssSelector("input.input__control")).click();
        wd.findElement(By.cssSelector("input.input__control")).clear();
        wd.findElement(By.cssSelector("input.input__control")).sendKeys("123456");
        wd.findElement(By.xpath("//span[@class='input__addons-layout']//button[.='Подтвердить']")).click();
        wd.findElement(By.xpath("//div[@class='app__content']//button[.='Текущий счёт...9626555 ₽']")).click();
        wd.findElement(By.xpath("//div[@class='popup__content']//span[.='...9626']")).click();
        wd.findElement(By.xpath("//div[@class='sms-confirm__sumbit-box']//button[.='Подтвердить']")).click();
        wd.findElement(By.cssSelector("input.input__control")).click();
        wd.findElement(By.cssSelector("input.input__control")).clear();
        wd.findElement(By.cssSelector("input.input__control")).sendKeys("000000");
        wd.findElement(By.xpath("//span[@class='input__addons-layout']//button[.='Подтвердить']")).click();
        wd.findElement(By.linkText("Мои покупки")).click();
        wd.findElement(By.linkText("История")).click();
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
