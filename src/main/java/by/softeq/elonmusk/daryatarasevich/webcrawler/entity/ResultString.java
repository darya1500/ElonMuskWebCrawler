package by.softeq.elonmusk.daryatarasevich.webcrawler.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class of result string that will be featured in statistics.
 *
 * @autor Darya Tarasevich
 */
public class ResultString implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String allTermsHitsString;

    public ResultString(String name, String allTermsHitsString) {
        this.name = name;
        this.allTermsHitsString = allTermsHitsString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAllTermsHitsString() {
        return allTermsHitsString;
    }

    public void setAllTermsHitsString(String allTermsHitsString) {
        this.allTermsHitsString = allTermsHitsString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultString that = (ResultString) o;
        return name.equals(that.name) &&
                allTermsHitsString.equals(that.allTermsHitsString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, allTermsHitsString);
    }

    @Override
    public String toString() {
        return "ResultString{" +
                "name='" + name + '\'' +
                ", allTermsHitsString='" + allTermsHitsString + '\'' +
                '}';
    }
}
