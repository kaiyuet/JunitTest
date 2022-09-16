package testPracticeCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Junit_practice.practice_case;

class testPracticeCase {

	private practice_case practiceCase;
	
	@BeforeEach
	void setUp() throws Exception {
		practiceCase = new practice_case();
	}
	
	public void tearDown() {};

	
	// Test case 1: reverse String "reversethisString"
	@Test
	public void testReverseString1() {
		String result;
		String input = "reversethisString";
		result = practiceCase.reverse(input);
		assertEquals("gnirtSsihtesrever", result);
	}
	
	// Test case 2: reverse String "123456"
	@Test 
	public void testReverseString2() {
		String result;
		String input = "123456";
		result = practiceCase.reverse(input);
		assertEquals("654321", result);
	}
	
	// Test case 3: reverse String " "
	@Test
	public void testReverseString() {
		String result;
		String input = " ";
		result = practiceCase.reverse(input);
		assertEquals(" ", result);
	}
}
