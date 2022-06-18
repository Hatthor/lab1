package a;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        int a;
        int b;
        int suma;
        int produs;
        int difer;
        int imp;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first integer number: ");
        a = input.nextInt();
        System.out.print("Enter the second integer number: ");
        b = input.nextInt();
        suma = a + b;
        System.out.printf("Sum = %d%n", suma);
        produs = a * b;
        System.out.printf("Product = %d%n", produs);
        difer = a - b;
        System.out.printf("Difference = %d%n", difer);
        imp = a / b;
        System.out.printf("Quotient = %d%n", imp);
    }
}