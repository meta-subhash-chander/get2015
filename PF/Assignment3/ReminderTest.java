import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ReminderTest {

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
	/**Test for int Reminder_Function(int x,int y) 
	 * @param x=0 
	 * @param y=0 
	 * @return -1 the Reminder if x divided by y.
	 */
	public void ReminderTest1() {
		 int expectedoutput=-1;
		 Reminder rem = new Reminder();
		 assertEquals(expectedoutput,rem.Reminder_Function(0,0));
	}
	@Test
	/**Test for int Reminder_Function(int x,int y) 
	 * @param x=2  
	 * @param y=1  
	 * @return 0 the Reminder if x divided by y.
	 */
	public void ReminderTest2() {
		 int expectedoutput=0;
		 Reminder rem = new Reminder();
		 assertEquals(expectedoutput,rem.Reminder_Function(2,1));
	}
	@Test
	/**Test for int Reminder_Function(int x,int y) 
	 * @param x=2  
	 * @param y=0  
	 * @return -1 the Reminder if x divided by y.
	 */
	public void ReminderTest3() {
		 int expectedoutput=-1;
		 Reminder rem = new Reminder();
		 assertEquals(expectedoutput,rem.Reminder_Function(2,0));
	}
	@Test
	/**Test for int Reminder_Function(int x,int y) 
	 * @param x=100  
	 * @param y=3  
	 * @return 1the Reminder if x divided by y.
	 */
	public void ReminderTest4() {
		 int expectedoutput=1;
		 Reminder rem = new Reminder();
		 assertEquals(expectedoutput,rem.Reminder_Function(100,3));
	}
	@Test
	/**Test for int Reminder_Function(int x,int y) 
	 * @param x=4 This is the first parameter to Reminder_Function.
	 * @param y=4 This is the second parameter to Reminder_Function.
	 * @return 0the Reminder if x divided by y.
	 */
	public void ReminderTest5() {
		 int expectedoutput=0;
		 Reminder rem = new Reminder();
		 assertEquals(expectedoutput,rem.Reminder_Function(4,4));
	}
}
