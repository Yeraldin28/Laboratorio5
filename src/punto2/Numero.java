
package punto2;

public class Numero {

	// Se declaran los atributos
	private double dato;

	// Se declara el m�todo constructor por default
	public Numero() {

	}

	// Se declara el m�todo constructor con par�metros
	public Numero(double dato) {
		this.dato = dato;
	}

	// Se definen el m�todo get y set de las variables privadas
	public double getDato() {
		return dato;
	}

	public void setDato(double dato) {
		this.dato = dato;
	}

	// M�todos para calcular el factorial de un n�mero
	public double factorial(double dato) {
		long resultado = 1;

		for (int factor = 2; factor <= dato; factor++) {
			resultado *= factor;
		}
		return resultado;
	}

}