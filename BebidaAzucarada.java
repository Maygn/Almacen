package ejercicio7;

public class BebidaAzucarada extends Producto{
	/*Si es una bebida azucarada queremos saber el porcentaje que tiene de azúcar 
	 * y si tiene o no alguna promoción (si la tiene tendrá un descuento del 10% en el precio final).*/
	private double azucar;
	private boolean promocion;
	
	public BebidaAzucarada(double litros, double precioBase, double precioFinal, String marca, double azucar,
			boolean promocion) {
		super(litros, precioBase, precioFinal, marca);
		this.azucar = azucar;
		this.promocion = promocion;
	}

	public double getAzucar() {
		return azucar;
	}

	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	

}
