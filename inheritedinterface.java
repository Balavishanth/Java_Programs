interface malenia{
    void waterflow();
}

interface radahn{
    void meteor();
}
interface marika extends malenia,radahn{
    void waterflow();
    void meteor();
}
class inherited implements marika {
    public void waterflow(){
        System.out.println("Im Malenia blade of Miquella");
    }
    public void meteor(){
        System.out.println("Raaaaaaaaaaaaaa");
    }
}

class inheritedinterface{
    public static void main(String[]args){
        inherited n=new inherited();
        n.meteor();
        n.waterflow();
    }
}
