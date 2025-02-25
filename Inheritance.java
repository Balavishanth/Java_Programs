class Godofwar{
    void equipment(){
        System.out.println("The blades of chaos");
    }
}

class EldenRing extends Godofwar{
    void weapon(){
        System.out.println("Nagakiba");
    }
}

class DeathStranding extends Godofwar{
    void good(){
        System.out.println("Experience");
    }
}

public class Inheritance {
    public static void main(String[]args){
        EldenRing tarnished=new EldenRing();
        tarnished.equipment();
        tarnished.weapon();

        DeathStranding Norman=new DeathStranding();
        Norman.good();
        Norman.equipment();
    }
}