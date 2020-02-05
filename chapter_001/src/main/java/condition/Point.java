package condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

 public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
      return sqrt(pow(x2-x1,2) + pow(y2-y1,2));
    }
    public static void main(String[] args) {
      double distance = Math.sqrt(Math.pow(0-0,2) +Math.pow(2-0,2));
      double result = distance (0,0,2,0);
      System.out.println("result (0, 0) to (2, 0) " + result);

    }

}