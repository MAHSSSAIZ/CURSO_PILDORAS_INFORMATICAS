package graficos;
import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1 = new miMarco();
		marco1.setVisible(true);
		
		//marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		marco1.setDefaultCloseOperation(3);
		
	}

}

class miMarco extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public miMarco() {
		//setSize(500, 300);
		setTitle("Titulo del marco");
		setName("Nombre de la ventana");
		//setLocation(100, 100);
		setBounds(500, 300, 450, 250);
		//setResizable(false);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		//setExtendedState(6);
	}
	
}
