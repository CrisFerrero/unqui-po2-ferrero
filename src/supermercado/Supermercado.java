package supermercado;

import java.util.ArrayList;

public class Supermercado {
	public String nombre;
	public String direccion;
	public ArrayList<Producto> productos;
	
	public Supermercado (String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public void agregarProducto(Producto p) {
		this.productos.add(p);
	}
	
	public Double getPrecioTotal() {
		Double precioTotal = 0d;
		for (Producto p : this.productos) {
			precioTotal += p.precio;
		}
		return precioTotal;
	}
}
