package org.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scanner.nextInt(); // Считаем, что пользователь ввёл что-то разумительное

        System.out.print("Введите число b: ");
        int b = scanner.nextInt(); // Считаем, что пользователь ввёл что-то разумительное

        int answer = 0;
        for (int i = a; i <= b; i++) {
            answer += i;
        }

        System.out.println(answer);
    }
}