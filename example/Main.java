package example;

import java.util.*;

class Main {
  public static void Main() {
    Scanner s = new Scanner(System.in);
    double width = s.nextDouble();
    double height = s.nextDouble();
    System.out.println(Area.calculate(width, height));
    System.out.println(Perimeter.calculate(width, height));
    System.out.println(Diagonal.calculate(width, height));
    System.out.println(Ratio.calculate(width, height));
  }
}