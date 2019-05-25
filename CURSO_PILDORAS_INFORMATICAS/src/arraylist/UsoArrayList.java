package arraylist;

import java.io.File;

//import java.io.*;
public class UsoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList archivos = new ArrayList(4);
		archivos.add("Juan");
		archivos.add("Pepe");
		archivos.add("Jose");
		archivos.add("Andres");
		//archivos.add(new File("gestion_Pedido.txt"));

		//File nombre_persona = (File)archivos.get(5);
		String nombrePersona = (String)archivos.get(3);
		System.out.println("Nonmbre persona:" + nombrePersona);
		
		
		
	}

}
