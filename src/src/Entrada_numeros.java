
package src;
import javax.swing.*;
public class Entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//double x = 10000.0;
		//System.out.printf("%1.4f", x/13);
		
		String num1 = JOptionPane.showInputDialog("Intoduce un número;");
		double num2 = Double.parseDouble(num1);
		System.out.print("la raiz de:" + num2 + " es ");
		System.out.printf("%1.5f", Math.sqrt(num2));
	}

}
