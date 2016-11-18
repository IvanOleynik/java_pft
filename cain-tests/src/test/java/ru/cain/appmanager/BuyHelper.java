package ru.cain.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by www on 17.11.2016.
 */
public class BuyHelper extends  HelperBAse{

  public BuyHelper(WebDriver wd) {
    super(wd);
  }


  public void submitBuying() {
    click(By.xpath(".//*[@id='react-app']/div/div[2]/div/div[3]/div[1]/div[2]/div[2]/button"));
  }

  public void chooseAccount() {
    click(By.xpath("//div[@class='app__content']//button[.='Текущий счёт...9626555 ₽']"));
    click(By.xpath("//div[@class='popup__content']//span[.='...9626']"));
  }

}
