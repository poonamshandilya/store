package Methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

public class Methodref {
    public static void main(String[] args) {
      GeoMt gt=new GeoMt();
        Function<Integer,Integer> vc=gt::v1;
        vc.apply(10);
        Supplier<String> sp=gt::sup;
        System.out.println(sp.get());

    }
    public static int areaSquare(int a){
        return a*a;
    }
    public static int areaSquare(int a,int b){
        return a*b;
    }
}
class GeoMt{
    public Integer v1(Integer t){
        return t;
    }

    public String sup() {
        return "" ;
    }
}
