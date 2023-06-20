/*
->    constructor is a special member method whose name is same as class name
-> which doesn't have return type
-> which is automatically called during object creation.
->it is used to perform any task during object creation, like initializing 
the variables, printing some messages, establising db connection etc.
Types of constructor:
    -> user defined: explicitly defined by programmer
    -> default:implicitly/automatically created by java in absence of user defined
constructor.


*/
package javacodes;


 class Rectangle {
    double l,b;
    String n;
     Rectangle(String name,double le,double br){
         System.out.println("Rectangle created by "+name);
         l=le;
         b=br;
         n=name;
    }
}


class ConstDemo{
    public static void main(String[] args) {
        Rectangle r=new Rectangle("prabin",2,3);
        Rectangle r1=new Rectangle("neelaw",3,5);
        System.out.println("Box created by "+r.n+" has area "+ (r.l*r.b));
    }
}