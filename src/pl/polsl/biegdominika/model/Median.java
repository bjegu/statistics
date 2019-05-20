package pl.polsl.biegdominika.model;

import static java.lang.Double.NaN;
import java.util.List;

/**
 * Class responsible for logic of calculating the value of median
 *
 * @author Dominika Bieg
 * @version 1.0.0
 */
public class Median implements StatisticInterface {

    /**
     * value of median
     */
    private final double median;

    /**
     * calculating the value of median
     *
     * @param data - list of doubles typed by the user
     */
    Median(List<Double> data) {
        if (data.isEmpty()) {
            median = NaN;
            return;
        }

        //sorting data from the smallest to the biggest value
        data.sort((a, b) -> a.compareTo(b));
        int n = data.size();

        //check wheter the size of a data collection is even or odd number,
        //then calculate the median 
        if (n == 1) {
            median = data.get(0);
        } else if (n % 2 == 0) {
            double x1 = data.get(n / 2);
            double x2 = data.get((n / 2) - 1);
            median = (x1 + x2) / 2;
        } else {
            median = data.get(n / 2);
        }
    }

    /**
     * getter created in order to share value with other classes
     *
     * @return median - the value of the median
     */
    public double getMedian() {
        return median;
    }

    /**
     * methods inserted by implementation of StatisticInterface fields needed to
     * display name of median
     *
     * @return "Median" - the name of calculated statistic
     */
    @Override
    public String getName() {
        return "Median";
    }

    /**
     * methods inserted by implementation of StatisticInterface fields needed to
     * display value of median
     *
     * @return String.valueOf(median) - calculated value of median converted
     * into the string in order to display it easier
     */
    @Override
    public String getValue() {
        return String.valueOf(median);
    }

}
