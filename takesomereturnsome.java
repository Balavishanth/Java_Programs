class summa{
    int num1;
    int num2;
    String add(int num1,int num2){
        int num3=num1+num2;
        return "I take "+num1+" and "+num2+" to return the value "+num3;
    }
    String multi(int num1, int num2){
        int num4=num1*num2;
        return "I take "+num1+" and "+num2+" to product and find the number "+num4;
    }

}
public class takesomereturnsome {
    public static void main(String[]args){
        summa moon=new summa();
        moon.num1=100;
        moon.num2=200;
        System.out.println(moon.add(moon.num1, moon.num2));
        System.out.println(moon.multi(moon.num1, moon.num2));
    }
}
