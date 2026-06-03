package trabajador;

public class IngresoPorHoraExtra extends Ingreso{
	public int cantidadHorasExtra;
	
	
	public IngresoPorHoraExtra(String mes, String concepto, Double montoPercibido, int cantidadHorasExtra) {
		super(mes, concepto, montoPercibido);
		this.cantidadHorasExtra = cantidadHorasExtra;
	}
}
