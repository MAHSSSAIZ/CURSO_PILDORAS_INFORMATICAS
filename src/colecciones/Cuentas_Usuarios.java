package colecciones;

import java.util.HashSet;
import java.util.Set;

public class Cuentas_Usuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("Pepe", "0001", 1500);
		//System.out.println("Hashcode del objeto cliente1:" + cliente1.hashCode() );
		Cliente cliente2 = new Cliente("Juan", "0002", 6500);
		Cliente cliente3 = new Cliente("Alberto", "0003", 2500);
		Cliente cliente4 = new Cliente("Felipe", "0004", 7500);
		Cliente cliente5 = new Cliente("Pepe", "0001", 1500);
		//Cliente cliente1bis = cliente1;
		//System.out.println("Hashcode del objeto cliente1bis" + cliente1bis.hashCode() );
		//Cliente cliente11bis = cliente1;
		//System.out.println("Hashcode del objeto cliente11bis :" + cliente11bis.hashCode() );
		
		System.out.println("comienzo del bucle:"  );
		
		
		Set <Cliente> clientesBanco = new HashSet <Cliente>();
		clientesBanco.add(cliente1);
		clientesBanco.add(cliente2);
		clientesBanco.add(cliente3);
		clientesBanco.add(cliente4);
		clientesBanco.add(cliente5);
		
		for (Cliente cliente : clientesBanco) {
			System.out.println("Hashcode del objeto:" + cliente.hashCode() );
			System.out.println("nombre del cliente: "+ cliente.getNombre() + ". Numero de cuenta: "+ cliente.getN_cuenta() + ".Saldo del cliente: " + cliente.getSaldo());
			//System.out.println("numero de cuenta: "+ cliente.getN_cuenta());
			//System.out.println("saldo del cliente: " + cliente.getSaldo());
			
		}
		
		
	}

}
