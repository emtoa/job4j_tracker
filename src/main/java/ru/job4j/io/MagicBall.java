package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Задавай свой вопрос ");
        String name = input.nextLine();

        int answer = new Random().nextInt(3);
        String str = null;

        if (answer == 0) {
            str = "Да";
        } else if (answer == 1) {
            str = "Нет";
        } else{
            str = "Может быть";
        }

        System.out.println(str);
    }
}
