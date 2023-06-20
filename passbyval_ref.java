
package javacodes;
class PBVR{
    void funPBV(int a)
    {
        a*=2;
    }
}
public class passbyval_ref {
    public static void main(String[] args) {
        int val1=4;
        System.out.println(val1);
        PBVR ob=new PBVR();
        ob.funPBV(val1);
        System.out.println(val1);
    }
}
