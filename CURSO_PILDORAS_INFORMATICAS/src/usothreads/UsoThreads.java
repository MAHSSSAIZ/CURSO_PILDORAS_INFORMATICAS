// EN ESTA CLASE ESTAN DEFINIFIDOS LOS DIFERENTES PASOS PARA EJECUTAR UN HILO.
// Buscar literal PUNTO
package usothreads;

import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class UsoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame marco = new MarcoRebote();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);

	}

}
// PUNTO 1. Esta es la clase que implementa Runnable y que van a contener el método run que que se encarga de ejecutar el codifo que se quiere repetir en un hilo
class PelotaHilos implements Runnable {
	private Pelota pelota;
	private Component componente;

	public PelotaHilos(Pelota unaPelota, Component unComponente) {
		pelota = unaPelota;
		componente = unComponente;
	}

	@Override
	public void run() {
		
		// PUNTO 2. El método run debe contener toda la tarea que debe ser simultanea.
		System.out.println("estado del hilo al comienzo  "  +Thread.currentThread().isInterrupted());
		// TODO Auto-generated method stub
		// for (int i=1; i<=3000; i++){
		/*
		 * /try { Thread.sleep(4); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		//while (!Thread.interrupted()) 
		while (!Thread.currentThread().isInterrupted()) {
			pelota.mueve_pelota(componente.getBounds());

			componente.paint(componente.getGraphics());
			
			 try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				Thread.currentThread().interrupt();
			} 
			
		}
		System.out.println("estado del hilo al final  "  +Thread.currentThread().isInterrupted());
		

		// }

	}

}

//Movimiento de la pelota-----------------------------------------------------------------------------------------

class Pelota {

	// Mueve la pelota invirtiendo posición si choca con límites

	public void mueve_pelota(Rectangle2D limites) {

		x += dx;

		y += dy;

		if (x < limites.getMinX()) {

			x = limites.getMinX();

			dx = -dx;
		}

		if (x + TAMX >= limites.getMaxX()) {

			x = limites.getMaxX() - TAMX;

			dx = -dx;
		}

		if (y < limites.getMinY()) {

			y = limites.getMinY();

			dy = -dy;
		}

		if (y + TAMY >= limites.getMaxY()) {

			y = limites.getMaxY() - TAMY;

			dy = -dy;

		}

	}

	// Forma de la pelota en su posición inicial

	public Ellipse2D getShape() {

		return new Ellipse2D.Double(x, y, TAMX, TAMY);

	}

	private static final int TAMX = 15;

	private static final int TAMY = 15;

	private double x = 0;

	private double y = 0;

	private double dx = 1;

	private double dy = 1;

}

// Lámina que dibuja las pelotas----------------------------------------------------------------------

class LaminaPelota extends JPanel {

	// Añadimos pelota a la lámina

	public void add(Pelota b) {

		pelotas.add(b);
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		for (Pelota b : pelotas) {

			g2.fill(b.getShape());
		}

	}

	private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
}

//Marco con lámina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame {

	public MarcoRebote() {

		setBounds(600, 300, 500, 350);

		setTitle("Rebotes");

		lamina = new LaminaPelota();

		add(lamina, BorderLayout.CENTER);

		JPanel laminaBotones = new JPanel();
		
		arranca1 = new JButton("hilo1");
		arranca1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego(evento);
			}
			
		});
		//---------------------------------------------
		arranca2 = new JButton("hilo2");
		arranca2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego(evento);
			}
			
		});

		arranca3 = new JButton("hilo3");
		arranca3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego(evento);
			}
			
		});

		laminaBotones.add(arranca1);
		laminaBotones.add(arranca2);
		laminaBotones.add(arranca3);
////////////---------------------
		detener1 = new JButton("detener1");
		detener1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento) {

				detener(evento);
			}
			
		});
		//---------------------------------------------
		detener2 = new JButton("detener2");
		detener2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento) {

				detener(evento);
			}
			
		});

		detener3 = new JButton("detener3");
		detener3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento) {

				detener(evento);
			}
			
		});
		
		laminaBotones.add(detener1);
		laminaBotones.add(detener2);
		laminaBotones.add(detener3);
		
		
		
		

		add(laminaBotones, BorderLayout.SOUTH);
	}

		/*ponerBoton(laminaBotones, "Dale1", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego();
			}

		});*/
		
		/*ponerBoton(laminaBotones, "Dale2", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego();
			}

		});*/
		
		/*ponerBoton(laminaBotones, "Dale3", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego();
			}

		});*/
		

		/*ponerBoton(laminaBotones, "Salir", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				System.exit(0);

			}

		});
// DIBUJA BOTON DE DETENER LA EJECUCION
		ponerBoton(laminaBotones, "Parar", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				detener();

			}

		});*/


	// Ponemos botones

	/*public void ponerBoton(Container c, String titulo, ActionListener oyente) {

		JButton boton = new JButton(titulo);

		c.add(boton);

		boton.addActionListener(oyente);

	}*/

	// Añade pelota y la bota 1000 vecs(es

	public void comienza_el_juego(ActionEvent e) {

		Pelota pelota = new Pelota();
		
		
		lamina.add(pelota);
		// PUNTO 3.Se instancia una clase que implementa el interfaz Runnable y se almacena en una variable de tipo Runnable.
		Runnable r = new PelotaHilos(pelota, lamina);
		
		// Thread t = new Thread(r);
		//PUNTO 4. Crear una instancia	de la clase Thread pasando como parametro al constructor el objeto de tipo runnable creado anteriormente.
		//Estamo cfreando una tarea(Thread con el objeto que queremos ejecutar.
		if (e.getSource().equals(arranca1)){
			t1 = new Thread(r);
			t1.start();
		}
		else if (e.getSource().equals(arranca2)){
			t2 = new Thread(r);
			t2.start();
		}
		else if (e.getSource().equals(arranca3)){
			t3 = new Thread(r);
			t3.start();
		}
		
		//t = new Thread(r);
		// PUNTO 5. Finalmente, se ejecuta el método start del objeto de tipo Thread que se ha creado en el punto4. De esta forma se arranca la ejecución del obketo 
		// creado  en wl punto 3.
		//t.start();

	}

	public void detener(ActionEvent e) {

		// t.stop();
		if(e.getSource().equals(detener1)) {
			t1.interrupt();
		}
		else if (e.getSource().equals(detener2)) {
			t2.interrupt();
		}
		else if(e.getSource().equals(detener3)) {
			t3.interrupt();}

	}

	private LaminaPelota lamina;
	Thread t1, t2, t3;
	JButton arranca1, arranca2, arranca3, detener1, detener2, detener3;
	
}
