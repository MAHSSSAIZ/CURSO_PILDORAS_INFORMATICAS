/// ejemplo de manejo de eventos en una ventana. CON OBJETO COLOR DE FONDO como LISTENER

package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventosDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotonesDos extends JFrame{
	public MarcoBotonesDos() {
		setTitle("Prueba  de Botones y Eventos" );
		setBounds(100, 200 , 500, 300);
		LaminaBotonesDos milamina = new LaminaBotonesDos();
		add(milamina);
	}
	
}



class LaminaBotonesDos extends JPanel{
	
	JButton botonAzul = new JButton("Boton azul");
	JButton botonAmarillo = new JButton("Boton amarillo");
	JButton botonRojo = new JButton("Boton rojo");
	
	public LaminaBotonesDos() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		ColorFondo Rojo = new ColorFondo(Color.RED);
		botonAzul.addActionListener(Amarillo);
		botonAmarillo.addActionListener(Azul);
	    botonRojo.addActionListener(Rojo);
		
	}

///La clase ColorFondo se define com interna para poder acceder al método setBackground de la clase que la engloba
/// La clase implementa ActionListener para identificarla como la encargada de escuchar los eventos
	class ColorFondo implements ActionListener{
		private Color colorDeFondo;
		
		public ColorFondo(Color c) {
			colorDeFondo = c;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setBackground(colorDeFondo);
			
		}
		
	}
	
}


