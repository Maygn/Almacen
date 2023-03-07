package ejercicio7;

public class Producto {
/*	 * De los productos nos interesa saber su identificador (cada uno tiene uno distinto), cantidad de litros, precio base, precio final (precio final+IVA) y marca.*/
	protected static int identificador;
	protected double litros;
	protected double precioBase;
	protected double precioFinal;
	protected String marca;
	public Producto(double litros, double precioBase, double precioFinal, String marca) {
		super();
		this.litros = litros;
		this.precioBase = precioBase;
		this.precioFinal = precioFinal;
		this.marca = marca;
	}
	public Producto() {
		super();
	}
	public static int getIdentificador() {
		return identificador;
	}
	public static void setIdentificador(int identificador) {
		Producto.identificador = identificador;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public double getPrecioFinal() {
		return precioFinal;
	}
	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
