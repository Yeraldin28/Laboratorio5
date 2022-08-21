
package punto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA CALCULA EL SUBSIDIO DE UN EMPLEADO\n");

		// Se declara un objeto que realiza la lectura de datos
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se declara un objeto que pasa de notacion cientifica a decimal
		DecimalFormat df = new DecimalFormat("#.###");
		df.setMaximumFractionDigits(8);

		// Se declaran las variables a usar
		long identificacion;
		String nombre, apellido, chequeMensual;
		double salario;
		int repetir;

		do {
			// Se le pide al usuario los datos del empleado y se comprueba que esten bien
			// escritos
			System.out.print("\n\tIngrese la informaci�n del empleado\n\n\tIdentificacion: ");
			identificacion = Long.parseLong(in.readLine());

			if (identificacion < 0) {
				while (identificacion < 0) {
					System.out.print("\n\n\tEscribe un n�mero que no sea negativo: ");
					identificacion = Long.parseLong(in.readLine());
				}
			}

			System.out.print("\n\tSalario: ");
			salario = Double.parseDouble(in.readLine());

			if (salario < 0) {
				while (salario < 0) {
					System.out.print("\n\n\tEscribe un n�mero que no sea negativo: ");
					salario = Double.parseDouble(in.readLine());
				}
			}

			System.out.print("\n\tNombre: ");
			nombre = in.readLine();

			System.out.print("\n\tApellido: ");
			apellido = in.readLine();

			// Se declara un objeto de tipo Empleado
			Empleado trabajador = new Empleado(identificacion, salario, nombre, apellido);

			// Se calcula la bonificaci�n del salario del empleado
			chequeMensual = df.format(trabajador.salarioMasBonificacion(trabajador.getSalario()));

			// Se muestran los datos del empleado y el cheque mensual que se genera
			System.out.print("\n\tEl empleado " + trabajador.getNombre() + " " + trabajador.getApellido()
					+ " con identificaci�n " + trabajador.getIdentificacion() + " con salario inicial de: "
					+ trabajador.getSalario() + "\n\tDebe recibir un cheque mensual de: $" + chequeMensual);

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
