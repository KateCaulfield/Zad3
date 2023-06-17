package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int s = scanner.nextInt();
        System.out.println("Цифры в числе " + s + ":");
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while (s != 0){
            int digit = s % 10;
            digits.add(digit);
            s /= 10;
        }
        for (int i = digits.size()-1; i>=0; i--){
            System.out.println(digits.get(i)+ " ");
        }
    }
}