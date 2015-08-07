package assignment;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RemoveDuplicateValueFromArrayTest {

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
		RremoveDuplicateValueFromArray RDV=new RremoveDuplicateValueFromArray();
		int c[]={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		String s=RDV.RemoveDuplicates(c);
		int b[]={2,5,4,6,3,8,9,0};
		assertEquals(Arrays.toString(b),s);
	}

}
