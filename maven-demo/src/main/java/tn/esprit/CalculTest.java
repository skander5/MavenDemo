package tn.esprit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculTest {
	
	Calcul cl = new Calcul();
	
	@Test
	public void testCalculerSom() {
		assertEquals(25, cl.calculerSom(10, 15));
	}

}
