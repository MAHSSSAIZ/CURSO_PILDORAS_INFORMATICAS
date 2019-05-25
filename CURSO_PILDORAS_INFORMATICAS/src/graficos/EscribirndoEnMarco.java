package graficos;
import javax.swing.*;
import java.awt.*;

public class EscribirndoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTexto mimarco = new MarcoConTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}


class MarcoConTexto extends JFrame{
	//constructor
	public MarcoConTexto() {
		setVisible(true);
		setSize(600, 400);
		setLocation(400, 200);
		setTitle("Primer texto");
		Lamina milamina = new Lamina();
	
		add(milamina);
	}
	
}

class Lamina extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Texto pintado en pantalla", 100, 100);
	}
	
}