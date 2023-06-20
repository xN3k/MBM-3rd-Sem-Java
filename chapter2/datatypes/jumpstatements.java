/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2.datatypes;

/**
 *
 * @author xn3k
 */
public class jumpstatements {
    public static void main(String[] args) {
        loop1:for(int i=1;i<=3;i++)
        {
            loop2:for(int j=1;j<=3;j++)
            {
                if(i==j) continue loop1;
                System.out.println(i*j);
            }
        }
    }
}
