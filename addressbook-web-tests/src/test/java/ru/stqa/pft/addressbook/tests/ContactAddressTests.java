package ru.stqa.pft.addressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by www on 20.10.2016.
 */
public class ContactAddressTests extends TestBase {

  @Test

  public  void testContactAdress() {
    app.goTo().homePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData addressInfoFromEditForm = app.contact().infoFromEditForm(contact);

    MatcherAssert.assertThat(contact.getAddress(), CoreMatchers.equalTo(addressInfoFromEditForm.getAddress()));


  }
}
