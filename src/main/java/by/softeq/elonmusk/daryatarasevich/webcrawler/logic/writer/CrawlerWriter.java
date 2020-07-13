package by.softeq.elonmusk.daryatarasevich.webcrawler.logic.writer;

import au.com.bytecode.opencsv.CSVWriter;
import by.softeq.elonmusk.daryatarasevich.webcrawler.entity.ResultString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
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
     * @param filename
     */
    public void write(List<ResultString> resultStrings, String filename) {
        CSVWriter csvWriter;
        try {
            //writer = new FileWriter(filename);
            csvWriter = new CSVWriter(new FileWriter(filename));
            resultStrings.forEach(a -> {
                    String temp =  a.getName() + " "+a.getAllTermsHitsString();
                    //display to console
                    System.out.println(temp+"\n");

                    String [] record = temp.split(" ");
                    //Write the record to file
                    csvWriter.writeNext(record);
                    //writer.write(temp);

            });
            csvWriter.close();
        } catch (IOException e) {
            log.error(e);
        }
    }
}
