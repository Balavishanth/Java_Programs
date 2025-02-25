abstract class abstractclass {
    abstract void rune();
    abstract void blade();
}

class ring extends abstractclass{
    void rune(){
        System.out.println("Foul Tarnished");
    }
    void blade(){
        System.out.println("Im Malenia blade of Miquella");
    }
}

class nein{
    public static void main(String[]args){
        abstractclass a=new ring();
        a.rune();
        a.blade();
    }
}