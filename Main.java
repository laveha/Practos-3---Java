package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();
        if(a + b <= c || b + c <= a || c + a <= b){
            System.out.println("a, b и c не являются сторонами треугольника");
        }
        else if ((a == b) && (b == c)) {
            System.out.println("a, b и c являются сторонами равностороннего треугольника");
        }
        else if (a == b || b == c || c == a) {
            System.out.println("a, b и c являются сторонами равнобедренного треугольника");
        }
        else if ((a ^ 2 + b ^ 2) == (c ^ 2) || (b^2 + c^2) == (a^2) || (c^2 + a^2) == (b^2)) {
            System.out.println("a, b и c являются сторонами прямоугольного треугольника");
        }
        else {
            System.out.println("a, b и c являются сторонами обычного треугольника");
        }
    }
}