package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int io1 = o1.indexOf("/") != -1 ? o1.indexOf("/") : o1.length();
        int io2 = o2.indexOf("/") != -1 ? o2.indexOf("/") : o2.length();

        String ileft = o1.substring(0, io1);
        String iright = o2.substring(0, io2);

        return iright.compareTo(ileft);
    }
}
