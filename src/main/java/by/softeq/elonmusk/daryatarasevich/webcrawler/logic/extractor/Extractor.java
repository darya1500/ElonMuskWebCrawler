package by.softeq.elonmusk.daryatarasevich.webcrawler.logic.extractor;

import by.softeq.elonmusk.daryatarasevich.webcrawler.entity.ResultString;
import by.softeq.elonmusk.daryatarasevich.webcrawler.util.ResultStringUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class for extracting all links mentioned on the web page.
 *
 * @autor Darya Tarasevich
 */
public class Extractor {
    private static final Logger log = LogManager.getLogger(Extractor.class);
    Set<ResultString> result;
    Set<String> links;

    public Extractor() {
        result = new HashSet<>();
        links = new HashSet<>();
    }

    /**
     * To get set of result strings from given url based on criteria:
     * -pages-max number of pages to visit
     * -depth- depth of search
     * -terms- list of terms to find.
     * Document is parsed via Jsoup.
     *
     * @param url
     * @param depth
     * @param pages
     * @param terms
     * @return Set<ResultString>
     */
    public Set<ResultString> getResult(String url, int depth, int pages, List<String> terms) {
        if ((!links.contains(url)) && (depth > 0) && (pages > 0)) {
            url = formatUrl(url);
            links.add(url);
            Document document = null;
            try {
                document = Jsoup.connect(url).get();
                String hitsString = getHitsStringFromDocument(terms, document);
                ResultString resultString = new ResultString(url, hitsString);
                result.add(resultString);
                Elements linksOnPage = document.select("a[href]");
                depth--;
                for (Element page : linksOnPage) {
                    pages--;
                    getResult(page.attr("abs:href"), depth, pages, terms);
                }
            } catch (IOException e) {
                log.error(e);
            }
        }
        return result;
    }

    /**
     * To get sting with number of hits of every term in document and total number of hits
     * of all terms in document.
     *
     * @param terms
     * @param document
     * @return string with hits results
     */
    private String getHitsStringFromDocument(List<String> terms, Document document) {
        String textToCheck = document.body().text();
        int[] hitsArray = new int[terms.size()];
        int count = 0;
        for (String term : terms) {
            int termCountInLink = 0;
            Pattern pattern = Pattern.compile(term);
            Matcher matcher = pattern.matcher(textToCheck);
            while (matcher.find()) {
                termCountInLink++;
            }
            hitsArray[count] = termCountInLink;
            count++;
        }
        return ResultStringUtil.getHitsString(hitsArray);
    }

    /**
     * To remove links with # symbol.
     *
     * @param url
     * @return String
     */
    private String formatUrl(String url) {
        if (url.contains("#")) {
            url = url.substring(0, url.indexOf('#'));
        }
        return url;
    }
}
