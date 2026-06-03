package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	public Double descuento;
	
	
	public ProductoPrimeraNecesidad(String nombre, Double precio) {
		super(nombre, precio);
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado, Double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
	public Double getPrecio() {
		return this.precio - this.getDescuento();
	}
	
	public Double getDescuento() {
		return this.precio * this.descuento;
	}
	
	//public double aplicarDescuentoPrimeraNecesidad(Double precio) {
	//	producto
	//}

}


