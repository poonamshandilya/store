package PracticeProgram;

public class Singleton {
    public static void main(String[] args) {
      /* Helloo h=Helloo.getHelloo();
        System.out.println(h);
        System.out.println(Helloo.getHelloo());
        System.out.println(Helloo.getHelloo());
        Helloo h2= (Helloo) h.clone();
        System.out.println(h2);*/
        for (int i=0;i<10;i++)
            System.out.println(Helloo.getHelloo());
    }
}
class Helloo{
    private static Helloo h1=new Helloo();
    private static Helloo h2=new Helloo();

    //private static Helloo  INS=null;
    private Helloo(){ }
    public static Helloo getHelloo() {
        if (Math.random()>0.5)
            return h1;
        else
            return h2;
    }
/*if (INS==null);
INS =new Helloo();
return INS;
    }
   protected Object clone(){
        return this;
   }*/
}
