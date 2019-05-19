package excepciones;
import javax.swing.*;
public class Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] mi_matriz  = new int[5];
		mi_matriz[0] = 1;
		mi_matriz[1] = 12;
		mi_matriz[2] = 13;
		mi_matriz[3] = 14;
		mi_matriz[4] = 15;
		
		for(int i = 0;  i < 4 ; i ++) {
			
			System.out.println("Posicion :" + i + " de mi matriz" + mi_matriz[i]);
		
		}

		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:"));
		System.out.println("Hola " + nombre + " Tienes " + edad + " años. El programa terminó su ejecución");
		
		
	}

}
