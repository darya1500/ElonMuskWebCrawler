package by.softeq.elonmusk.daryatarasevich.webcrawler.logic.finder;

import by.softeq.elonmusk.daryatarasevich.webcrawler.entity.ResultString;
import by.softeq.elonmusk.daryatarasevich.webcrawler.logic.TestData;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FinderTest extends TestCase {
    Finder finder;
    List<ResultString> actual;
    List<ResultString> expected;

    @Before
    public void setUp() throws Exception {
        finder=new Finder();
        expected= TestData.getListResultString();
    }

    @Test
    public void testFindTopTen_WhenDataIsCorrect_ShouldReturnCorrectResult() {
        actual=finder.findTopTen(TestData.getResultStringSetEleven());
        Assert.assertEquals(actual,expected);
    }
}