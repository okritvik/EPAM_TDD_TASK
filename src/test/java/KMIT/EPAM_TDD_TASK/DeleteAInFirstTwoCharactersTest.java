package KMIT.EPAM_TDD_TASK;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeleteAInFirstTwoCharactersTest {
	DeleteAInFirstTwoCharacters daiftc;
	@BeforeEach
	void setUp() throws Exception {
		daiftc = new DeleteAInFirstTwoCharacters();
	}

	@Test
	void test2Characters() {
		String actual = daiftc.deleteFTwoChar("AA");
		assertEquals("",actual);
	}
	
	@Test
	void test4Characters() {
		String actual = daiftc.deleteFTwoChar("AAAA");
		assertEquals("AA",actual);
	}
	
	@Test
	void test5Characters() {
		String actual = daiftc.deleteFTwoChar("ABAAC");
		assertEquals("BAAC",actual);
	}
	
	@Test
	void test1Character() {
		String actual = daiftc.deleteFTwoChar("A");
		assertEquals("",actual);
	}
	
	@Test
	void test1DifferentCharacter() {
		String actual = daiftc.deleteFTwoChar("B");
		assertEquals("B",actual);
	}
	
	@Test
	void testSpaceCharacter() {
		String actual = daiftc.deleteFTwoChar(" ");
		assertEquals(" ",actual);
	}
	
	@Test
	void testSpaceandACharacters() {
		String actual = daiftc.deleteFTwoChar(" A");
		assertEquals(" ",actual);
	}

}
