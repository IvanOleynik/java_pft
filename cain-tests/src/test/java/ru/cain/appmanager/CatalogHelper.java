package ru.cain.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by www on 06.12.2016.
 */
public class CatalogHelper extends HelperBAse {


  public CatalogHelper(WebDriver wd) {
    super(wd);
  }

  public void categories() {
    wd.findElement(By.cssSelector("div.stock-grid-category__info")).getText().equals("Цены указаны за 1 акцию");

  }

  public int getCategoriesCount() {
    return wd.findElements(By.cssSelector("div.stock-grid-category__title")).size();
  }
}
