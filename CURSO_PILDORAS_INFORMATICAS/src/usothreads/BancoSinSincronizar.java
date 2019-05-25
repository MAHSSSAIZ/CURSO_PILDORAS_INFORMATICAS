package usothreads;

public class BancoSinSincronizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco banco = new Banco();

		for (int i = 0; i < 100; i++) {
			EjecucionTransferencias r = new EjecucionTransferencias(banco, i, 2000);
			Thread hilo1 = new Thread(r);
			hilo1.start();
		}

	}

}

//////////////////////////////////

class Banco {

	// VARIABLES CLASE BANCO
	private final double[] cuentas;

	// CONSTRUCTOR CLASE BANCO
	public Banco() {
		cuentas = new double[100];

		for (int i = 0; i < cuentas.length; i++) {
			cuentas[i] = 2000;
		}

	}

	// METODOS CLASE BANCO
	public synchronized boolean transferencia(int cuentaOrigen, int cuentaDestino, double cantidad)
			throws InterruptedException {
		boolean haysaldo = true;
		if (cuentas[cuentaOrigen] <= 100) {
			haysaldo = false;
			System.out.println(" Saldo por debajo del mínimo en cuenta: " + cuentaOrigen + " Saldo pendiente: "
					+ cuentas[cuentaOrigen] + " Vaciado por el el hilo: " + Thread.currentThread());
			System.out.printf("El saldo total es : %10.2f%n ", getSaldoTotal());
		} else {

			while (cuentas[cuentaOrigen] < cantidad) {
				wait();
			}

			System.out.println("PASO 1.Esto lo ejecuta el hilo: " + Thread.currentThread());
			// System.out.println(" ");
			cuentas[cuentaOrigen] -= cantidad;
			System.out.printf("PASO 2. Traspaso de %10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
			System.out.println(" ");
			cuentas[cuentaDestino] += cantidad;
			System.out.println("PASO 3.  Saldo posterior a traspaso en cuenta: " + cuentaOrigen + " Saldo pendiente: "
					+ cuentas[cuentaOrigen]);
			System.out.printf("PASO 4. El saldo total es : %10.2f%n ", getSaldoTotal());
			System.out.println(" ");
			System.out.println("PASO 5. Se despiertan los hilos parados por el  hilo : " + Thread.currentThread());
			notifyAll();
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
class EjecucionTransferencias implements Runnable {

	private Banco banco;
	private int cuenta_origen;
	private double importe_maximo;

	public EjecucionTransferencias(Banco b, int de, double max) {
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