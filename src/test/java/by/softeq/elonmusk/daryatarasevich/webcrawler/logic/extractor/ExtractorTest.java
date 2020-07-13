package by.softeq.elonmusk.daryatarasevich.webcrawler.logic.extractor;

import by.softeq.elonmusk.daryatarasevich.webcrawler.entity.ResultString;
import by.softeq.elonmusk.daryatarasevich.webcrawler.logic.TestData;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static by.softeq.elonmusk.daryatarasevich.webcrawler.logic.TestData.TERMS;

public class ExtractorTest extends TestCase {
    Extractor extractor;
    Set<ResultString> actual;
    Set<ResultString> expected;

    @Before
    public void setUp()  {
        extractor=new Extractor();
        expected=TestData.getExpectedSet();
    }

    @Test
    public void testGetPageLinks_WhenDataIsInCorrect_ShouldReturnCorrectResult() {
        actual=extractor.getResult(TestData.URL_EXAMPLE,2,40,TERMS);
        Assert.assertNotEquals(expected,actual);
    }
}