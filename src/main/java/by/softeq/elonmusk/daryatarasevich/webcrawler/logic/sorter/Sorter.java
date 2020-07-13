package by.softeq.elonmusk.daryatarasevich.webcrawler.logic.sorter;

import by.softeq.elonmusk.daryatarasevich.webcrawler.entity.ResultString;
import java.util.*;

/**
 * Class for sorting collections in defined order.
 *
 * @autor Darya Tarasevich
 */
public class Sorter {
    /**
     * To sort map by values in descending order.
     *
     * @param resultStringTotalValues
     * @return sortedMap
     */
    public Map<ResultString, Integer> sortMap(Map<ResultString, Integer> resultStringTotalValues) {
        List<Map.Entry<ResultString, Integer>> list = new LinkedList<Map.Entry<ResultString, Integer>>(resultStringTotalValues.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<ResultString, Integer>>() {
            public int compare(Map.Entry<ResultString, Integer> o1,
                               Map.Entry<ResultString, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        Map<ResultString, Integer> sortedMap = getMap(list);
        return sortedMap;
    }
    /**
     * To get map from the list.
     *
     * @param list
     * @return HashMap<ResultString, Integer>
     */
    private Map<ResultString, Integer> getMap(List<Map.Entry<ResultString, Integer>> list) {
        HashMap<ResultString, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<ResultString, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
