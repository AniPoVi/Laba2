package Laba2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        int A = in.nextInt();
         A = A / 1000;
        System.out.println("В данном числе " +A+ " тысяч");
    }
}
