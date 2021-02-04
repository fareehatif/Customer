/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.util.Scanner;

public class RunCustomerMain {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        char type;
        double subtotal;

        System.out.print("Enter customer type: ");
        type = in.nextLine().charAt(0);
        System.out.println("\n");
        System.out.print("Enter subtotal: ");
        subtotal = in.nextDouble();
        Customer person = new Customer(type,subtotal);
        System.out.println("\n");
        System.out.println(person);


    }

}