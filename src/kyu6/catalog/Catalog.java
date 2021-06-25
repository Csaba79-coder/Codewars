package kyu6.catalog;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Catalog {
    public static String catalog(String s, String article) {
        final String out = Stream.of(s.split("\n"))
                .filter(str -> str.contains(article))
                .map(Catalog::buildString)
                .collect(Collectors.joining("\n"));

        return out.isEmpty() ? "Nothing" : out;
    }

    private static String buildString(String s) {
        return tag("name", s) + " > prx: $" + tag("prx", s) + " qty: " + tag("qty", s);
    }

    private static String tag(String tn, String s) {
        return s.substring(s.indexOf("<" + tn + ">") + tn.length() + 2, s.indexOf("</" + tn + ">"));
    }
}
