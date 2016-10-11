package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

/**
 * Created by www on 27.09.2016.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoAddNewContact();
      app.getContactHelper().createContact(new ContactData("Иван", "Семенович", "Голопуцков", "golopuc",
              "Свободная Касса", "Петровка, 38", "8(999)3883883", "golopuc@gmail.com", "test1"));
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(before.size() - 1);
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Иван", "Семенович", "Голопуцков", "golopuc", "Свободная Касса",
            "Петровка, 38", "8(999)3883883", "golopuc@gmail.com", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());

  }

}
