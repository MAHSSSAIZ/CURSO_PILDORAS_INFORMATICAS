package excepciones;

import javax.swing.JOptionPane;

public class Aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce los elementos de la matriz:"));
		
		int num_aleatorio[] = new int[elementos];
		
		for(int i = 0 ; i< elementos; i++) {
			num_aleatorio[i] =  (int)(Math.random()*100);
			
			
		}
		
		for(int elemento: num_aleatorio) {
			System.out.println(elemento);
		}
		
	}

}
