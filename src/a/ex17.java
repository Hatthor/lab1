package a;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int suma;
        int media;
        int produs;
        System.out.printf("Enter the first integer number: ");
        a = input.nextInt();
        System.out.print("Enter the second integer number: ");
        b = input.nextInt();
        System.out.printf("Enter  third integer number: ");
        c = input.nextInt();
        suma = a + b + c;
        System.out.println("Sum = " + suma);
        media = (a + b + c) / 3;
        System.out.println("Avarage = " + media);
        produs = a * b * c;
        System.out.println("Product = " + produs);
        if (a > b && a > c)
            System.out.println("Largest of the number is " + a);
        if (b > a && b > c)
            System.out.println("Largest of the number is " + b);
        if (c > a && c > b)
            System.out.println("Largest of the number is " + c);
        if (a < b && a < c)
            System.out.println("Largest of the number is" + a);
        if (b < a && b < c)
            System.out.println("Largest of the number is" + b);
        if (c < a && c < b)
            System.out.println("Largest of the number is" + c);
    }
}