package ru.cain.tests;

import org.testng.annotations.Test;
import ru.cain.model.PdData;

public class PokupkaTests extends TestBase {

  @Test
  public void testPokupkaReject() {
    app.getSessionHelper().initAlfa();
    app.getProductHelper().choosingProduct();
    app.getBuyHelper().submitBuying();
    app.getPdHelper().fillInnField(new PdData("773600763099"));
    app.getPdHelper().PdConfirm();
    app.getSmsHelper().smsSubmit();
    app.getSmsHelper().smsInputInnerPI();
    app.getNavigationHelper().confirm();
    app.getSmsHelper().smsSubmit();
    app.getSmsHelper().smsInputInnerPI();
    app.getNavigationHelper().confirm();
    app.getBuyHelper().chooseAccount();
    app.getSmsHelper().smsSubmit();
    app.getSmsHelper().smsInputPokupka();
    app.getNavigationHelper().confirm();
    app.getNavigationHelper().goToPurchases();
    app.getNavigationHelper().goToHistory();
  }


}
