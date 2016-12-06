package ru.cain.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by www on 30.11.2016.
 */
public class CatalogTests extends TestBase {

  @Test

  public  void testCategories() {
    app.getNavigationHelper().goToCatalog();
    app.getCatalogHelper().categories();  //проверка категорий - наличие
    int categories = app.getCatalogHelper().getCategoriesCount();
    Assert.assertEquals(categories, 2);    //проверка количества категорий

  }
}
