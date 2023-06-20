/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2.datatypes;

/**
 *
 * @author xn3k
 */
public class breakasgoto {

    public static void main(String[] args) {
        boolean a = false, b = true, c = true;
        A:
        {
            System.out.println("Start of scope A");
            if (a) {
                break A;
            }

            B:
            {
                System.out.println("start of scope B");
                if (b) {
                    break A;
                }
                C:
                {
                    System.out.println("start of scope C");
                    if (c) {
                        break C;
                    }
                    System.out.println("end of scope C");
                }
                System.out.println("end of scope B");

            }
            System.out.println(c);
            System.out.println("end of scope A");
        }
        System.out.println("end of the program. happy coding...");
    }
}
