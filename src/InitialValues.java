class Measurement {
   boolean t;
   char c;
   byte b;
   short s;
   int i;
   long l;
   float f;
   double d;
      void print(){
      System.out.println(
      "Valor inicial de los tipos de datos\n" +
      "boolean " + t + "\n" +
      "char [" + c + "] " + (int)c + "\n" +
      "byte " + b + "\n" +
      "short " + s + "\n" +
      "int " + i + "\n" +
      "long " + l + "\n" +
      "float " + f + "\n" +
      "double " + d);
   }
}
public class InitialValues{
   public static void main(String[] args){
      Measurement d = new Measurement();
      d.print();
      new Measurement().print();
   }
}