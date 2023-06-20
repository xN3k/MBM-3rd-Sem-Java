/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2.datatypes;

/**
 *
 * @author xn3k
 */

/*

thi is
multi
line comment


*/
public class multidimensionalarray {
    public static void main(String[] args) {
        int arr[][];//array declaration
        int arr1[][]={{1},{1,2},{1,2,3}};
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print(arr1[i][j]);
            }
            System.out.println("");
        }
        int arr2[][];
        arr=new int[2][3];//rectangular matrix
        arr2=new int[2][];//jagged array
        arr2[0]=new int[3];
        arr2[1]=new int[2];
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.print(arr2[i][j]);
            }
            System.out.println("");
        }
        
    }
   
}
