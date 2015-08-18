/****************************************************************************************
Name            : SurveyApplicationTest
Revision Log    : 2015-08-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used to create base class. 
                :
 ****************************************************************************************/

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SurveyApplicationTest {

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
	public void giveInputThrowArrayList_GetOverAllFunctionCalled_() {
	     int k=chechExpectedOutputEqualsActualOutput();
		assertEquals(0,k); 
		
	}
	 
	 static int chechExpectedOutputEqualsActualOutput()
	 {int k=0;
		  
		    ArrayList<Participant> participant = new ArrayList<Participant>();
			participant.add(new Participant(1,"1","q2","q3"));
			participant.add(new Participant(2,"2","q2","q3"));
			participant.add(new Participant(3,"3","q2","q3"));
			participant.add(new Participant(4,"4","q2","q3"));
			participant.add(new Participant(5,"5","q2","q3"));
			double[] result1 =new double[5] ;
			SurveyApplication obj =new SurveyApplication();
			obj.participant = participant;
			result1=obj.getOverAllRating();
			for (int i = 0; i < result1.length; i++) {
				 if(result1[i]!=20)
				 {
					 k=1;return k;
				 }
			}
			return k;
	 }
	

}
