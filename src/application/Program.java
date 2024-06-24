package application;

import entities.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

       try {
           Locale.setDefault(Locale.US);
           Scanner sc = new Scanner(System.in);
           List<Account> acc = new ArrayList<>();

           System.out.println("Enter account data: ");
           System.out.println("Number: ");
           Integer number = sc.nextInt();
           System.out.println("Holder: ");
           sc.nextLine();
           String holder = sc.nextLine();
           System.out.println("Initial balance: ");
           Double balance = sc.nextDouble();
           System.out.println("Withdraw limit: ");
           Double withdrawLimit = sc.nextDouble();

           Account account = new Account(number, holder, balance, withdrawLimit);
           acc.add(account);

           System.out.println("\nEnter amount for withdraw: ");
           account.withdraw(sc.nextDouble());

           System.out.println(account);
       }catch (IllegalArgumentException e ){
           System.out.println("Withdraw error: " + e.getMessage());
       }



    }
}
