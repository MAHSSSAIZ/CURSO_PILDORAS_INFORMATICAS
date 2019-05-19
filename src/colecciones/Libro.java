package colecciones;


public class Libro {
	public Libro(String titulo, String autor, int iSBN) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
	}

	private String titulo;
	private String autor;
	private int ISBN;

	public String getDatos() {
		return "El titulo del libro es: " + titulo + ". El autor es:" + autor + ". El ISBN es: " + ISBN;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
	

	/*public boolean equals(Object obj) {

		if (obj instanceof Libro) {
			Libro libroTemp = (Libro) obj;

			if (this.ISBN == libroTemp.ISBN) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}*/

	
	
}
