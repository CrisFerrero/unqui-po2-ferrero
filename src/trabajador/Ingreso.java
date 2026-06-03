package trabajador;

public class Ingreso {
	public String mes;
	public String concepto;
	public Double montoPercibido;
	
	public Ingreso(String mes, String concepto, Double montoPercibido) {
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	//sabemos que si concepto = "impuestoAlTrabajador", montoPercibido = montoImponible
	//sabemos que si concepto = "horasExtra"
	
	public String mes() {
		return this.mes;
	}
	
	public String concepto() {
		return this.concepto;
	}
	
	public Double montoPercibido() {
		return this.montoPercibido;
	}
	
	
}
