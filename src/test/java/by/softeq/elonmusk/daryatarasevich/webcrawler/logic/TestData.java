package by.softeq.elonmusk.daryatarasevich.webcrawler.logic;

import by.softeq.elonmusk.daryatarasevich.webcrawler.entity.ResultString;

import java.util.*;

public class TestData {
    public static final List<String> TERMS = List.of("Tesla", "Musk", "Gigafactory", "Elon Mask");
    public static final String EXAMPLE1 = "https://en.wikipedia.org/wiki/Neuralink";
    public static final String EXAMPLE2 = "https://en.wikipedia.org/wiki/SpaceX";
    public static final String EXAMPLE3 = "https://en.wikipedia.org/wiki/Tosca_Musk";
    public static final String EXAMPLE4 = "https://en.wikipedia.org/wiki/Tesla,_Inc.";
    public static final String EXAMPLE5 = "https://en.wikipedia.org/wiki/Elon_Musk";
    public static final String EXAMPLE6 = "https://en.wikipedia.org/wiki/SolarCity";
    public static final String EXAMPLE7 = "https://en.wikipedia.org/wiki/The_Boring_Company";
    public static final String EXAMPLE8 = "https://en.wikipedia.org/wiki/Kimbal_Musk";
    public static final String EXAMPLE9 = "https://en.wikipedia.org/wiki/OpenAI";
    public static final String EXAMPLE10 = "https://en.wikipedia.org/wiki/File:Elon_Musk_Royal_Society.jpg";
    public static final String EXAMPLE11 = "https://en.wikipedia.org/fakepage";
    public static final String URL_EXAMPLE = "https://impressive.net/games/barney/fun.cgi";
    public static final String BARNEY_EXAMPLE3 = "https://impressive.net/games/barney/fun.cgi/weapon/38966.1.0";
    public static final String BARNEY_EXAMPLE2 = "https://impressive.net/games/barney/fun.cgi/shoot/38966.1.0";
    public static final String BARNEY_EXAMPLE4 = "https://impressive.net/games/barney/corpses.cgi";
    public static final String BARNEY_EXAMPLE5 = "https://impressive.net/games/barney/about.html";
    public static final String BARNEY_EXAMPLE1 = "https://impressive.net/games/barney/fun.cgi";

    public static Map<ResultString, Integer> getResultStringMapSorted() {
        Map<ResultString, Integer> map = new LinkedHashMap<>();
        ResultString rs1 = new ResultString(EXAMPLE1, "3 40 0 0 43");
        ResultString rs2 = new ResultString(EXAMPLE2, "13 109 0 0 122");
        ResultString rs3 = new ResultString(EXAMPLE3, "3 42 0 0 45");
        map.put(rs2, 122);
        map.put(rs3, 45);
        map.put(rs1, 43);
        return map;
    }

    public static Map<ResultString, Integer> getResultStringMapNotSorted() {
        Map<ResultString, Integer> map = new LinkedHashMap<>();
        ResultString rs1 = new ResultString(EXAMPLE1, "3 40 0 0 43");
        ResultString rs2 = new ResultString(EXAMPLE2, "13 109 0 0 122");
        ResultString rs3 = new ResultString(EXAMPLE3, "3 42 0 0 45");
        map.put(rs3, 45);
        map.put(rs1, 43);
        map.put(rs2, 122);
        return map;
    }

    public static Set<ResultString> getResultStringSet() {
        Set<ResultString> set = new LinkedHashSet<>();
        ResultString rs1 = new ResultString(EXAMPLE1, "3 40 0 0 43");
        ResultString rs2 = new ResultString(EXAMPLE2, "13 109 0 0 122");
        ResultString rs3 = new ResultString(EXAMPLE3, "3 42 0 0 45");
        set.add(rs1);
        set.add(rs2);
        set.add(rs3);
        return set;
    }

    public static Set<String> getSetOfLinks() {
        Set<String> set = new LinkedHashSet<>();
        set.add(EXAMPLE1);
        set.add(EXAMPLE2);
        set.add(EXAMPLE3);
        return set;
    }

    public static List<ResultString> getListResultString() {
        List<ResultString> list = new LinkedList<>();
        list.add(new ResultString(EXAMPLE4, "1111 188 35 0 1334"));
        list.add(new ResultString(EXAMPLE5, "212 633 10 0 855"));
        list.add(new ResultString(EXAMPLE6, "128 43 11 0 182"));
        list.add(new ResultString(EXAMPLE2, "13 109 0 0 122"));
        list.add(new ResultString(EXAMPLE7, "8 106 0 0 114"));
        list.add(new ResultString(EXAMPLE8, "7 62 0 0 69"));
        list.add(new ResultString(EXAMPLE3, "3 42 0 0 45"));
        list.add(new ResultString(EXAMPLE9, "5 39 0 0 44"));
        list.add(new ResultString(EXAMPLE1, "3 40 0 0 43"));
        list.add(new ResultString(EXAMPLE10, "3 38 0 0 41"));
        return list;
    }

    public static Set<ResultString> getResultStringSetEleven() {
        Set<ResultString> set = new LinkedHashSet<>();
        set.add(new ResultString(EXAMPLE4, "1111 188 35 0 1334"));
        set.add(new ResultString(EXAMPLE5, "212 633 10 0 855"));
        set.add(new ResultString(EXAMPLE6, "128 43 11 0 182"));
        set.add(new ResultString(EXAMPLE2, "13 109 0 0 122"));
        set.add(new ResultString(EXAMPLE7, "8 106 0 0 114"));
        set.add(new ResultString(EXAMPLE8, "7 62 0 0 69"));
        set.add(new ResultString(EXAMPLE3, "3 42 0 0 45"));
        set.add(new ResultString(EXAMPLE9, "5 39 0 0 44"));
        set.add(new ResultString(EXAMPLE1, "3 40 0 0 43"));
        set.add(new ResultString(EXAMPLE10, "3 38 0 0 41"));
        set.add(new ResultString(EXAMPLE11, "0 0 0 0 0"));
        return set;
    }

    public static Set<ResultString> getExpectedSet() {
        Set<ResultString > set=new LinkedHashSet<>();
        set.add(new ResultString(BARNEY_EXAMPLE1,"0 0 0 0 0"));
        set.add(new ResultString(BARNEY_EXAMPLE2,"0 0 0 0 0"));
        set.add(new ResultString(BARNEY_EXAMPLE3,"0 0 0 0 0"));
        set.add(new ResultString(BARNEY_EXAMPLE4,"0 0 0 0 0"));
        set.add(new ResultString(BARNEY_EXAMPLE5,"0 0 0 0 0"));
        return set;
    }
}
