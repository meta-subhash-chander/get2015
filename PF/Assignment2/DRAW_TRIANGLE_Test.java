import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DRAW_TRIANGLE_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	// Test case for draw pyramid function
	public void DRAW_TRIANGLE_FUNCTION_test()
	{ int n=5;
	String expected[] = { "12345", " 1234", "  123", "   12", "    1" };
	DRAW_TRIANGLE AS2 = new DRAW_TRIANGLE();
	String output[] = AS2.DRAW_TRIANGLE_FUNCTION(n);

	for (int i = 0; i < n; i++) {
		assertEquals(expected[i], output[i]);
	}
		
	}
	@Test
	// Test case for draw pyramid function
	public void DRAW_TRIANGLE_FUNCTION_test1()
	{ int n=3;
	String expected[] = { "123", " 12", "  1" };
	DRAW_TRIANGLE AS2 = new DRAW_TRIANGLE();
	String output[] = AS2.DRAW_TRIANGLE_FUNCTION(n);

	for (int i = 0; i < n; i++) {
		assertEquals(expected[i], output[i]);
	}
		
	}
	@Test
	// Test case for draw pyramid function
	public void DRAW_TRIANGLE_FUNCTION_test2()
	{ int n=1;
	String expected[] = {  "1" };
	DRAW_TRIANGLE AS2 = new DRAW_TRIANGLE();
	String output[] = AS2.DRAW_TRIANGLE_FUNCTION(n);

	for (int i = 0; i < n; i++) {
		assertEquals(expected[i], output[i]);
	}
		
	}

	@Test
	// Test case for draw string of spaces
	public void spaces_print_function_test() {
		String expected = " ";
		DRAW_DYMOND AS2 = new DRAW_DYMOND();
		String output = AS2.spaces(1, 2);
		assertEquals(expected, output);
	}

	@Test
	// Test case for draw string of numbers
	public void numbers_print_function_test() {
		String expected = "1";
		DRAW_DYMOND AS2 = new DRAW_DYMOND();
		String output = AS2.numbers(1, 2);
		assertEquals(expected, output);
	}
}
