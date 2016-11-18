package ru.cain.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by www on 17.11.2016.
 */
public class ProductHelper extends HelperBAse {

  public ProductHelper(WebDriver wd) {
    super(wd);
  }

  public void choosingProduct() {
    click(By.xpath("//div[@class='app__content']/div[1]/div[2]/div[2]/div/div/div[1]/a/img"));
  }

  public void grafikWeek() {
    click(By.xpath(".//*[@id='react-app']/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/div[2]/span/label[3]/div/button"));
  }

}

