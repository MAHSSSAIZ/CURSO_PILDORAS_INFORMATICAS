package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCentrado mimarco = new MarcoCentrado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
		
	}
}	
	
class MarcoCentrado extends JFrame{
		
		public MarcoCentrado() {
			
			Toolkit mi_Pantalla = Toolkit.getDefaultToolkit();
			//Dimension tamano_Pantalla = new Dimension();
			Dimension tamano_Pantalla = mi_Pantalla.getScreenSize();
			int alturaPantalla = tamano_Pantalla.height;
			int anchoPantalla = tamano_Pantalla.width;
			//double alto = tamano_Pantalla.getHeight();
			//double ancho = tamano_Pantalla.getWidth();
			setSize(anchoPantalla/2, alturaPantalla/2);
			setLocation(anchoPantalla/4, alturaPantalla/4);
			setTitle("Marco centrado");
			Image miIcono = mi_Pantalla.getImage("src/graficos/icono.gif");
			setIconImage(miIcono);
			
		}
		
}


