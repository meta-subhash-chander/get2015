import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ASSIGNMENT1Test {

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
		String expectedprogrameoutput[] = { "    1", "   121", "  12321",
				" 1234321", "123454321", " 1234321", "  12321", "   121",
				"    1" };
		ASSIGNMENT1 AS1 = new ASSIGNMENT1();
		String programeoutput[] = AS1.drawASSIGNMENT1(5);

		for (int i = 0; i < 9; i++) {
			assertEquals(expectedprogrameoutput[i], programeoutput[i]);
		}
	}

	@Test
	// Test case for draw string of spaces
	public void test1() {
		String expectedprogrameoutput = "    ";
		ASSIGNMENT1 AS1 = new ASSIGNMENT1();
		String programeoutput = AS1.spaces(1, 5);
		assertEquals(expectedprogrameoutput, programeoutput);
	}

	@Test
	// Test case for draw string of numbers
	public void test2() {
		String expectedprogrameoutput = "12321";
		ASSIGNMENT1 AS1 = new ASSIGNMENT1();
		String programeoutput = AS1.numbers(3, 5);
		assertEquals(expectedprogrameoutput, programeoutput);
	}
}
