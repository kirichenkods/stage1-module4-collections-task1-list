package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        sourceList.sort(listComparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int calcA = calc(intA);
        int calcB = calc(intB);

        if (calcA != calcB) {
            return Integer.compare(calcA, calcB);
        }

        return Integer.compare(intA, intB);
    }

    private int calc(int x) {
        return 5 * x * x + 3;
    }
}
