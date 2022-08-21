
package punto2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA CALCULA EL FACTORIAL, RAIZ CUADRADA Y LOG. NATURAL DE UN N�MERO\n");

		// Se declara un objeto que realiza la lectura de datos
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se declara un objeto que pasa de notacion cientifica a decimal
		DecimalFormat df = new DecimalFormat("#.###");
		df.setMaximumFractionDigits(8);

		// Se declaran las variables a usar
		double numero;
		String factorial, raiz, ln;
		int repetir, decision;

		do {
			// Se le pide al usuario el n�mero a operar
			System.out.print("\n\tIngrese el numero a operar: ");
			numero = Double.parseDouble(in.readLine());

			// Se declara un objeto de tipo Numero
			Numero numero1 = new Numero(numero);

			// Se calcula las distintas funciones
			if (numero < 0) {
				factorial = "-" + df.format(numero1.factorial(Math.abs(numero1.getDato())));
			} else {
				factorial = df.format(numero1.factorial(numero1.getDato()));
			}

			if (numero < 0) {
				raiz = "\n\tNo existe ra�z cuadrada para este n�mero";
			} else {
				raiz = df.format(Math.sqrt(numero1.getDato()));
			}

			if (numero < 0) {
				ln = "\n\tNo existe logaritmo natural para este n�mero";
			} else if (numero == 0) {
				ln = " menos infinito";
			} else {
				ln = df.format(Math.log(numero1.getDato()));
			}

			// Se le pide al usuario que elija el tipo de n�mero que va a convertir
			System.out.print("\n\tQu� deseas calcular? \n" + "\n\t1. Factorial" + "\n\t2. Ra�z cuadrada"
					+ "\n\t3. Logaritmo natural" + "\n\n\tDecisi�n: ");
			decision = Integer.parseInt(in.readLine());

			// Se comprueba que la opci�n este bien elegida
			if (decision < 1 || decision > 3) {
				while (decision < 1 || decision > 3) {
					System.out.print("\n\n\tEscribe un n�mero que sea valido: ");
					decision = Integer.parseInt(in.readLine());
				}
			}

			switch (decision) {
			case 1:
				System.out
						.print("\n\n\tEl factorial del n�mero " + Math.floor(numero1.getDato()) + " es: " + factorial);
				break;
			case 2:
				System.out.print("\n\n\tLa ra�z cuadrada del n�mero " + numero1.getDato() + " es: " + raiz);
				break;
			case 3:
				System.out.print("\n\n\tEl logaritmo natural del n�mero " + numero1.getDato() + " es: " + ln);
				break;
			}

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
