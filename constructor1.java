class constructor{
    String name;
    int year;

    String constructor(String name,int year){
        return "My name is "+ name + " and my age is "+ year;
    }
}
public class constructor1 {
    public static void main(String[]args){
        constructor mycon=new constructor();
        mycon.name="Loki";
        mycon.year=2026;
        System.out.println(mycon.constructor(mycon.name, mycon.year));
    }
}
