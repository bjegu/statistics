
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
        
        List<Double> values = Arrays.asList(5d,2d,2d);
        Statistics instance = new Statistics(values);
        String expResultMediana = "2.0";
        String expResultAverage = "3.0";
        String expResultSD = "1.4142135623730951";
        List<StatisticInterface> result = instance.listOfStats();
        result.forEach(stat -> {
            if(stat instanceof Average){
                assertEquals(expResultAverage, stat.getValue());
            }
            else if(stat instanceof Median){
                assertEquals(expResultMediana, stat.getValue());
            }
           else if(stat instanceof StandardDeviation){
                assertEquals(expResultSD, stat.getValue());
            }
            else{
            fail("Unspecified statistics");
        }
        });
        if(result.size() != 3){
            fail("Diffrent quantity of availble statastic. Excepted 3 was "+result.size());
        }
        

    }
    
}
