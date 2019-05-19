import java.util.*;
public class ArrayNew {
  static Random rand = new Random();
  static int pRand(int mod) {
     return Math.abs(rand.nextInt()) % mod + 1;
  }
  public static void main(String[] args) {
     int[] a;
     a = new int[pRand(20)];
     System.out.println(
     "length of a = " + a.length);
     for(int i = 0; i < a.length; i++)
        System.out.println(
        "a[" + i + "] = " + a[i]);	
  }
}