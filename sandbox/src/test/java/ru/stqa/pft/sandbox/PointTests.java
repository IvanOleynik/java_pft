package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by www on 19.09.2016.
 */
public class PointTests {

  @Test
  public void testDistance() {
    Point p1 = new Point(2,3);
    //Point p2 = new Point(8,10);
    Assert.assertEquals(p1.distance(), 2.23606797749979);


  }

}
