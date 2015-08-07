package assignment;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JoinSortedaArrayTest {

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
	public void test()
	{
		int[] a={1,3,4};
	    int[] b={2,5,6};
		JoinSortedArray JSA=new JoinSortedArray();
		String s=JSA.Join(a,3,b,3);
		int[] c={1,2,3,4,5,6};
		
		assertEquals(Arrays.toString(c),s);
	}

}
