
package punto3;

import java.text.DecimalFormat;

public class Tabla {

	// Se declaran los atributos
	private double numero;
	private int limiteInferior;
	private int limiteSuperior;

	// Se declara el m�todo constructor por default
	public Tabla() {

	}

	// Se declara el m�todo constructor con par�metros
	public Tabla(double numero, int limiteInferior, int limiteSuperior) {
		this.numero = numero;
		this.limiteInferior = limiteInferior;
		this.limiteSuperior = limiteSuperior;
	}

	// Se definen el m�todo get y set de las variables privadas
	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public int getLimiteInferior() {
		return limiteInferior;
	}

	public void setLimiteInferior(int limiteInferior) {
		this.limiteInferior = limiteInferior;
	}

	public int getLimiteSuperior() {
		return limiteSuperior;
	}

	public void setLimiteSuperior(int limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}

	// Se declara un objeto que elimina los decimales innecesarios en los double
	DecimalFormat format = new DecimalFormat();

	// Se declara un m�todo para mostrar la tabla de multiplicar
	public void tablaDeMultiplicar(double numero, int limiteInferior, int limiteSuperior) {

		int variableDeAyuda;

		if (limiteInferior > limiteSuperior) {
			variableDeAyuda = limiteInferior;
			limiteInferior = limiteSuperior;
			limiteSuperior = variableDeAyuda;
		}

		for (int i = limiteInferior; i <= limiteSuperior; i++) {
			System.out.println("\t" + format.format(numero) + " x " + i + " = " + format.format(numero * i));
		}
	}

}