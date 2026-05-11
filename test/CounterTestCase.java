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
		
		ArrayList<Integer> arrayDeNumerosTest = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6));
		assertAll(
				() -> assertEquals (4, counter.contadorDeParesDe(arrayDeNumerosTest)),
				() -> assertEquals (3, counter.contadorDeImparesDe(arrayDeNumerosTest)),
				() -> assertEquals (2, counter.contadorDeMultiplosDe(arrayDeNumerosTest, 5)),
				() -> assertEquals (7, counter.contadorDeMultiplosDe(arrayDeNumerosTest, 1)),
				() -> assertEquals (3, counter.contadorDeMultiplosDe(arrayDeNumerosTest, 3))
				);
	}

}