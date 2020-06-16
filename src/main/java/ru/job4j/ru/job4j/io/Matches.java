package ru.job4j.ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 11;
        int i = 0;
        String player = null;

        while (count > 0) {
            player = (i % 2) == 0 ? "Первый" : "Второй";
            i++;
            System.out.println(player+" ваш ход : ");
            int select = Integer.valueOf(input.nextLine());
            if (select > count) {
                System.out.println("Игрок "+player+" мухлевал игра окончена !!!");
                break;
            }
            count -= select;
            System.out.println("Всего спичек осталось : "+count);
        }
    }
}
