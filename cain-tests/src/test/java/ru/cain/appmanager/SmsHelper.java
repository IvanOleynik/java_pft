package ru.cain.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by www on 17.11.2016.
 */
public class SmsHelper extends HelperBAse{

  public SmsHelper(WebDriver wd) {
    super(wd);
  }

  public void smsInputPokupka() {
    type(By.cssSelector("input.input__control"), "000000");
  }

  public void smsSubmit() {
    click(By.xpath("//div[@class='sms-confirm__sumbit-box']//button[.='Подтвердить']"));
  }

  public void smsInputInnerPI() {
    type(By.cssSelector("input.input__control"), "123456");
  }
}
