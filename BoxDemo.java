/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodes;

class Box {

    double l, b, h;

    void showDetail() {
        System.out.println("The detail of box is:");
        System.out.println("length:" + l + "\tbreadth" + b + "\theight" + h);
    }
    double getVolume()
    {
        return l*b*h;
    }

    void setDetail(double le, double br, double he) {
        l = le;
        b = br;
        h = he;
    }
}

public class BoxDemo {

    public static void main(String[] args) {
//        int a;//PDT
//        a=32;
        Box b;//var of type Box, it is reference variable
        b = new Box();
        System.out.println(b.b);
//        b.b = 2;
//    9     b.h = 2;
//        b.l = 3;
        b.setDetail(2, 3, 4);
        System.out.println("The vol of b is:" + b.b * b.h * b.l);
        Box b1 = new Box();

        b.showDetail();
        System.out.println("The vol of b is:"+b.getVolume());
    }
}
