package supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 10d, false, 0.45d);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(5.5d), leche.getPrecio());
	}
}
