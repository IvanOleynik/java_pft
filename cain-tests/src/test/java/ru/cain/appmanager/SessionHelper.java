package ru.cain.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by www on 17.11.2016.
 */
public class SessionHelper extends HelperBAse {

  public SessionHelper(WebDriver wd) {
    super(wd);
  }

  public void login(String userLogin, String password) {
    type(By.name("username"), userLogin);
    type(By.name("password"), password);
    click(By.xpath("//div[@class='button-case']//button[.='Войти']"));
  }

  public void initAlfa() {
    if (isElementPresent(By.name("pt1:password_key"))) {
      type(By.id("pt1:password_key::content"), "0000");
      click(By.id("pt1:next_button::button"));
      
    }
  }
}
