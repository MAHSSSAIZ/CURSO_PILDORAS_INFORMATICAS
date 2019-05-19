package src;
import javax.swing.*;
public class Uso_Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] paises = new String[8];
		/*paises[0] = "España";
		paises[1] = "Portugal";
		paises[2] = "Francia";
		paises[3] = "Italia";
		paises[4] = "Suiza";
		paises[5] = "Colombia";
		paises[5] = "Mexico";
		paises[6] = "Perú";
		paises[7] = "Chile";*/
		
		//String [] paises = {"España", "Portugal"};

		/*for (int i = 0; i < paises.length; i++) {
			System.out.println("Pais: " + ( i+1) +"  "+ paises[i]);
			
		}*/
		
		int j = 0;
		
		for ( int i = 0; i<8; i++) {
			
			paises[i] = JOptionPane.showInputDialog("introduce el pais: " + (i + 1));
		
		}
		
		for (String elemento:paises) {
			
			System.out.println("Pais: " + j + elemento);
			j++;
			
		}
		
		
		
		
	}

}
