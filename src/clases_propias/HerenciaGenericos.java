package clases_propias;

public class HerenciaGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Empleado administrativa = new Empleado("Elena", 45, 1500);
		Jefe directoraComercial = new Jefe("Juan", 35, 35000);
		Empleado nuevoEmpleado = directoraComercial;*/
		
		// situacion no valida
		/*/Pareja <Empleado> administrativa = new Pareja<Empleado>();
		Pareja <Jefe> directoraComercial = new Pareja<Jefe>();
		
		Pareja<Empleado> nuevoEmpleado = directoraComercial;*/
	
		
		Pareja <Empleado> administrativa = new Pareja<Empleado>();
		Pareja <Jefe> directoraComercial = new Pareja<Jefe>();
				
		Pareja.imprimirTrabajador(administrativa);
		Pareja.imprimirTrabajador(directoraComercial);
		
		
	}
	
	

}
