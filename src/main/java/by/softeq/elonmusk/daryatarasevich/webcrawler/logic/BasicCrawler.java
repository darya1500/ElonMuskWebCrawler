package by.softeq.elonmusk.daryatarasevich.webcrawler.logic;

import by.softeq.elonmusk.daryatarasevich.webcrawler.entity.ResultString;
import java.util.List;
/**
 * Interface of basic crawler.
 *
 * @autor Darya Tarasevich
 */
public interface BasicCrawler {
    List<ResultString> crawl(String url,int depth,int pages);
}
