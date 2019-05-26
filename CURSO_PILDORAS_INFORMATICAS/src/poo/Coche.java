package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	public Coche() {
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	
	
	public void setcolor(String c){
		color = c;
	}
		
	
	public String damecolor() {
		
		return "El largo del coche es " + color;
	}
	
	
	
	public int getruedas() {
		
		return ruedas;
	}
	
	public  void setlargo(int i) {
		
		largo = i;
	}
	
	public int getlargo() {
		
		return largo;
	}
	
	public String Damelargo() {
		
		return "El largo del coche es " + largo;
	}

}
