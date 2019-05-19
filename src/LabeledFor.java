public class LabeledFor {
   public static void main(String[] args) {
      int i = 0;
      outer:
      for(; true; ) {
         inner:
         for(; i < 10; i++){
            prt("i = " + i);
            if(i == 2) {
               prt("continua");
               continue;
            }
            if(i == 3) {
               prt("break");
               i++;
               break;
            }
            if(i == 7) {
               prt("continua por afuera");
               i++;
               continue outer;
            }
            if(i == 8) {
               prt("quiebre para afuera");
               i++;
               break outer;
            }

            for(int k = 0; k < 5; k++) {
               if (k==3) {
                  prt("continua en el interior");
                  continue inner;
               }
            }




         }
      }

   }

   static void prt(String s){
      System.out.println(s);
   }

}