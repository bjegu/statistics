
package pl.polsl.biegdominika.model;

import static java.lang.Double.NaN;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *CLASS of test for average 
 * @author Dominika Bieg
 * @version 1.0
 * 
 */
public class AverageTest {
    
    public AverageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAverage method, of class Average.
     */
    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        // 1' single
        Average instance = new Average(Arrays.asList(5d));
        double expResult = 5.0;
        double result = instance.getAverage();
        assertEquals(expResult, result, 0.0);
        
        //2' even
        instance = new Average(Arrays.asList(5d,2d));
        expResult = 3.5;
        result = instance.getAverage();
        assertEquals(expResult, result, 0.0);
        
        //3' odd
        instance = new Average(Arrays.asList(5d,2d,2d));
        expResult = 3.0;
        result = instance.getAverage();
        assertEquals(expResult, result, 0.0);
        
        //4' double
        instance = new Average(Arrays.asList(9.32d,35.32d,-32.12d));
        expResult = 4.173333333333335;
        result = instance.getAverage();
        assertEquals(expResult, result, 0.00001);
        
        //5' no element
        instance = new Average(Arrays.asList());
        expResult = NaN;
        result = instance.getAverage();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getName method, of class Average.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Average instance = new Average(Arrays.asList());
        String expResult = "Average";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValue method, of class Average.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        // 1' single
        Average instance = new Average(Arrays.asList(5d));
        String expResult = String.valueOf(5.0);
        String result = instance.getValue();
        assertEquals(expResult, result);
        
        //2' even
        instance = new Average(Arrays.asList(5d,2d));
        expResult = String.valueOf(3.5);
        result = instance.getValue();
        assertEquals(expResult, result);
        
        //3' odd
        instance = new Average(Arrays.asList(5d,2d,2d));
        expResult = String.valueOf(3.0);
        result = instance.getValue();
        assertEquals(expResult, result);
        
        //4' double
        instance = new Average(Arrays.asList(9.32d,35.32d,-32.12d));
        expResult = String.valueOf(4.173333333333335);
        result = instance.getValue();
        assertEquals(expResult, result);
        
        //5' no element
        instance = new Average(Arrays.asList());
        expResult = String.valueOf(NaN);
        result = instance.getValue();
        assertEquals(expResult, result);
    }
    
}
