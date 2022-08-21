
package punto3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA MUESTRA LA TABLA DE MULTIPLICAR QUE SE PIDA\n");

		// Se declara un objeto que realiza la lectura de datos
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se declaran las variables a usar
		int repetir, limiteInferior, limiteSuperior;
		double tabla;

		do {
			// Se le pide al usuario los datos de la tabla a imprimir
			System.out.print("\n\tIngresa de que n�mero quieres la tabla: ");
			tabla = Double.parseDouble(in.readLine());

			System.out.print("\n\tIngresa el n�mero desde que deseas que empiece: ");
			limiteInferior = Integer.parseInt(in.readLine());

			System.out.println("\n\tIngresa el n�mero en el que quieres que termine: ");
			limiteSuperior = Integer.parseInt(in.readLine());

			// Se declara un objeto de tipo Tabla
			Tabla tablaAMostrar = new Tabla(tabla, limiteInferior, limiteSuperior);

			// Se llama al m�todo que muestra la tabla
			tablaAMostrar.tablaDeMultiplicar(tablaAMostrar.getNumero(), tablaAMostrar.getLimiteInferior(),
					tablaAMostrar.getLimiteSuperior());
			;

			// Se le pregunta al usuario si quiere volver a usar el programa
			System.out.print("\n\n\t�Quieres volver a usar el programa? \n\t1. Si\n\t2. No\n\tDecisi�n: ");
			repetir = Integer.parseInt(in.readLine());
			if (repetir < 1 || repetir > 2) {
				while (repetir < 1 || repetir > 2) {
					System.out.print("\n\n\tEscribe un n�mero que sea valido: ");
					repetir = Integer.parseInt(in.readLine());
				}
			}
		} while (repetir == 1);
		System.out.println("\n\n\t\tGRACIAS POR USAR ESTE PROGRAMA\n");

	}
}
