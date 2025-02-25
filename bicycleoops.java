import java.util.*;
class Bicycle{
    int gears;
    int speed;
}
class MountainBike extends Bicycle{
    int seatheight;
}
class Test extends MountainBike{
    void spec(){
        System.out.println("No of gears "+gears);
        System.out.println("Total speed "+speed);
        System.out.println("The seat height "+seatheight);
    }
}
public class bicycleoops {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of gears");
        int g=k.nextInt();
        System.out.println("Enter the speed");
        int s=k.nextInt();
        System.out.println("Enter the seat height");
        int h=k.nextInt();
        Test n=new Test();
        n.gears=g;
        n.speed=s;
        n.seatheight=h;
        n.spec();
    }
}