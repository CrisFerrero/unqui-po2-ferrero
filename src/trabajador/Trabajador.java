package trabajador;

import java.util.ArrayList;

public class Trabajador {
	public int idTrabajador;
	public ArrayList<Ingreso> ingresosAnuales;
	
	public Trabajador(int idTrabajador, ArrayList<Ingreso> ingresosAnuales) {
		this.idTrabajador = idTrabajador;
		this.ingresosAnuales = ingresosAnuales;
	}
	
	public int idTrabajador() {
		return this.idTrabajador;
	}
	
	public ArrayList<Ingreso> ingresosAnuales(){
		return this.ingresosAnuales;
	}
	
	public Double getTotalPercibido() {
		//deberia ser un "sum (this.ingresos de x mes .monto)"?
		//     el problema con esto es que no espera parámetros
		Double totalPercibido = 0d;
		for (Ingreso ingreso : this.ingresosAnuales){
			totalPercibido += ingreso.montoPercibido;
		}
		return totalPercibido;
	}
	
	/*
	 no pude entender que era lo que pedia hacer acá
	 
	public Double getMontoImponible() {
		Double monto = 0;
		if this.
	}
	
	
	
	public Double getImpuesto() {
		return this.getMontoImponible *0.02d;
	}
	*/
}

/*
public Double getTotalPercibido() {
	
}
*/