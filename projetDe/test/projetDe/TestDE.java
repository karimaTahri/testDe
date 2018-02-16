package projetDe;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDE {

	

	@Test
	public void testLancer() {
		De d = new De();
		int resultat = d.lancer();
		assertTrue(resultat>0&&resultat<7);
	}

	
	@Test
	public void testCtor() {
		De d = new De();
		assertNotNull(d);
	}

}
