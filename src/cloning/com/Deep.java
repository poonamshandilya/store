package cloning.com;

/*public class Deep{
    public static void main(String[] args) throws CloneNotSupportedException {
        Countryc obj = new Countryc(555);
        States objr = new States(100,"patna",obj);

        States objc = (States) objr.clone();

        objc.cref.pincode1=111;

        System.out.println(objr);
        System.out.println(objc);

    }
}
class Countryc{
    int pincode1;
    Countryc(int pincode1){
        this.pincode1=pincode1;

    }

    @Override
    public String toString() {
        return "Countryc{" +
                "pincode1=" + pincode1 +
                '}';
    }
}
class States implements Cloneable{
    int population1;
    String name;
    Countryc cref;

    public States(int population1,String name, Countryc cref) {
        this.population1 = population1;
        this.name=name;
        this.cref = cref;
    }
    public Object clone() throws CloneNotSupportedException{
        if (this instanceof Cloneable){
            Countryc obj = new Countryc(this.cref.pincode1);
            States statesobj = new States(this.population1,name,obj);
            //States statesobj= new States(this.name,obj);
            return statesobj;
        }else {
            throw new CloneNotSupportedException();
        }
    }

    @Override
    public String toString() {
        return "States{" +
                "population1=" + population1 +
                ", name='" + name + '\'' +
                ", cref=" + cref +
                '}';
    }
}*/



/*public class Deep {

    public static void main(String[] args) throws CloneNotSupportedException {
        X obj = new X(10);
        Y objr = new Y(50,obj);
        Y objc = (Y) objr.clone();

        objc.xref.a=75;
        System.out.println(objr);
        System.out.println(objc);
    }
}
class X{
    int a;

    public X(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "X{" +
                "a=" + a +
                '}';
    }
}

class Y  implements Cloneable{
    int b;
    X xref;

    public Y(int b, X xref) {
        this.b = b;
        this.xref = xref;
    }
    public Object clone() throws CloneNotSupportedException{
        if (this instanceof  Cloneable){
            X obj = new X(this.xref.a);
            Y yobj =new Y(this.b,obj);
            return yobj;
        }else {
            throw new CloneNotSupportedException();
        }
    }

    @Override
    public String toString() {
        return "Y{" +
                "b=" + b +
                ", xref=" + xref +
                '}';
    }
}*/
public class Deep {
    public static void main(String[] args) throws CloneNotSupportedException {
        Country c =new Country("India",1933456689);
        State objr = new State(56688,"Benglore",c);
        State objc = (State) objr.clone();

        //objc.c.name= "UK";
        System.out.println(objr+"..."+ objc);
        System.out.println(objr.c == objc.c);
        objc.pincode=9878;
        objc.c.name="japan";

        System.out.println(objr+"..."+ objc);
        System.out.println(objr.c == objc.c);
        
    }
}
class Country {
    String name;
    long population;
    public Country(String name, long population) {
        this.name = name;
        this.population=population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
class State implements Cloneable{
    int pincode;
    String name;
    Country c;

    public State(int pincode,String name, Country c) {
        this.pincode = pincode;
        this.name=name;
        this.c = c;
    }

    @Override
    public String toString() {
        return "State{" +
                "pincode=" + pincode +
                ", name='" + name + '\'' +
                ", c=" + c +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        if (this instanceof Cloneable) {
            Country obj = new Country(this.c.name,this.c.population);
            State obj1 = new State(this.pincode,this.name, obj);
            return obj1;
        } else {
            throw new CloneNotSupportedException();
        }

    }
}