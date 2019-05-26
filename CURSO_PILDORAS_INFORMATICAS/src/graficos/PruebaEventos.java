/// ejemplo de manejo de eventos en una ventana. CON OBJETO JPanel como LISTENER

package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoBotones extends JFrame{
	public MarcoBotones() {
		setTitle("Prueba  de Botones y Eventos" );
		setBounds(100, 200 , 500, 300);
		LaminaBotones milamina = new LaminaBotones();
		add(milamina);
	}
	
}

class LaminaBotones extends JPanel implements ActionListener{
	
	JButton botonAzul = new JButton("Boton azul");
	JButton botonAmarillo = new JButton("Boton amarillo");
	JButton botonRojo = new JButton("Boton rojo");
	
	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object botonPulsado = e.getSource();
		
		if (botonPulsado == botonAzul ) {
			setBackground(Color.BLUE);
		}
		if (botonPulsado == botonAmarillo ) {
			setBackground(Color.YELLOW);
		}
		if (botonPulsado == botonRojo ) {
			setBackground(Color.RED);
		}
		
	
		
		
		
	}
}