package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() {
    int before = app.getGroupHelper().getGroupCount();
    app.getNavigationHelper().gotoAddNewContact();
    app.getContactHelper().createContact(new ContactData("Иван", "Семенович", "Голопуцков", "golopuc",
            "Свободная Касса", "Петровка, 38", "8(999)3883883", "golopuc@gmail.com", "test1"));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before +1);


  }

}
