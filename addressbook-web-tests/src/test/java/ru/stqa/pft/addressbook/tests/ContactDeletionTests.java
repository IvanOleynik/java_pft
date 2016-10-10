package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().gotoHomePage();
    int before = app.getContactHelper().getContactCount();
    if (!app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoAddNewContact();
      app.getContactHelper().createContact(new ContactData("Иван", "Семенович", "Голопуцков", "golopuc",
              "Свободная Касса", "Петровка, 38", "8(999)3883883", "golopuc@gmail.com", "test1"));
    }
    app.getContactHelper().selectContact(before - 1);
    app.getContactHelper().deleteSelectedContacts();
    app.getContactHelper().alert();
    app.getNavigationHelper().gotoHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before - 1);

  }


}