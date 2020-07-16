package by.softeq.elonmusk.daryatarasevich.webcrawler.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class of result string that will be featured in statistics.
 *
 * @autor Darya Tarasevich
 */
public class ResultString  {

    private String name;
    private String allTermsHits;

    public ResultString(String name, String allTermsHits) {
        this.name = name;
        this.allTermsHits = allTermsHits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAllTermsHits() {
        return allTermsHits;
    }

    public void setAllTermsHits(String allTermsHits) {
        this.allTermsHits = allTermsHits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultString that = (ResultString) o;
        return name.equals(that.name) &&
                allTermsHits.equals(that.allTermsHits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, allTermsHits);
    }

    @Override
    public String toString() {
        return "ResultString{" +
                "name='" + name + '\'' +
                ", allTermsHitsString='" + allTermsHits + '\'' +
                '}';
    }
}
