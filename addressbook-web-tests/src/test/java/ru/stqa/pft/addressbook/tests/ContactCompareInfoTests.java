package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by www on 21.10.2016.
 */
public class ContactCompareInfoTests extends TestBase {

  @Test

  public void testContactCompareInfo() {
    app.goTo().homePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromInfoForm = app.contact().infoFromInfoForm(contact);
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

    assertThat(cleaned(contactInfoFromInfoForm.getAllInfo()), equalTo(mergeInfo(contactInfoFromEditForm)));
  }

  private String mergeInfo(ContactData contact) {
    return Arrays.asList(
            contact.getFirstname() + " " + contact.getLastname(),
            contact.getAddress(),
            contact.getHomePhone(), contact.getMobilePhone(), contact.getWorkPhone(),
            contact.getEmail(), contact.getEmail2(), contact.getEmail3())
            .stream().filter((s) -> ! s.equals(""))
            .map(ContactCompareInfoTests::cleaned)
            .collect(Collectors.joining(""));
  }


  public static String cleaned(String allInfo) {
    return allInfo.replaceAll("H:", "").replaceAll("W:", "").replaceAll("www.gmail.com", "")
            .replaceAll("\\s","").replaceAll("[-()]", "");
  }


}
