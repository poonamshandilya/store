package Oops;

public class SingleTon {
    public static void main(String[] args) throws CloneNotSupportedException {
    Single single = Single.getsingle();
    Single single2 = (Single)single.clone();
       // Single single2 = Single.getsingle();
        System.out.println(single);
        System.out.println(single==single2);
        System.out.println(single);
    }
}
class Single implements Cloneable {
    private static Single single = null;
    private Single(){

    }
    public static Single getsingle(){
        if (single==null){
           single= new Single();
        }
        return single;

    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
