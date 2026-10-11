
package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<String> expenses = new ArrayList<>();
    static ArrayList<Double> amounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    expenses.add(name);
                    amounts.add(amount);
                    System.out.println("Expense added successfully!");
                    break;

                case 2:
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses recorded.");
                    } else {
                        for (int i = 0; i < expenses.size(); i++) {
                            System.out.println((i + 1) + ". "
                                + expenses.get(i) + " - Rs. "
                                + amounts.get(i));
                        }
                    }
                    break;

                case 3:
                    double total = 0;
                    for (double value : amounts) {
                        total += value;
                    }
                    System.out.println("Total Expenses: Rs. " + total);
                    break;

                case 4:
                    System.out.println("Thank you for using Expense Tracker!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
