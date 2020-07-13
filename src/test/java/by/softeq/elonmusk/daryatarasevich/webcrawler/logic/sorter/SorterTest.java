package by.softeq.elonmusk.daryatarasevich.webcrawler.logic.sorter;

import by.softeq.elonmusk.daryatarasevich.webcrawler.entity.ResultString;
import by.softeq.elonmusk.daryatarasevich.webcrawler.logic.TestData;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Map;

public class SorterTest extends TestCase {
    Sorter sorter;
    Map<ResultString, Integer> actual;
    Map<ResultString, Integer> expected;

    @Before
    public void setUp() {
        sorter=new Sorter();
        expected= TestData.getResultStringMapSorted();
    }

    @Test
    public void testSortMap_WhenDataIsCorrect_ShouldReturnCorrectResult() {
        actual= sorter.sortMap(TestData.getResultStringMapNotSorted());
        Assert.assertEquals(actual,expected);
    }
}