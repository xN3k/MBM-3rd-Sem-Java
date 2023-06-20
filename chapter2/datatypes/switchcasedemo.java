/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2.datatypes;

import java.util.Scanner;

/**
 *
 * @author xn3k
 */
public class switchcasedemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter choice 1. Area of rectangle 2. Area of Square 3.Exit");
        int choice=scan.nextInt();
        switch(choice)
        {
            case 1:{
                System.out.println("Enter length and breadth of the rectangle");
                double l=scan.nextDouble();
                double b=scan.nextDouble();
                System.out.println("The area of rectangle is: "+(l*b));
            }
            case 2:
                System.out.println("Enter lenght of the square");
                double l=scan.nextDouble();
                System.out.println("The area of square is: "+l*l);
                break;
            case 3:
                System.out.println("just a test");;
            default:
                System.out.println("no such choice");
                break;
        }
    }

}
