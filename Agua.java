package ejercicio7;

public class Agua extends Producto {
	/*Si es agua mineral nos interesa saber también el origen (nombre del manantial).*/
	private String origen;

	public Agua(double litros, double precioBase, double precioFinal, String marca, String origen) {
		super(litros, precioBase, precioFinal, marca);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	
}
