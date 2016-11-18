package ru.cain.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by www on 17.11.2016.
 */
public class HelperBAse {
  protected WebDriver wd;

  public HelperBAse(WebDriver wd) {
    this.wd = wd;
  }

  protected void type(By locator, String text) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

}
