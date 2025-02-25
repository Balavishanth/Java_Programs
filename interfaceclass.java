interface star{
    public void scortch();
}
interface moon{
    public void ranni();
}
class tarnish implements star,moon{
    public void scortch(){
        System.out.println("Tarnished bow thy strength");
    }
    public void ranni(){
        System.out.println("Eternal Consort of Tarnish");
    }
}
class interfaceclass {
    public static void main(String[]args){
        tarnish t=new tarnish();
        t.scortch();
        t.ranni();
    }
}
