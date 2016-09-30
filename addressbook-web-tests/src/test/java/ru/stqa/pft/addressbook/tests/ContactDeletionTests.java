package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {

    app.getNavigationHelper().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoAddNewContact();
      app.getContactHelper().createContact(new ContactData("Иван", "Семенович", "Голопуцков", "golopuc",
              "Свободная Касса", "Петровка, 38", "8(999)3883883", "golopuc@gmail.com", "test1"));
    }
      app.getContactHelper().selectContact();
      app.getContactHelper().deleteSelectedContacts();
      app.getContactHelper().alert();

    }


}