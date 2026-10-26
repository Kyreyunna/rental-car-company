package com.pluralsight;

import java.util.Scanner;

public class RentalCar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter number of days for the rental:");
        int day= scanner.nextInt();

        System.out.println("Would you like GPS? Enter yes or no:");
        String gps= scanner.next();
        System.out.println("Would you like Toll Tag? yes or no:");

        System.out.println("Would you like Roadside Assistance? yes or no:");

        String priceRental=scanner.nextLine();
//        System.out.println(priceRental);
    }
}
