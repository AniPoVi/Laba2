package Laba2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        int A = in.nextInt();
        int X = A % 5;
        int Y = A % 7;
        if (X == 2)
        {System.out.println("Данное число делится на 5 с остатком  равным 2");}
        else
        {System.out.println("Данное число делится на 5 с остатком  не равным 2");}
        if (Y == 1)
        {System.out.println("Данное число делится на 7 с остатком  равным 1");}
        else
        {System.out.println("Данное число делится на 7 с остатком  не равным 1");}

    }


    }

