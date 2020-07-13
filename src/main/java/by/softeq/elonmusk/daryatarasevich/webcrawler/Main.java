package by.softeq.elonmusk.daryatarasevich.webcrawler;

import by.softeq.elonmusk.daryatarasevich.webcrawler.configuration.WebCrawlerConfiguration;
import by.softeq.elonmusk.daryatarasevich.webcrawler.logic.WebCrawler;

public class Main {
    public static void main(String[] args)  {
        WebCrawler webCrawler=new WebCrawler();
        webCrawler.crawl(WebCrawlerConfiguration.getProperty("app.url"),Integer.parseInt(WebCrawlerConfiguration.getProperty("app.depth")),Integer.parseInt(WebCrawlerConfiguration.getProperty("app.pages")));
    }
}
