package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Arrays;


public class Counter {
	
	private ArrayList<Integer> arregloDeEnteros = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6));
	
	// ------------------------- EJERCICIO 1 ---------------------------
	
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
			if (Math.abs(n) % 2 == 1) {
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
	

// ------------------------------------------------------------------
	
//	-------------------------- EJERCICIO 2 --------------------------
	
	public ArrayList<Integer> enteroALista(int valorDado) {
		int valorDadoAbs = Math.abs(valorDado);
		ArrayList<Integer> arrayARetornar = new ArrayList<Integer>();
		while (valorDadoAbs > 0) {
			arrayARetornar.add(0, valorDadoAbs % 10);
			valorDadoAbs /= 10;
		}
		return(arrayARetornar);
	}
	
	public int contadorDeParesDelEntero (int entero) {
		return (this.contadorDeParesDe(this.enteroALista(entero)));
	}
	
	public int elQueContieneMasParesDe (ArrayList<Integer> listaEnteros) {
		int valorConMasPares = contadorDeParesDelEntero(listaEnteros.getFirst());
		// Si lo inicializase en 0 y hubiese un valor con valores impares, devolvería cero, ya que la cantidad de numeros pares en 0 es 1.
		for (int n : listaEnteros) {
			if (this.contadorDeParesDe(this.enteroALista(n)) > this.contadorDeParesDelEntero(valorConMasPares)) {
				valorConMasPares = n;
			}
		}
		return (valorConMasPares);
	}
	
	
	// ---------------------------- SUBTESTS --------------------------
	public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("La cantidad de numeros pares es " + counter.contadorDeParesDe(counter.arregloDeEnteros));
        System.out.println("La cantidad de numeros impares es " + counter.contadorDeImparesDe(counter.arregloDeEnteros));
        System.out.println("La cantidad de multiplos del valor dado es " + counter.contadorDeMultiplosDe(counter.arregloDeEnteros, 3));
        System.out.println("El numero dado como lista es " + counter.enteroALista(20563));
        
	}
}


