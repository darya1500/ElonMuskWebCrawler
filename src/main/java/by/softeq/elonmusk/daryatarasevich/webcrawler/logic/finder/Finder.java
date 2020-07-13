package by.softeq.elonmusk.daryatarasevich.webcrawler.logic.finder;

import by.softeq.elonmusk.daryatarasevich.webcrawler.exception.NotEnoughResultsException;
import by.softeq.elonmusk.daryatarasevich.webcrawler.logic.sorter.Sorter;
import by.softeq.elonmusk.daryatarasevich.webcrawler.entity.ResultString;

import by.softeq.elonmusk.daryatarasevich.webcrawler.util.ResultStringUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
/**
 * Class for finding results defined by specific creteria.
 *
 * @autor Darya Tarasevich
 */
public class Finder {
    private static final Logger log = LogManager.getLogger(Finder.class);
    /**
     * To find top ten results from the set of result strings
     * Selection is choosing 10 ResultStrings with the biggest number of total hits of all terms.
     *
     * @param resultStrings
     * @return topTenResultStrings
     */
    public List<ResultString> findTopTen(Set<ResultString> resultStrings) {
        Map<ResultString, Integer> resultStringTotalValues = createHashMapResultStringAndTotal(resultStrings);
        Sorter sorter=new Sorter();
        Map<ResultString, Integer> resultStringTotalValuesSorted = sorter.sortMap(resultStringTotalValues);
        List<ResultString> topTenResultStrings = null;
        try {
            topTenResultStrings = getTopTenResultsFromMap(resultStringTotalValuesSorted);
        } catch (NotEnoughResultsException e) {
            log.error(e);
            List<ResultString> result=new ArrayList<>();
            for (Map.Entry entry:resultStringTotalValuesSorted.entrySet()){
                result.add((ResultString) entry.getKey());
            }
            return result;
        }
        return topTenResultStrings;
    }

    /**
     * To create HashMap using ResultString as a key and total hits number of ResultString as value.
     *
     * @param resultStrings
     * @return resultStringTotalValues
     */
    private Map<ResultString, Integer> createHashMapResultStringAndTotal(Set<ResultString> resultStrings) {
        Map<ResultString, Integer> resultStringTotalValues = new HashMap<>();
        for (ResultString resultString : resultStrings) {
            int total = ResultStringUtil.getTotal(resultString);
            resultStringTotalValues.put(resultString, total);
        }
        return resultStringTotalValues;
    }

    /**
     * To get first 10 results from LinkedHashMap.
     *
     * @param resultStringTotalValuesSorted
     * @return topTenResultString
     * @throws NotEnoughResultsException
     */
    private List<ResultString> getTopTenResultsFromMap(Map<ResultString, Integer> resultStringTotalValuesSorted) throws NotEnoughResultsException {
        if (resultStringTotalValuesSorted.size()>=10) {
            List<ResultString> topTenResultString = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                Map.Entry<ResultString, Integer> entry = resultStringTotalValuesSorted.entrySet().iterator().next();
                ResultString key = entry.getKey();
                topTenResultString.add(key);
                resultStringTotalValuesSorted.remove(entry.getKey(), entry.getValue());
            }
            return topTenResultString;
        }else {
            throw new NotEnoughResultsException();
        }
    }
}
