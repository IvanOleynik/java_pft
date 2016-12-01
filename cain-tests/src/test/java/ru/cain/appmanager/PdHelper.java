package ru.cain.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.cain.model.PdData;

/**
 * Created by www on 17.11.2016.
 */
public class PdHelper extends HelperBAse {

  public PdHelper(WebDriver wd) {
    super(wd);
  }

  public void fillInnField(PdData pdData) {
    type(By.xpath("//div[@class='app__content']/form/div[1]/div[4]/div[2]/div/span/span/input"), pdData.getInn());
  }

  public void PdConfirm() {
    click(By.cssSelector("span.checkbox__box"));
    if (!wd.findElement(By.cssSelector("input.checkbox__control")).isSelected()) {
      click(By.cssSelector("input.checkbox__control"));
    }
    click(By.xpath("//div[@class='registration-form__controls']//button[.='Подтвердить']"));
  }


}
