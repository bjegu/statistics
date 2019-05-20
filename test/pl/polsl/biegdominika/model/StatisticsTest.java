
package pl.polsl.biegdominika.model;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dominika
 */
public class StatisticsTest {
    
    public StatisticsTest() {
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
     * Test of listOfStats method, of class Statistics.
     */
    @Test
    public void testListOfStats() {
        System.out.println("listOfStats");
        
        List<Double> list3 = Arrays.asList(5d,2d,2d);
        Statistics instance = new Statistics(list3);
        String expResultMediana = "2.0";
        String expResultAverage = "3.0";
        String expResultSD = "1.4142135623730951";
        List<StatisticInterface> result = instance.listOfStats();
        result.forEach(stat -> {
            if(stat instanceof Average){
                assertEquals(expResultAverage, stat.getValue());
            }
            if(stat instanceof Median){
                assertEquals(expResultMediana, stat.getValue());
            }
            if(stat instanceof StandardDeviation){
                assertEquals(expResultSD, stat.getValue());
            }
        });
        if(result.size() != 3){
            fail("Diffrent quantity of availble statastic. Excepted 3 was "+result.size());
        }
        
//        List<Double> list1 = Arrays.asList(5d);
//        List<Double> list2 = Arrays.asList(5d,2d);
//        expResult = String.valueOf(3.5);
//        result = instance.getValue();
//        assertEquals(expResult, result);
//        
//        //3' odd
//
//        expResult = String.valueOf(3.0);
//        result = instance.getValue();
//        assertEquals(expResult, result);
//        
//        //4' double
//        instance = new Average(Arrays.asList(9.32d,35.32d,-32.12d));
//        expResult = String.valueOf(4.173333333333335);
//        result = instance.getValue();
//        assertEquals(expResult, result);
//        
//        //5' no element
//        instance = new Average(Arrays.asList());

    }
    
}
