package trabajador;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;



public class IngresoTest {
	
	private Ingreso ingresoPresentismo1;
	private Ingreso ingresoAguinaldo1;
	
	@BeforeEach
	public void variables() {
		ingresoPresentismo1 = new Ingreso("Enero", "BonoPorPresentismo", 15500d);
		ingresoAguinaldo1 = new Ingreso("Junio", "Aguinaldo", 300000d);
	}
	
	@Test
	public void testInstVar() {
		assertEquals("Enero", ingresoPresentismo1.mes());
		assertEquals("Aguinaldo", ingresoAguinaldo1.concepto());
		assertEquals(15500d, ingresoPresentismo1.montoPercibido());
	}
	
}
