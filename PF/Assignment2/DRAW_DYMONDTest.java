import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DRAW_DYMONDTest {

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
public void DRAW_DYMOND_FUNCTIONtest() {
		String expectedprogrameoutput[] = { "    1", "   121", "  12321",
				" 1234321", "123454321", " 1234321", "  12321", "   121",
				"    1" };
		DRAW_DYMOND AS1 = new DRAW_DYMOND();
		String programeoutput[] = AS1.DRAW_DYMOND_FUNCTION(5);

		 
		assertArrayEquals(expectedprogrameoutput, programeoutput);
		}
		@Test
		// Test case for draw pyramid function
	public void DRAW_DYMOND_FUNCTIONtest2() {
		String expectedprogrameoutput[] = { "  1", " 121", "12321",
				" 121", "  1" };
			DRAW_DYMOND AS1 = new DRAW_DYMOND();
			String programeoutput[] = AS1.DRAW_DYMOND_FUNCTION(3);

			 
			assertArrayEquals(expectedprogrameoutput, programeoutput);
			}
		@Test
		// Test case for draw pyramid function
	public void DRAW_DYMOND_FUNCTIONtest3() {
		String expectedprogrameoutput[] = {"1"};
			DRAW_DYMOND AS1 = new DRAW_DYMOND();
			String programeoutput[] = AS1.DRAW_DYMOND_FUNCTION(1);

			 
			assertArrayEquals(expectedprogrameoutput, programeoutput);
			}
		
	@Test
	// Test case for draw string of spaces
	public void spaces_print_function_test() {
		String expectedprogrameoutput = "    ";
		DRAW_DYMOND AS1 = new DRAW_DYMOND();
		String programeoutput = AS1.spaces(1, 5);
		assertEquals(expectedprogrameoutput, programeoutput);
	}

	@Test
	// Test case for draw string of numbers
	public void number_print_function_test() {
		String expectedprogrameoutput = "12321";
		DRAW_DYMOND AS1 = new DRAW_DYMOND();
		String programeoutput = AS1.numbers(3, 5);
		assertEquals(expectedprogrameoutput, programeoutput);
	}
}
