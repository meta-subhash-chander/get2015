import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ASSIGNMENT2Test {

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
	public void test() {
		String expected[] = { "12345", " 1234", "  123", "   12", "    1" };
		ASSIGNMENT2 AS2 = new ASSIGNMENT2();
		String output[] = AS2.drawAssignment2(5);

		for (int i = 0; i < 5; i++) {
			assertEquals(expected[i], output[i]);
		}
	}

	@Test
	// Test case for draw string of spaces
	public void test1() {
		String expected = " ";
		ASSIGNMENT2 AS2 = new ASSIGNMENT2();
		String output = AS2.spaces(1, 2);
		assertEquals(expected, output);
	}

	@Test
	// Test case for draw string of numbers
	public void test2() {
		String expected = "1";
		ASSIGNMENT2 AS2 = new ASSIGNMENT2();
		String output = AS2.numbers(1, 2);
		assertEquals(expected, output);
	}
}
