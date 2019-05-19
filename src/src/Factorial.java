package src;
import java.math.BigInteger;

import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long resultado = 1;
		//BigInteger grande = new BigInteger("0");
//		String s = new String("hola");
		
		long numero = Long.parseLong(JOptionPane.showInputDialog("Introduce un numero;"));
		
		for(long i = numero; i > 0; i--){
		
		//grande = grande.multiply(grande) ;	
		resultado = resultado * i;
	}
		System.out.println("el factorial del numero " + numero + " es :" + resultado);
		
	}
}
