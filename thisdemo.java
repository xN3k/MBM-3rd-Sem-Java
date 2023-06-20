//this is the keyword that represents the current object on behalf of which
//member method is being called and executed
package javacodes;
class Square{
    double l;
//    Square(int l)
//    {
//        this.l=l;
//    }
    void setLength(int l)
    {
        this.l=l;
    }
    double getArea()
    {
        return l*l;
    }
}
public class thisdemo {
    public static void main(String[] args) {
        Square s=new Square();
        s.setLength(6);
        System.out.println(s.getArea());
    }
}
