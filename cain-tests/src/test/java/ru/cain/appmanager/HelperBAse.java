package ru.cain.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
    click(locator);
    if (text != null) {
      wd.findElement(locator).clear();
      wd.findElement(locator).sendKeys(text);
    }
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected boolean isElementPresent(By locator) {
    try {
      wd.findElement(locator);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }


}
