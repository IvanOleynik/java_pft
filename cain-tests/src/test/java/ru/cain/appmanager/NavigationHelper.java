package ru.cain.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by www on 17.11.2016.
 */
public class NavigationHelper extends HelperBAse {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void goToCatalog() {
    click(By.linkText("Каталог"));
  }

  public void goToHistory() {
    click(By.linkText("История"));
  }

  public void goToPurchases() {
    click(By.linkText("Мои покупки"));
  }

  public void goToServiceAbout() {
    click(By.linkText("О сервисе"));
  }

  public void confirm() {
    click(By.xpath("//span[@class='input__addons-layout']//button[.='Подтвердить']"));
  }

}
