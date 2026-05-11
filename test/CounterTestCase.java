import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

class CounterTestCase {

	@Test
	void test() {
		Counter counter = new Counter();
		
		ArrayList<Integer> arrayDeNumerosEnteros = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,10,31,-5,-10,3,3,6,9,-197)); 
		// contiene 16 elementos: 7 pares,  9 impares, 3 negativos, 12 naturales, y cero
		
		ArrayList<Integer> arrayDeNumerosEnterosV2 = new ArrayList<Integer>(Arrays.asList(5,6,10,31,-5,-10));
		
		ArrayList<Integer> arrayDeNumerosEnterosV3 = new ArrayList<Integer>(Arrays.asList(96380, 5198, 24628));
	
		ArrayList<Integer> arraySencilloNaturales = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,9,1)); 
		
		//Ejercicio 1 (dado un array<int>, contadorDePares, impares y multiplos)
		assertAll(
				() -> assertEquals (7, counter.contadorDeParesDe(arrayDeNumerosEnteros)),
				
				() -> assertEquals (9, counter.contadorDeImparesDe(arrayDeNumerosEnteros)),
				
				() -> assertEquals (5, counter.contadorDeMultiplosDe(arrayDeNumerosEnteros, 5)),
				() -> assertEquals (16, counter.contadorDeMultiplosDe(arrayDeNumerosEnteros, 1)),
				() -> assertEquals (7, counter.contadorDeMultiplosDe(arrayDeNumerosEnteros, 3))
				);
		
		//Ejercicio 2 (dado un array<int>, devuelve el que tenga mas cifras pares)
		assertAll(
				() -> assertEquals(arraySencilloNaturales, counter.enteroALista(1234591)),
				
				() -> assertEquals(0 , counter.contadorDeParesDelEntero(13591)),
				() -> assertEquals(4, counter.contadorDeParesDelEntero(236847)),
				
				() -> assertEquals(24628, counter.elQueContieneMasParesDe(arrayDeNumerosEnterosV3))

				/*
				() -> assertEquals (3, counter.contadorDeParesDelEntero(1356870)),
				() -> assertEquals (0, counter.contadorDeParesDelEntero(1395731)),
				() -> assertEquals (3, counter.contadorDeParesDelEntero(-23986))
				*/
				
				);
	}

}