package ru.cain.tests;

import org.testng.annotations.Test;
import ru.cain.model.PdData;

/**
 * Created by www on 30.11.2016.
 */
public class PdCheckTests_AccountCreationFinam_ extends TestBase{

  @Test

  public void testInvalidInn1() {
    app.getNavigationHelper().goToCatalog();  //проверка перехода в "каталог"
    app.getProductHelper().choosingProduct();   //проверка выбора продукта
    app.getBuyHelper().submitBuying();              //проверка кнопки купить
    app.getPdHelper().fillInnField(new PdData("131223565355"));  //проверка поля ИНН (невалидный ИНН)
    app.getPdHelper().PdConfirm();

  }
}
