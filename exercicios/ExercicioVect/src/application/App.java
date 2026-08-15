package application;

import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for(int i=0; i<vect.length; i++  ){
            sc.nextLine();
            System.out.print("product: ");
            String name = sc.nextLine();
            System.out.print("price: ");
            Double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for (int i=0; i<vect.length; i++  ){
            sum += vect[i].getPrice();

        }

        double avg = sum / vect.length;

        System.out.printf("Average: %.2f%n", avg);
        sc.close();

    }
}
