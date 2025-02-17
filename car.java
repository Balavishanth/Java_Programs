class spec {
    String brand;
    int year;

    void start(){
        System.out.println("Car started");
    }
}

public class car{
    public static void main(String[]args){
        spec mycar=new spec();
        mycar.brand="Toyoto";
        mycar.year=1984;

        mycar.start();
    }
}
