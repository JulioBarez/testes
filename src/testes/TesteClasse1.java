package testes;
/**
 * @author julio
 * Classe test jUnit
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codigo.Classe1;

class TesteClasse1 {

	@Test
	void test() {
		Classe1 c = new Classe1();
		assertEquals(1,c.fibonacci(1));
		assertEquals(1,c.fibonacci(2));
		assertEquals(2,c.fibonacci(3));
		assertEquals(3,c.fibonacci(4));
		assertEquals(5,c.fibonacci(5));
		assertEquals(8,c.fibonacci(6));
		assertEquals(13,c.fibonacci(7));
		
	}

}
