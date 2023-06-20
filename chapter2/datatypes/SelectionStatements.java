/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2.datatypes;

/**
 *
 * @author xn3k
 */
public class SelectionStatements {
    public static void main(String[] args) {
        int a=2;
        if(a>10)
        {
            System.out.println("Hi");
        }
        if(true)
        {
            System.out.println("Hello");
        }
        int age=20;
        if(age>=13&&age<=19)
        {
            System.out.println("you are a teenager");
        }
        else if(age<13&&age>=1)
        {
            System.out.println("you are a child");
        }
        else if(age>19&&age<=45)
        {
            System.out.println("you are adult");
            
        }
        else{
            System.out.println("you are old");
        }
    }
}
