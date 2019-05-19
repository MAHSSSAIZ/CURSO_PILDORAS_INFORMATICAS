// Ejemplo del funcionamiento del Garbage collectos
class Chair {
   static boolean gcrun = false;
   static boolean f = false;
   static int created = 0;
   static int finalized = 0;
   int i;
   Chair(){
      i = ++created;
      if(created == 47)
      System.out.println("Creada la silla número 47");
      ////System.out.println("Se ha creado la silla número: + i );
   }
   public void finalize(){
      if(!gcrun) {
/// la primera vez que finalize() es llamado
         gcrun= true;
         System.out.println("Comenzando a finalizar before " +
          created + " Chairs hayan sido creadas");
///         System.out.println("finalizando la silla #47, levantando una bandera para parar la creacion de sillas");
      }
      if(i == 47) {
         System.out.println("finalizando la silla #47, levantando una" +
         " bandera para parar la creacion de sillas ");
         f = true;
      }
      finalized++;
      if(finalized >= created)
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
      System.out.println(
      "luego de que todas las Chairs ha sido creadas: \n"
       + "total creadas = " + Chair.created +
       ", total terminadas = " + Chair.finalized);
       if(args.length > 0) {
         if(args[0].equals("gc") || args[0].equals("all")) {
             System.out.println("gc():");
             System.gc();
         }
         if(args[0].equals("finalize") || args[0].equals("all")) {
             System.out.println("runFinalization():");
             System.runFinalization();
         }
      }
      System.out.println("Adios");
   }
}
