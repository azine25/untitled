package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String apartmentCost;
        int NUM = 80000;
        String word = "7000";
        apartmentCost = NUM + word;
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }
        if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = sc.nextLine();
        System.out.println("Добрый вечер " + name);

    }
}
