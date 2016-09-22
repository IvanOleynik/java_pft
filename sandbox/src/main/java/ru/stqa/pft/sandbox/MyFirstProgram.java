package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Ivan");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());


    Point p1 = new Point(2,3);
    Point p2 = new Point(8,10);
    System.out.println("Расстояние между 2-мя точками A(" + p1.x + ";" + p1.y + ") и Б(" + p2.x + ";" +  p2.y + ") = " + p1.distance(p2)) ;

  }

  public static void hello(String somebody) {
    System.out.println("Hello," + somebody + "!");
  }
  //public static double distance (Point p1, Point p2) {
    //return Math.sqrt((p1.x - p1.y) * (p1.x - p1.y) + (p2.x - p2.y) * (p2.x - p2.y));
  //}

  }


