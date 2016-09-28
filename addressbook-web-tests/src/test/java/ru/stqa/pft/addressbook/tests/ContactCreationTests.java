package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() {
        app.getNavigationHelper().goToAddNewContact();
        app.getContactHelper().fillContactForm(new ContactData("Иван", "Семенович", "Голопуцков", "golopuc",
                "Свободная Касса", "Петровка, 38", "8(999)3883883", "golopuc@gmail.com", "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }


}
