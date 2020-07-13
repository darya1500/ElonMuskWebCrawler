package by.softeq.elonmusk.daryatarasevich.webcrawler.logic.writer;

import au.com.bytecode.opencsv.CSVWriter;
import by.softeq.elonmusk.daryatarasevich.webcrawler.entity.ResultString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Class of writing to file and console.
 *
 * @author darya tarasevich
 */
public class CrawlerWriter {
    private static final Logger log = LogManager.getLogger(CrawlerWriter.class);
    /**
     * To write result strings to file and to console.
     *
     * @param resultStrings
     * @param filename name of file
     */
    public void write(List<ResultString> resultStrings, String filename) {
        CSVWriter csvWriter;
        try {
            csvWriter = new CSVWriter(new FileWriter(filename));
            resultStrings.forEach(a -> {
                    String temp =  a.getName() + " "+a.getAllTermsHits();
                    System.out.println(temp+"\n");
                    String [] record = temp.split(" ");
                    csvWriter.writeNext(record);
            });
            csvWriter.close();
        } catch (IOException e) {
            log.error(e);
        }
    }
}
