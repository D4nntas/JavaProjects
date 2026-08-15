package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;
        System.out.print("Enter account number: ");
        int idAccount = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String titular = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        String response  = sc.nextLine();
        

        if (response.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(idAccount, titular, initialDeposit);
            System.out.println(account);
        } else {
            account = new Account(idAccount, titular);
            System.out.println(account);
        }
        
        System.out.println();
        System.out.print("Enter a Deposite value: ");
        Double depositValue  = sc.nextDouble();
        account.deposit(depositValue );
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        Double withdrawValue  = sc.nextDouble();
        account.withdrawal(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);
       
        sc.close();
    }
}
