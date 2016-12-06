package ru.cain.tests;

import org.testng.annotations.Test;
import ru.cain.model.PdData;

public class PokupkaTests extends TestBase {

  @Test
  public void testPokupkaReject() {
    app.getSessionHelper().initAlfa();
    app.getProductHelper().choosingProduct();
    app.getBuyHelper().submitBuying();
    app.getPdHelper().fillInnField(new PdData("773600763099")); //проверка поля ИНН (валидная)
    app.getPdHelper().PdConfirm();     //проверка кнопки "Подтвердить ПД"
    app.getSmsHelper().smsSubmit();    // проверка подтверждения АСП
    app.getSmsHelper().smsInputInnerPI();  //проверка поля ввода СМС (валидная - 123456)
    app.getNavigationHelper().confirm(); // проверка кнопки "подтвердить - универс"
    app.getSmsHelper().smsSubmit();
    app.getSmsHelper().smsInputInnerPI();
    app.getNavigationHelper().confirm();
    app.getBuyHelper().chooseAccount();     //проверка выбора счета
    app.getSmsHelper().smsSubmit();
    app.getSmsHelper().smsInputPokupka();       //проверка СМС покупки (валидная - 000000)
    app.getNavigationHelper().confirm();
    app.getNavigationHelper().goToPurchases();    //проваерка перехода в "Покупки"
    app.getNavigationHelper().goToHistory();     //проверка перехода в "История"
  }


}
