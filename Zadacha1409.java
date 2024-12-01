package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Zadacha1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int banki = a + (b-1);
        int Harry = banki - a;
        int Larry = banki - b;
        out.println(Harry + " " + Larry);
        out.flush();
    }

}
