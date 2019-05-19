package poo;

public class Coche2 {

	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private int peso_total;
	

	private String color;
	
	private boolean asientos_cuero, climatizador;
	
	
	public Coche2() {
		
		ruedas = 4;
		largo = 200;
		ancho = 150;
		motor = 2000;
		peso_plataforma = 1500;
	}

	public String dimepesocoche() {
		int peso_carroceria = 500;
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero == true) {
			peso_total = peso_total +50;
		}
		
		if (climatizador == true) {
			peso_total = peso_total + 20;
		}
		
		return "El peso total del coche es " + peso_total + " kilos";
		
		
		
	}
	
	
	public int dimepreciocoche() {
		int precio_final = 10000;
		if (asientos_cuero == true) {
			precio_final += 1000;
		}

		if (climatizador == true) {
			precio_final += 1500;
		}
		return precio_final;
	}
	
	
	public void setasientos_cuero(String asientos_cuero) {
		
		if(asientos_cuero.equalsIgnoreCase("S")) {
			this.asientos_cuero = true;
		}
		else {
			this.asientos_cuero = false;
		}
		
	}
	
	public String getasientos_cuero() {
		if(asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		}
		else {
			return  "El coche no tiene asientos de cuero";
		}
		
				
		
	}
	
	
	
	
	
	public void setcolor(String color_coche) {
		
		color = color_coche;
	
	}
	
	public String getcolor() {
		
		return " El color del coche es: " + color ;
				
		
	}
	
	
	
	public void setlargo(int l) {
	System.out.println("estoy cambiando el largo del coche con lo recibido:" + l );
		
		largo = l;
	}

	public String damelargo() {
		return "El largo de tu coche es: " + largo + "centimetros." ;
	}


	public String dimedatosgenerales() {
		return "La plataforma del coche tiene " + ruedas + " ruedas. Mide " + largo + " con un ancho" + 150 +" y pesa:" + peso_plataforma + "kilos";
	}

	
	public void setclimatizador(String climatizador) {
		
		if (climatizador.equalsIgnoreCase("S") ) {
			this.climatizador = true;
		}else {
			this.climatizador = false;
		}
		
	}
	
	public String getclimatizador() {
		if(climatizador == true) {
			return "El coche tiene climatizador";
		}
		else {
			return  "El coche no tiene climatizador";
		}
		
		
		
		
		
	}
	
	
}
