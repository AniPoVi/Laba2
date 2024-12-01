package Laba2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        int A = in.nextInt();
        if (A > 10)
        {System.out.println("Данное число больше 10 и ");}
        else
        {System.out.println("Данное число меньше 10 и ");}
        int X = A % 4;
        int B = A / 4;
                if (X == 0)
        {System.out.println("оно делится на 4 без остатка");
            System.out.println("Результат = " + B);}
        else
        {System.out.println("оно не делится на 4 без остатка");
            System.out.println("Результат = " + B);
            System.out.println("Остаток = " + X);}

    }


    }

