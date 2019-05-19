package src;
import javax.swing.*;

public class Entrada_Ejemplo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre_usuario = JOptionPane.showInputDialog("Por favor, intoduce tu nombre, por favor");
		String edad_usuario = JOptionPane.showInputDialog("Por favor, intoduce tu edad, por favor");
		int edad = Integer.parseInt(edad_usuario);		
		edad ++;
		System.out.println("hola: "+ nombre_usuario + " el año que viene tendrás " + edad  + " años.");
	}

}
