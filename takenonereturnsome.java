class enma{
    int num1=200;
    int num2=300;

    String onesword(){
        int num3=num1+num2;
        return "Ithoriyo oogi "+num3+" sekai";
    }
    String threesword(){
        int num3=num1*num2;
        return "Senthoriyo oogi "+num3+" ichiden sansen daisen sekai";
    }
}
public class takenonereturnsome {
    public static void main(String[]args){
        enma mysword=new enma();
        System.out.println(mysword.onesword());
        System.out.println(mysword.threesword());
    }
}
