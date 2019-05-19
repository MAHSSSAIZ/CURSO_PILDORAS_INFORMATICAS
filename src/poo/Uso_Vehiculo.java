package poo;

//import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Coche Renault = new Coche();
		
		//System.out.println("Este coche tiene: " + Renault.getlargo() + " //ruedas");
		//System.out.println(Renault.damelargo());

		//Renault.setlargo(500);
		
		//System.out.println(Renault.damelargo());

		
		/*Coche2 mi_coche = new Coche2();
		mi_coche.setcolor(JOptionPane.showInputDialog("¿cual es el color del coche?"));
		mi_coche.setasientos_cuero(JOptionPane.showInputDialog("¿tiene asientos de cuero? S/N "));
		mi_coche.setclimatizador(JOptionPane.showInputDialog("¿tiene climatizador? S/N "));*/

		Coche2 mi_coche1 = new Coche2();
		mi_coche1.setcolor("rojo");
		Furgoneta mi_furgoneta1 = new Furgoneta(2,800);
		mi_furgoneta1.setcolor("azul");
		mi_furgoneta1.setasientos_cuero("s");
		mi_furgoneta1.setclimatizador("s");
		System.out.println(mi_coche1.dimedatosgenerales() + mi_coche1.getcolor());
		
		System.out.println(mi_furgoneta1.dimedatosgenerales() + " "+ mi_furgoneta1.dimeDatosFurgoneta());
		
	
		
		
		/*System.out.println(mi_coche.dimedatosgenerales());
		System.out.println(mi_coche.getcolor());
		System.out.println(mi_coche.getasientos_cuero());
		System.out.println(mi_coche.getclimatizador());
		System.out.println(mi_coche.dimepesocoche());
		System.out.println("El precion ficnal del coche es: " + mi_coche.dimepreciocoche());*/
		
		
	}

}
