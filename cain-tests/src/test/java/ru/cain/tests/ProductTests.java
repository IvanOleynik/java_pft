package ru.cain.tests;

import org.testng.annotations.Test;

/**
 * Created by www on 17.11.2016.
 */
public class ProductTests extends TestBase {

  @Test

  public void testProductGrafic() {
    app.getProductHelper().choosingProduct();
    app.getProductHelper().grafikWeek();    //проверка выбора значения (график-неделя)

  }

}
