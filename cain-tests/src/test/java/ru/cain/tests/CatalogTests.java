package ru.cain.tests;

import org.testng.annotations.Test;

/**
 * Created by www on 30.11.2016.
 */
public class CatalogTests extends TestBase {

  @Test

  public  void testCategories() {
    app.getNavigationHelper().goToCatalog();
    app.getPageHelper().categories();
  }
}