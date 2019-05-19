package graficos;

import javax.swing.JFrame;
import java.awt.event.*;

public class EventosVentaJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posicion_x;
		int posicion_y;
		int ventana_alto;
		int ventana_ancho;
		
		MarcoVentana mimarco = new MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MarcoVentana mimarco2 = new MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mimarco.setTitle("Ventana uno");
		mimarco2.setTitle("Ventana dos");
		mimarco.setBounds(100, 100, 500, 500);
		mimarco2.setBounds(300, 300, 500, 500);
		
	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		//setTitle("Marco Ventana");
		//setBounds(300, 300, 500, 500);
		setVisible(true);
		
		addWindowListener(new M_Ventana());
				
		//M_Ventana oyente_ventana = new M_Ventana();
		//addWindowListener(oyente_ventana);
	}
}


//class M_Ventana implements WindowListener{
//se utiliza la clase adaptadora WindowAdapter la cual ya tiene implementados como abstactos todos los métodos de los 
// interfaces, p.e. WindowListener
class M_Ventana extends WindowAdapter{

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana activada" + e.getWindow());
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana cerrada");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana cerrandose");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana desactivada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana desminimizada");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana minimizada");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana abierta");
		
	}
	
	
}