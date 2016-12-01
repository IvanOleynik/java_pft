package ru.cain.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by www on 30.11.2016.
 */
public class PageHelper extends HelperBAse {

  public PageHelper(WebDriver wd) {
    super(wd);
  }
  public void categories() {
    wd.findElement(By.className("stock-grid-category_title"));
    System.out.println(wd.findElement(By.className("stock-grid-category_info")).getText());
  }

}
