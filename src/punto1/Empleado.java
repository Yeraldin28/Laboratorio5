
package punto1;

public class Empleado {

	// Se declaran los atributos
	private long identificacion;
	private double salario;
	private String nombre;
	private String apellido;

	// Se declara el m�todo constructor por default
	public Empleado() {

	}

	// Se declara el m�todo constructor con par�metros
	public Empleado(long identificacion, double salario, String nombre, String apellido) {
		this.identificacion = identificacion;
		this.salario = salario;
		this.nombre = nombre;
		this.apellido = apellido;

	}

	// Se definen el m�todo get y set de las variables privadas
	public long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// Se declara un m�todo para calcular la bonificaci�n del salario
	public double salarioMasBonificacion(double salario) {
		if (salario < 500000) {
			return salario + (salario * 0.25);
		} else {
			return salario + (salario * 0.1);
		}
	}
}