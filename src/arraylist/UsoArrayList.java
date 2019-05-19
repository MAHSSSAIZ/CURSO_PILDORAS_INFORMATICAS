package arraylist;
import java.io.*;
public class UsoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList archivos = new ArrayList(5);
		archivos.add("Juan");
		archivos.add("Pepe");
		archivos.add("Jose");
		archivos.add("Andres");
		archivos.add(new File("gestion_Pedido.txt"));

		
		String nombrePersona = (String)archivos.get(4);
		System.out.println("Nonmbre persona:" + nombrePersona);
		
		
		
	}

}
