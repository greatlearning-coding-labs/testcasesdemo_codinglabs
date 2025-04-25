package test.java;

import org.junit.jupiter.api.Test;

import main.java.Assignment;

import static org.junit.jupiter.api.Assertions.*;

public class AssignmentTest {

	@Test
	void testNormalSentence() {
		assertEquals("dlroW olleH", Assignment.reverseWords("Hello World"));
	}

	@Test
	void testSingleWord() {
		assertEquals("avaJ", Assignment.reverseWords("Java"));
	}

	@Test
	void testEmptyString() {
		assertEquals("", Assignment.reverseWords(""));
	}

	@Test
	void testNullInput() {
		assertNull(null,Assignment.reverseWords(""));
	}

	@Test
	void testMultipleSpaces() {
		assertEquals("dlroW   olleH", Assignment.reverseWords("Hello   World"));
	}
}
