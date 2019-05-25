package usothreads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSincronizarV0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco2 banco = new Banco2();
		// double importe_maximo = 2000;
		for (int i = 0; i < 100; i++) {
			EjecucionTransferencias2 r = new EjecucionTransferencias2(banco, i, 2000);
			Thread hilo1 = new Thread(r);
			hilo1.start();
		}

	}

}

//////////////////////////////////

class Banco2 {

	// VARIABLES CLASE BANCO
	private final double[] cuentas;

	private Lock cierreBanco = new ReentrantLock();

	private Condition saldoSuficiente;

	// CONSTRUCTOR CLASE BANCO
	public Banco2() {
		cuentas = new double[100];

		for (int i = 0; i < cuentas.length; i++) {
			cuentas[i] = 2000;
		}
		saldoSuficiente = cierreBanco.newCondition();
	}

	// METODOS CLASE BANCO
	public boolean transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
		boolean haysaldo = true;

		cierreBanco.lock();
		try {

			if (cuentas[cuentaOrigen] <= 100) {
				haysaldo = false;
				/*
				 * System.out.println(" Saldo por debajo del mínimo en cuenta: " + cuentaOrigen
				 * + " Saldo pendiente: " + cuentas[cuentaOrigen] + " Vaciado por el el hilo: "
				 * + Thread.currentThread()); System.out.printf("El saldo total es : %10.2f%n ",
				 * getSaldoTotal());
				 */
			} else {
				int numeroBloqueos = 1;
				while (cuentas[cuentaOrigen] < cantidad) {
					// Se pone a la espera de que sea despertado y no sea verdadera la condicion.
					// Al mismo tiempo se libera el lock realizado al principio del método
					System.out.println(" ");
					System.out.println("PASO 0.Se ha detenido el hilo: " + Thread.currentThread()
							+ " Numero de bloqueo:" + numeroBloqueos);
					System.out.println(" ");
					saldoSuficiente.await();
					System.out.println("PASO 0B.Se ha despertado el hilo: " + Thread.currentThread()
							+ " Numero de bloqueo:" + numeroBloqueos);
					numeroBloqueos++;

				}

				/*
				 * if (cuentas[cuentaOrigen] < cantidad) {
				 * /*System.out.println(" ****Saldo INSUFICENTE*** en cuenta: " + cuentaOrigen +
				 * " Saldo pendiente: " + cuentas[cuentaOrigen] +
				 * " para hacer traspaso por importe de:" + cantidad);
				 * 
				 * return true; }
				 */
				/*
				 * else { System.out.println(" ----Saldo OK ------- en cuenta: " + cuentaOrigen
				 * + " Saldo pendiente: " + cuentas[cuentaOrigen] +
				 * " para hacer traspaso por importe de:" + cantidad);
				 * 
				 * }
				 */

				System.out.println("PASO 1.Esto lo ejecuta el hilo: " + Thread.currentThread());
				// System.out.println(" ");
				cuentas[cuentaOrigen] -= cantidad;
				System.out.printf("PASO 2. Traspaso de %10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
				System.out.println(" ");
				cuentas[cuentaDestino] += cantidad;
				System.out.println("PASO 3.  Saldo posterior a traspaso en cuenta: " + cuentaOrigen
						+ " Saldo pendiente: " + cuentas[cuentaOrigen]);
				System.out.printf("PASO 4. El saldo total es : %10.2f%n ", getSaldoTotal());
				System.out.println(" ");
				System.out.println("PASO 5. Se despiertan los hilos parados por el  hilo : " + Thread.currentThread());
				saldoSuficiente.signalAll();
			}
		} finally {

			cierreBanco.unlock();
		}
		return haysaldo;

	}

	public double getSaldoTotal() {
		double suma_cuentas = 0;
		int i = 0;
		for (double a : cuentas) {
			suma_cuentas += a;
			// System.out.println("Saldo de la cuenta: " + i + " es :" + a);
			i++;
		}

		return suma_cuentas;

	}

}

////////////////////////////////////////
class EjecucionTransferencias2 implements Runnable {

	private Banco2 banco;
	private int cuenta_origen;
	private double importe_maximo;

	public EjecucionTransferencias2(Banco2 b, int de, double max) {
		banco = b;
		cuenta_origen = de;
		importe_maximo = max;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean haysaldo = true;
		try {
			while (haysaldo) {
				int cuenta_destino;
				cuenta_destino = (int) (100 * Math.random());
				if (this.cuenta_origen != cuenta_destino) {
					double cantidad = importe_maximo * Math.random();
					haysaldo = banco.transferencia(cuenta_origen, cuenta_destino, cantidad);
					Thread.sleep((int) Math.random() * 10);
				}

			}
		} catch (InterruptedException e) {
		}

	}

}