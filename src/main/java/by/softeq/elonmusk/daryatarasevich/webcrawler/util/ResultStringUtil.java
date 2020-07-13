package by.softeq.elonmusk.daryatarasevich.webcrawler.util;

import by.softeq.elonmusk.daryatarasevich.webcrawler.entity.ResultString;

/**
 * Class of utils for ResultString class.
 *
 * @autor Darya Tarasevich
 */
public class ResultStringUtil {
    /**
     * To get get total value(last number value) from the string.
     *
     * @param resultString
     * @return total
     */
    public static int getTotal(ResultString resultString) {
        String[] array = resultString.getAllTermsHits().split(" ");
        return Integer.parseInt(array[array.length - 1]);
    }

    /**
     * To transform array of results to string.
     *
     * @param hitsArray
     * @return string
     */
    public static String getHitsString(int[] hitsArray) {
        StringBuilder sb = new StringBuilder();
        int total = 0;
        for (int i = 0; i < hitsArray.length; i++) {
            sb.append(hitsArray[i]);
            sb.append(" ");
            total = total + hitsArray[i];
        }
        sb.append(total);
        return String.valueOf(sb);
    }
}
