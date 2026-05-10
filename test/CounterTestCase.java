import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

class CounterTestCase {

	@Test
	void test() {
		Counter c = new Counter();
		ArrayList<Integer> listaDeNumerosTest = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
		assertAll(
				() -> assertEquals (3, c.pairCounter(listaDeNumerosTest))
				);
	}

}