package supermercado;

public class Producto{
	public String nombre;
	public Double precio;
	public Boolean esPrecioCuidado = false;
	
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public Boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
	public void aumentarPrecio(Double d) {
		this.precio += d;
	}
}
