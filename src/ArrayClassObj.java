import java.util.*;
public class ArrayClassObj{
   static Random rand = new Random(); // clase tipo random para generar aleatorio
   static int pRand(int mod) {  //método para generar un número aleatorio a partir de un número
      return Math.abs(rand.nextInt()) % mod + 1;
   }
   public static void main(String[] args){
      Integer[] a = new Integer[pRand(20)]; //crea array de referencias
      System.out.println("length of a = " + a.length); //impreime el tamaño del array de referencias
      for(int i = 0; i < a.length; i++) {
         a[i] = new Integer(pRand(500)); //por cada referencia crea un objeto tipo array
         System.out.println("a[" + i + "] = " + a[i]);
      }
   }
}