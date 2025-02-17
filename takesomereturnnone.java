class wado{
    String color;
    String haki;

    void name(String color,String haki){
        System.out.println("It has nothing");
    }
}
public class takesomereturnnone {
    public static void main(String[]args){
        wado mycolor=new wado();
        mycolor.color="White";
        mycolor.haki="Supreme king";
        mycolor.name(mycolor.color, mycolor.haki);


    }
}
