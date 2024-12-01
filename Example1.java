package Laba2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        int A = in.nextInt();
        int X = A % 3;
        int B = A / 3;
        System.out.println("Результат = " + B);
        if (X == 0)
        {System.out.println("Данное число делится на 3 без остатка");}
        else
        {System.out.println("Введенное число не делится на 3 без остатка");}
        System.out.println("Остаток = " + X);
    }
   }

