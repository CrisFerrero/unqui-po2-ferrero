package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Arrays;


public class Counter {
	
	ArrayList<Integer> arregloDeEnteros = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6));
	
	
	//CAMBIAR A PRIVATE
	public int contadorDeParesDe(ArrayList <Integer> nl) {
		int cantidadDePares = 0;
		for (int n : nl) {
			if (n % 2 == 0) {
				cantidadDePares += 1;
			}
		}
		return cantidadDePares;
	}
	
	
	public int contadorDeImparesDe(ArrayList <Integer> nl) {
		int cantidadDeImpares = 0;
		for (int n : nl) {
			if (n % 2 == 1) {
				cantidadDeImpares += 1;
			}
		}
		return cantidadDeImpares;
	}
	
	
	public int contadorDeMultiplosDe(ArrayList <Integer> nl, int multiplo) {
		int cantidadDeMultiplos = 0;
		for (int n : nl) {
			if (n % multiplo == 0) {
				cantidadDeMultiplos += 1;
			}
		}
		return cantidadDeMultiplos;
	}
	
	
	public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("La cantidad de numeros pares es " + counter.contadorDeParesDe(counter.arregloDeEnteros));
        System.out.println("La cantidad de numeros impares es " + counter.contadorDeImparesDe(counter.arregloDeEnteros));
        System.out.println("La cantidad de multiplos del valor dado es " + counter.contadorDeMultiplosDe(counter.arregloDeEnteros, 3));
	}

}


