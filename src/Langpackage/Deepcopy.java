package Langpackage;

public class Deepcopy {
    public static void main(String[] args) throws CloneNotSupportedException{
        Haii haii = new Haii(20,40);
        Helloo helloo = new Helloo(30,haii);
        Helloo helloo1 = (Helloo) helloo.clone();
        System.out.println(helloo==helloo1);
        System.out.println(helloo.haii==helloo1.haii);
        System.out.println(helloo.haii.x+"...."+helloo.haii.w+"...."+ helloo.y);
        helloo1.haii.x=300;
        helloo1.y=500;
        System.out.println(helloo1.y+"...."+helloo1.haii.x);

    }
}
class Haii{
    int x;
    int w;
    Haii(int x,int w){
        this.x=x;
        this.w=w;
    }
}
class Helloo implements Cloneable{
    int y;
    Haii haii;
    Helloo(int y, Haii haii){
        this.y=y;
        this.haii=haii;
    }
    public Object clone() throws CloneNotSupportedException{
        if (this instanceof Cloneable){
            Haii haii = new Haii(this.haii.x,this.haii.w);
            Helloo helloo = new Helloo(this.y,haii);
            return helloo;
        }
        else throw new CloneNotSupportedException();
    }
}
