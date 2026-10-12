package PracticeProgram;

public class Cloning {
    public static void main(String[] args)throws CloneNotSupportedException {
        Hii hii=new Hii(10);
        Hlw h1=new Hlw(20,hii);
        Hlw h2= (Hlw) h1.clone();
        h1.show();
        h2.show();
        System.out.println(h1==h2);
        System.out.println(h1.hii==h2.hii);
        h2.y=30;
        h1.show();
        h2.show();
        h2.hii.x=111;
        h1.show();
        h2.show();
    }
}
class Hii{
    int x;
    Hii(int x){
        this.x=x;
    }
}
class Hlw implements Cloneable{
    int y;
    Hii hii;
    Hlw(int y, Hii hii){
        this.y=y;   this.hii=hii;
    }
    void show(){
        System.out.println("Hlw->"+ y);
        System.out.println("Hii->"+ hii.x);
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
