package ru.job4j.ex;

public class Test {
    public static void main(String[] args) {
        try {
            int i = 6 / 0;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
