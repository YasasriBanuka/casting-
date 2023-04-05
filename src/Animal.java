
public class Animal {
    String name;
    void SetName(){
        System.out.println("Cat");
    }
}
class fish extends Animal {
    String color;
    @Override
    void SetName() {
        System.out.println("blue  Fish");
    }
}
 class run{
     public static void main(String[] args) {
         Animal a= new fish();
         a.name= "Bolla";
         fish f= new fish ();
         f.name = "linna";
         f.color = "Black";
         System.out.println("name :- "+ a.name);
         a.SetName();
         System.out.println( "name :- " + f.name);
         System.out.println("name :- " + f.color);
         f.SetName();
     }
 }