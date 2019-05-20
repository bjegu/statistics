
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
 *
 * @author Dominika
 * @version 1.0.0
 */
public class StandardDeviationTest {
    
    public StandardDeviationTest() {
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
     * Test of getStandardDeviation method, of class StandardDeviation.
     */
  @Test
    public void testGetStandardDeviation() {
        System.out.println("getStandardDeviation");
        // 1' single
        StandardDeviation instance = new StandardDeviation(Arrays.asList(5d), new Average(Arrays.asList(5d)));
        double expResult = 0.0;
        double result = instance.getStandardDeviation();
        assertEquals(expResult, result, 0.0);
        
        //2' even
        instance = new StandardDeviation(Arrays.asList(5d,2d), new Average(Arrays.asList(3.5d)));
        expResult = 1.5;
        result = instance.getStandardDeviation();
        assertEquals(expResult, result, 0.0);
        
        //3' odd
        instance = new StandardDeviation(Arrays.asList(5d,2d,2d), new Average(Arrays.asList(3d)));
        expResult = 1.4142135623731;
        result = instance.getStandardDeviation();
        assertEquals(expResult, result, 0.1);
        
        //4' double
        instance = new StandardDeviation(Arrays.asList(9.32d,35.32d,-32.12d), new Average(Arrays.asList(4.173333333333335)));
        expResult = 27.771742633275;
        result = instance.getStandardDeviation();
        assertEquals(expResult, result, 0.00001);
        
        //5' no element
        instance = new StandardDeviation(Arrays.asList(), new Average(Arrays.asList()));
        expResult = NaN;
        result = instance.getStandardDeviation();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getName method, of class StandardDeviation.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        StandardDeviation instance = new StandardDeviation(Arrays.asList(),new Average(Arrays.asList()));
        String expResult = "Standard Deviation";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValue method, of class StandardDeviation.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        // 1' single
        StandardDeviation instance = new StandardDeviation(Arrays.asList(5d), new Average(Arrays.asList(5d)));
        String expResult = String.valueOf(0.0);
        String result = instance.getValue();
        assertEquals(expResult, result);
        
        //2' even
        instance = new StandardDeviation(Arrays.asList(5d,2d), new Average(Arrays.asList(3.5d)));
        expResult = String.valueOf(1.5);
        result = instance.getValue();
        assertEquals(expResult, result);
        
        //3' odd
        instance = new StandardDeviation(Arrays.asList(5d,2d,2d), new Average(Arrays.asList(3d)));
        expResult = String.valueOf(1.4142135623730951);
        result = instance.getValue();
        assertEquals(expResult, result);
        
        //4' double
        instance = new StandardDeviation(Arrays.asList(9.32d,35.32d,-32.12d),new Average(Arrays.asList(4.173333333333335)));
        expResult = String.valueOf(27.77174263327544);
        result = instance.getValue();
        assertEquals(expResult, result);
        
        //5' no element
        instance = new StandardDeviation(Arrays.asList(),new Average(Arrays.asList()));
        expResult = String.valueOf(NaN);
        result = instance.getValue();
        assertEquals(expResult, result);
    }
    
}