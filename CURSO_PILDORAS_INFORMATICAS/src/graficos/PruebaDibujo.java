package graficos;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;


public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConDibujos mimarco = new MarcoConDibujos();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color colorFondo = new Color(125);
		
		mimarco.setForeground(colorFondo);
	}

}


class MarcoConDibujos extends JFrame{
	public MarcoConDibujos() {
		setTitle("Prueba de dibujo");
		setSize(400, 500);
		LaminaConFicguras laminaFigura = new LaminaConFicguras();
		add(laminaFigura);
		laminaFigura.setBackground(Color.PINK);
		laminaFigura.setBackground(SystemColor.window);
		
	}
	
}

class LaminaConFicguras extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.setPaint(Color.red);
		g2.fill(rectangulo);
		g2.setPaint(Color.YELLOW);
		g2.draw(rectangulo);
		
		
		//g2.draw(rectangulo);
		
		
		
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		//g2.setPaint(Color.RED);
		
		
		g2.setPaint(new Color(109,179,59).brighter().brighter());
		
		g2.fill(elipse);
		
		
		
		//g2.drawRect(100, 100, 100, 
		//		100);
		//g2.drawOval(100, 100, 100, 100);
		//g.drawString("TEXTO ESCRITO", 100, 100);
		//g.drawArc(150, 150, 100, 100, 120, 150);
		
	}
	
	
	
}