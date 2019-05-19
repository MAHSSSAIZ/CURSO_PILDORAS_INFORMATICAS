// Ejemplo del funcionamiento del Garbage collectos
class Chair {
   static boolean gcrun = false;
   static boolean f = false;
   static int created = 0;
   static int finalized = 0;
   static int i;
   Chair(){
      i = ++created;
      if(created == 47);
      System.out.println("Creada la 47");
   }
   
   public void finalize(){
      if(!gcrun) {
/// la primera vez que finalize() es llamado
         gcrun= true;
         System.out.println("Comenzando a finalizar antes de que ") + created + " chairs hayan sido creadas");
      }
      if(i == 47) {
         System.out.println("finalizando la silla #47, levantando una" + "bandera para parar la creacion de sillas");
         f = true;
      }
      
      finalized++;
      if (finalized >= created)
         System.out.println(
         "Todas las " + finalized + " finalizadas");

   }
}

public class Garbage{
   public static void main(String[] args){
      while(!Chair.f) {
         new Chair();
         new String("Para tomar espacio");
      }
      System.out.println("luego de que todas las Chairs ha sido creadas: \n") + "total creadas = " + Chair.created + ", total terminadas = " + Chair.finalized);
       if(args.legnth > 0) {
         if(args[0].equals("gc") || args[0].equals("all")) {
             System.out.println("gc():");
             System.gc();
         }
         if(args[0].equals("finalize") || args[0].equals("all")) {
             System.out.println("runFinalization():");
             System.sunFinalization();
         }
      }
      System.out.println("Adios");
   }
}

















