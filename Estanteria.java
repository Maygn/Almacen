package ejercicio7;

public class Estanteria {
	/*Inicialmente, el almacén tendrá 5 estanterías (identificada con
 un número empezando por el 1 y hasta el 5, que en ningun caso se repiten), cada una de ellas con 6 huecos.*/
	static int idEstanteria;
	Producto[] estanteMueble= new Producto[6];
	
	//constructor
	Estanteria(Producto[] estante) {
		super();
		this.estanteMueble = estante;
	}
	public static int getIdEstanteria() {
		return idEstanteria;
	}
	public static void setIdEstanteria(int idEstanteria) {
		Estanteria.idEstanteria = idEstanteria;
	}
	public Producto[] getEstanteMueble() {
		return estanteMueble;
	}
	public void setEstanteMueble(Producto[] estante) {
		this.estanteMueble = estante;
	} 
	

}
