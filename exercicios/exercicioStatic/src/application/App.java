package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Whats the dollar price? ");
        Double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        Double bought = sc.nextDouble();

        double dollar = CurrencyConverter.converter(dollarPrice, bought);
        double dollarToPay = CurrencyConverter.IOF(dollar);

        System.out.printf("Amount to be paid in reais  %.2f%n", dollarToPay);

    }
}
