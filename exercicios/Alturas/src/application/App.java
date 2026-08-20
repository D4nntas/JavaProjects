package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();
        Person[] vect = new Person[n];

        for (int i = 0; i < n; i++) {
                System.out.println("Dados da " + (i + 1) + "a pessoa:");

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();

                System.out.print("Altura: ");
                Double altura = sc.nextDouble();
                sc.nextLine();

                vect[i] = new Person(nome, idade, altura); 
        }


        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getAltura();
        }
        Double avg = sum / vect.length;

        System.out.printf("Altura média: %.2f%n", avg);
        double percentage = 0;

        for (int i = 0; i < vect.length; i++){
            if (vect[i].getIdade() < 16){
                percentage += 1;
            }
        }
        double media = percentage * 100 / n;
        String symbol = "%";
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", media, symbol);
        for (int i = 0; i < vect.length; i++){
           if (vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }


        sc.close();
    }
}
