package instrospeccion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class PruebaIntrospeccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el nombre de la clase :");
		String nombreClase;
		nombreClase = entrada.next();

		try {
			Class cl = Class.forName(nombreClase);
			Class supercl = cl.getSuperclass();

			System.out.println("El nombre de clase es: " + cl.getName());
			if (supercl != null && supercl != Object.class) {
				System.out.println("Superclase:" + supercl.getName());
			}

			System.out.println("El nombre canonigo de la clase es: " + cl.getCanonicalName());

			
			System.out.println("");
			imprimirConstructores(cl);
			System.out.println("");

			imprimirMetodos(cl);
			System.out.println("");

			imprimirCampos(cl);
			System.out.println("");

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

	}

	private static void imprimirConstructores(Class cl) {
		Constructor[] constructores = cl.getDeclaredConstructors();
		System.out.println("Constructores: ");
		for (Constructor c : constructores) {
			String nombre = c.getName();
			System.out.print("  " + Modifier.toString(c.getModifiers()));
			System.out.print("  " + nombre + " (");
			// System.out.print(" " + nombre + "(");

			Class[] tipoParametros = c.getParameterTypes();
			for (int i = 0; i < tipoParametros.length; i++) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(tipoParametros[i].getName());
			}

			System.out.print(")");
			System.out.println(" ");
		}
	}

	private static void imprimirMetodos(Class cl) {
		Method[] metodos = cl.getDeclaredMethods();
		System.out.println("Métodos: ");
		for (Method m : metodos) {
			Class tipodevuelto = m.getReturnType();
			String nombre = m.getName();
			System.out.print("  " + Modifier.toString(m.getModifiers()));
			System.out.print("  " + tipodevuelto.getName()+ " ");
			System.out.print("  " + nombre + " (");

			Class[] tipoParametros = m.getParameterTypes();

			for (int i = 0; i < tipoParametros.length; i++) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(tipoParametros[i].getName());
			}
			System.out.print(")");
			System.out.println("");
		}

	}

	private static void imprimirCampos(Class cl) {
		Field[] campos = cl.getDeclaredFields();
		System.out.println("Campos: ");
		for (Field f : campos) {
			String nombre = f.getName();
		    Class tipo = f.getType();
			System.out.print("  " + Modifier.toString(f.getModifiers()));
			
			System.out.print("  " + nombre + " (");
			System.out.print(")");
			System.out.println("");
		}

	}

}
