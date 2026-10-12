package Has_A_relationship;

public class Composition {
    public static void main(String[] args) {
House house = new House();
house.live();
    }
}
class Room{
    void use(){
        System.out.println("room is using");
    }
}
class House{
   private Room room = new Room();
   void live(){
       room.use();
       System.out.println("living in house");
   }
}
