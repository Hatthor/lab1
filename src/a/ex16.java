package a;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        int a;
        int b;
        int suma;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first integer number: ");
        a = input.nextInt();
        System.out.print("Enter the second integer number: ");
        b = input.nextInt();
        if (a == b)
            System.out.printf("%d != %d%n", a, b);
        if (a != b)
            System.out.printf("%d != %d%n", a, b);
        if (a < b)
            System.out.printf("%d < %d%n", a, b);
        if (a > b)
            System.out.printf("%d > %d%n", a, b);
        if (a <= b)
            System.out.printf("%d <= %d%n", a, b);
        if (a >= b)
            System.out.printf("%d >= %d%n", a, b);
    }
}