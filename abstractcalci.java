import java.util.*;
abstract class calci{
    abstract void add();
    abstract void sub();
    abstract void mul();
    abstract void divi();
}
class addition extends calci {
    double a;
    double b;
    double c;
    double d;

    void add() {
        double e = a + b + c + d;
        System.out.println(e);
    }

    void sub() {
        double e = a - b - c - d;
        System.out.println(e);
    }

    void mul() {
        double e = a * b * c * d;
        System.out.println(e);
    }

    void divi() {
        if(b==0 || c==0 || d==0){
            System.out.println("Value is imvalid");
        }
        else{
        double e = a / b / c / d;
        System.out.println(e);
        }
    }
}
public class abstractcalci {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the four numbers");
        double x=k.nextDouble();
        double y=k.nextDouble();
        double z= k.nextDouble();
        double v= k.nextDouble();
        addition r= new addition();
        r.a=x;
        r.b=y;
        r.c=z;
        r.d=v;
        r.add();
        r.sub();
        r.mul();
        r.divi();
    }
}
