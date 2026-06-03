package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Arrays;

public class Multioperador {
	
	ArrayList<Integer> arrayDeNumerosEnteros = new ArrayList<Integer>(Arrays.asList(5,6,10,31,-5,-10));
	
	public int suma (ArrayList<Integer> listaDada) {
		int valorARetornar = 0;
		for (int n : listaDada) {
			valorARetornar += n;
		}
		return (valorARetornar);
	}
	
	public static void main(String[] args) {
        Multioperador multioperador = new Multioperador();
        
         System.out.println(multioperador.suma(multioperador.arrayDeNumerosEnteros));
	}
}
