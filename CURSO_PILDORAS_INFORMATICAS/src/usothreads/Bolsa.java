//https://www.arquitecturajava.com/java-wait-notify-y-threads/
package usothreads;

import java.util.ArrayList;

public class Bolsa {

	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();

	public void addProducto(Producto producto) {

		if (!estaLlena())
			listaProductos.add(producto);
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;

	}

	public int getSize() {
		return listaProductos.size();
	}

	public boolean estaLlena() {

		return listaProductos.size() >= 5;
	}
}
