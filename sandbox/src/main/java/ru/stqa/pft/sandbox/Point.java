package ru.stqa.pft.sandbox;

/**
 * Created by www on 16.09.2016.
 */
public class Point {
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;

  }

  public double sq (){
      return (this.x - this.y)*(this.x - this.y);

  }

}
