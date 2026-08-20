package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();
        Client[] rooms = new Client[10];

        for (int i = 0; i < n; i++){
            System.out.println("Rent #"+ (i+1)+":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            rooms[room] = new Client(name, email, room);
        }


        System.out.println("Busy rooms: ");
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i] != null){
                System.out.println(rooms[i].getRoom()+ ": " + rooms[i].getName() +  ", "+  rooms[i].getEmail());
            }
        }


    }   
}
