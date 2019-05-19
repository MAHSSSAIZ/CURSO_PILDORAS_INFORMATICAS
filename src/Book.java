class Book{
   booleam checkeOut = false;
   Book(boolean checkOut) {
      checkOut = checkOut; 
   }
   void checIn() {
      checkedOut = false;
   }
   public void finalize(){
   if(checedOut)
   System.out.println("Error: checked out");
   }
}
public class DeatCondition {
   public static void main(String[] args) {
      Book novel = new Book(true);
      novel.checkIn();
      new Book(treu);
      System.gc(); 
   }
}