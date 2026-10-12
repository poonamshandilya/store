package Langpackage;

public class Immutable {
    public static void main(String[] args) {
       Studentim st = new Studentim(99,"raja");
        System.out.println(st);

    }
}
final class Studentim {
    private final int sid;
    private final String name;
    public Studentim(int sid, String name){
        this.sid=sid;
        this.name=name;
    }
    public int getSid(){
        return sid;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return sid+"..."+name;
    }

}

