import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class QuickSortTest {

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
    public void QuickSortest() {
        QuickSort quick=new QuickSort();
        int expected[]={2,5,8,9,10,11,55,77};
        int input[]={2,5,8,9,10,55,77,11};
        quick.sort(input, 0,input.length-1);
          assertArrayEquals(expected,input);
    }

    @Test
    public void QuickSortestForZero() {
        QuickSort quick=new QuickSort();
        int expected[]={};
        int input[]={};
        quick.sort(input, 0, input.length-1);
          assertArrayEquals(expected,input);
    }
    
    @Test
    public void QuickSortestForRepeatNumber() {
        QuickSort quick=new QuickSort();
        int expected[]={1,1,2,2,5,5};
        int input[]={2,5,1,5,2,1};
        quick.sort(input, 0, input.length-1);
          assertArrayEquals(expected,input);
    }


}