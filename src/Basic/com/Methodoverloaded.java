package Basic.com;

public class Methodoverloaded {
    public static void main(String[] args) {
        Methodoverloaded obj =new Methodoverloaded();
       // obj.bill(10);
        //obj.bill(10,20);
        //obj.bill(10,20,30);
        System.out.println(obj.bill(10,20,30,40));

    }
    int bill(int... a){
         int total = 0;
         if (a.length>0){
             for (int i=0; i<a.length; i++){
                 total = total+a[i];
             }
         }
         return total;
    }
}
