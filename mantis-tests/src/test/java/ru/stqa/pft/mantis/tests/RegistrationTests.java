package ru.stqa.pft.mantis.tests;

import org.testng.annotations.Test;

/**
 * Created by www on 24.11.2016.
 */
public class RegistrationTests extends TestBase{

  @Test
  public void testRegistration() {
    app.registration().start("user1", "user@localhost.localdomain");
    
  }
}

