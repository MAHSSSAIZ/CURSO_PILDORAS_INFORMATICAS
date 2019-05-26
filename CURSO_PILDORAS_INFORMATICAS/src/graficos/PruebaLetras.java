package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class PruebaLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fuente = JOptionPane.showInputDialog("Introduce fuente:" );
		boolean estaLaFuente = false;
		
		String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); 
		
		for(String s: nombresDeFuentes ) {
			//System.out.println("Nombre de la fuente: "+ s + "       Nombre inroducido :" + fuente);
			
			
			if(s.equals(fuente)) {
				estaLaFuente = true;
			}
			
		}
		
		if(estaLaFuente) {
			System.out.println("Fuente instalada");
		}
		else {
			System.out.println("Fuente NO instalada");
		}
			
		
	}

}
