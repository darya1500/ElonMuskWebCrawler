package by.softeq.elonmusk.daryatarasevich.webcrawler.configuration;

import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Configuration class. Uses application.properties file as a resource.
 *
 * @author Darya Tarasevich
 */
public class WebCrawlerConfiguration {
    private final static ResourceBundle resourceBundle = ResourceBundle.getBundle("application");

    private WebCrawlerConfiguration() {
    }

    public static String getProperty(String key) {
        return resourceBundle.getString(key);
    }

    /**
     * To get list of terms to find.
     *
     * @return list of terms
     */
    public static List<String> getListOfTerms() {
        String termsString = WebCrawlerConfiguration.getProperty("app.terms");
        return Arrays.asList(termsString.split(","));
    }
}
