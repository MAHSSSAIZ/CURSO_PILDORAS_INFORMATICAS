package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConFuentes mimarco = new MarcoConFuentes();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color colorFondo = new Color(125);
		
		mimarco.setForeground(colorFondo);
	}

}

class MarcoConFuentes extends JFrame{
	public MarcoConFuentes() {
		setTitle("Prueba de dibujo");
		setSize(400, 500);
		LaminaConFuentes laminaFigura = new LaminaConFuentes();
		add(laminaFigura);
		//laminaFigura.setBackground(Color.PINK);
		//laminaFigura.setBackground(SystemColor.window);
		laminaFigura.setForeground(Color.BLUE);
		
	}
	
}


class LaminaConFuentes extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		
		Font mifuente = new Font("Arial", Font.BOLD, 36);
		//g2.setColor(Color.CYAN);
		g2.setFont(mifuente);
		g2.drawString("PEPE PUTEZ", 100, 100);
		
		g2.setFont(new Font("Courie",Font.TRUETYPE_FONT,33));
		//g2.setColor(Color.GREEN);
		g2.drawString("juan BERMUDEZ", 100, 200);
				
/*		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.setPaint(Color.red);
		g2.fill(rectangulo);
		g2.setPaint(Color.YELLOW);
		g2.draw(rectangulo);*/
		
		
		//g2.draw(rectangulo);
		
		
		
		
		/*Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);*/
		//g2.setPaint(Color.RED);
		
		
		/*g2.setPaint(new Color(109,179,59).brighter().brighter());
		
		g2.fill(elipse);*/
		
		
		
		//g2.drawRect(100, 100, 100, 
		//		100);
		//g2.drawOval(100, 100, 100, 100);
		//g.drawString("TEXTO ESCRITO", 100, 100);
		//g.drawArc(150, 150, 100, 100, 120, 150);
		
	}
}