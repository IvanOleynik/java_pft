package ru.cain.tests;

import org.testng.annotations.Test;

public class RegaKuk extends TestBase {

  @Test
  public void testRegaKuk() {

    app.getNavigationHelper().goToCatalog();
    app.getProductHelper().choosingProduct();
    app.getBuyHelper().submitBuying();
/*        wd.findElement(By.xpath("//div[@class='app__content']/form/div[1]/div[4]/div[2]/div/span/span/input")).click();
        wd.findElement(By.xpath("//div[@class='app__content']/form/div[1]/div[4]/div[2]/div/span/span/input")).clear();
        wd.findElement(By.xpath("//div[@class='app__content']/form/div[1]/div[4]/div[2]/div/span/span/input")).sendKeys("773600763099");
        wd.findElement(By.cssSelector("span.checkbox__box")).click();
        if (!wd.findElement(By.cssSelector("input.checkbox__control")).isSelected()) {
            wd.findElement(By.cssSelector("input.checkbox__control")).click();
        }
        wd.findElement(By.xpath("//div[@class='registration-form__controls']//button[.='Подтвердить']")).click();
        wd.findElement(By.cssSelector("div.page__content")).click();
        wd.findElement(By.cssSelector("div.footer__inner")).click();*/
  }

}
