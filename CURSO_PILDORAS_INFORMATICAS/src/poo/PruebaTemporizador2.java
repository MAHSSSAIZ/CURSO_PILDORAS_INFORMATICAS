//////ejemplo de clase interna


package poo;
import javax.swing.*;
import java.awt.Event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reloj miReloj = new Reloj(3000, true);
		Reloj miReloj = new Reloj();

		miReloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
		System.exit(0);
	}

}


class Reloj{
	//private int intervalo;
	//private boolean sonido;
	
	/*public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
		
	}*/
	
	public void enMarcha(int intervalo,  final boolean sonido) {
		///INICIO DE CLASE INTERNA LOCAL
		
		class DameLaHora2 implements ActionListener	{
		public void actionPerformed(ActionEvent evento) {
			Date ahora = new Date();
			System.out.println("Te pongo la hora cada 3 segundos:" + ahora);
			if(sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		
			}
		}
		///FINAL DE CLASE INTERNA LOCAL
		
		
		
		
		
		ActionListener oyente = new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();		
	}
	
	///INICIO DE CLASE INTERNA normal
	/*private class DameLaHora2 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			Date ahora = new Date();
			System.out.println("Te pongo la hora cada 3 segundos:" + ahora);
			if(sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		
		}
	}*/
	///FINAL DE CLASE INTERNA
	
}