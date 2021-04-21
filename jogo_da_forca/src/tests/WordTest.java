package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Data;

class WordTest {
	Data data = new Data();
	@Test
	void testLetterCheck() {
		assertTrue(data.getMusicTest().letterCheck('O'));
		assertTrue(data.getMusicTest().letterCheck('Z'));
		assertTrue(data.getMusicTest().letterCheck('Y'));
		assertTrue(data.getMusicTest().letterCheck('_'));
		assertTrue(data.getMusicTest().letterCheck('B'));
		assertTrue(data.getMusicTest().letterCheck('U'));
		assertTrue(data.getMusicTest().letterCheck('R'));
		assertTrue(data.getMusicTest().letterCheck('N'));
		assertTrue(data.getMusicTest().letterCheck('E'));
		assertFalse(data.getMusicTest().letterCheck('F'));
		assertFalse(data.getMusicTest().letterCheck('o'));
		assertFalse(data.getMusicTest().letterCheck('z'));
		assertFalse(data.getMusicTest().letterCheck('y'));
		assertFalse(data.getMusicTest().letterCheck('1'));
		assertFalse(data.getMusicTest().letterCheck('V'));
	}
	
	@Test
	void testLetterCheckIndex() {
		assertEquals(data.getMusicTest().letterCheckIndex('O'), 0);
		assertEquals(data.getMusicTest().letterCheckIndex('Z'), 1);
		assertEquals(data.getMusicTest().letterCheckIndex('Y'), 3);
		assertEquals(data.getMusicTest().letterCheckIndex('_'), 4);
		assertEquals(data.getMusicTest().letterCheckIndex('S'), 6);
		assertEquals(data.getMusicTest().letterCheckIndex('E'), 12);
		assertEquals(data.getMusicTest().letterCheckIndex('e'), -1);
		assertEquals(data.getMusicTest().letterCheckIndex('o'), -1);
		assertEquals(data.getMusicTest().letterCheckIndex('1'), -1);
		assertEquals(data.getMusicTest().letterCheckIndex('z'), -1);
		assertEquals(data.getMusicTest().letterCheckIndex('V'), -1);
		assertEquals(data.getMusicTest().letterCheckIndex('F'), -1);
	}
}
