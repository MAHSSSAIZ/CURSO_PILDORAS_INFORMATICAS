package src;
import java.awt.Graphics;
import java.awt.Color;
public class CirculoGrafico extends Circulo implements Dibujable{
	Color color;
	
	public CirculoGrafico(double x, double y, double r, Color unColor) {
		// llamada al constructor de Circulo
		super(x, y, r);
		this.color = unColor;
		}
		// métodos de la interface Dibujable
		public void dibujar(Graphics dw) {
		dw.setColor(color);
		dw.drawOval((int)(x-r),(int)(y-r),(int)(2*r),(int)(2*r));
		}
		public void setPosicion(double x, double y) {
		;
		}
	
}
