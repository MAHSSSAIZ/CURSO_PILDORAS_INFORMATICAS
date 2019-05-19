//: c06:CADSystem.java
// Asegurando una limpieza adecuada.
import java.util.*;
class Shape {
   Shape(int i) {
   System.out.println("Constructor de formas");
   }

   void cleanup() {
      System.out.println("Limpieza de formas");
   }
}

class Circle extends Shape {
   Circle(int i) {
      super(i);
      System.out.println("Dibujando un círculo");
   }
   void cleanup() {
      System.out.println("Borrando un círculo");
      super.cleanup();
   }
}

class Triangle extends Shape {
   Triangle(int i) {
   super(i);
   System.out.println("Dibujando un triángulo");
   }
   void cleanup() {
      System.out.println("Borrando un triángulo");
      super.cleanup();
   }
}

class Line extends Shape {
   private int start, end;
   Line(int start, int end) {
      super(start);
      this.start = start;
      this.end = end;
      System.out.println("Dibujando una línea: " +
      start + ", " + end);
   }
   void cleanup() {
      System.out.println("Borrando una línea: " +
      start + ", " + end);
      super.cleanup();
   }
}

public class CADSystem extends Shape {
   private Circle c;
   private Triangle t;
   private Line[] lines = new Line[10];
   CADSystem(int i) {
      super(i + 1);
      for(int j = 0; j < 10; j++)
      lines[j] = new Line(j, j*j);
      c = new Circle(1);
      t = new Triangle(1);
      System.out.println("Constructor combinado");
   }

   void cleanup() {
      System.out.println("CADSystem.cleanup()");
// El orden de la limpieza es el reverso
// del orden de la inicialización
      t.cleanup();
      c.cleanup();
      for(int i = lines.length - 1; i >= 0; i--)
      lines[i].cleanup();
      super.cleanup();
   }

   public static void main(String[] args) {
      CADSystem x = new CADSystem(47);
      try {
// Código para manejo de excepciones...
      } finally {
         x.cleanup();
         }
   }
}