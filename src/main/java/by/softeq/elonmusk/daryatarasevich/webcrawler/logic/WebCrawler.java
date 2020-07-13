package by.softeq.elonmusk.daryatarasevich.webcrawler.logic;

import by.softeq.elonmusk.daryatarasevich.webcrawler.configuration.WebCrawlerConfiguration;
import by.softeq.elonmusk.daryatarasevich.webcrawler.logic.extractor.Extractor;
import by.softeq.elonmusk.daryatarasevich.webcrawler.logic.finder.Finder;
import by.softeq.elonmusk.daryatarasevich.webcrawler.entity.ResultString;
import by.softeq.elonmusk.daryatarasevich.webcrawler.logic.writer.CrawlerWriter;
import java.util.*;

/**
 * Class for web crawling. Implements BasicCrawler interface.
 *
 * @autor Darya Tarasevich
 */
public class WebCrawler implements BasicCrawler {

    /**
     * To crawl url, i.e. to get top 10 results of ResultString;
     * criteria for selection is number of total hits of all terms (from the list of terms) on the page;
     * list of all links of pages is received from parsing given URL.
     *
     * @param url
     * @return topTenResults
     */
    @Override
    public List<ResultString> crawl(String url,int depth,int pages) {
        Extractor extractor = new Extractor();
        List<String> terms = WebCrawlerConfiguration.getListOfTerms();
        Set<ResultString> resultStrings = extractor.getResult(url, depth, pages, terms);
        Finder finder=new Finder();
        List<ResultString> topTenResults=finder.findTopTen(resultStrings);
        CrawlerWriter writer=new CrawlerWriter();
        writer.write( topTenResults, "statistics.csv");
        return topTenResults;
    }
}
