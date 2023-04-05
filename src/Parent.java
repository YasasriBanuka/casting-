public class Parent {
    String name;
    void display(){
        System.out.println(" super class is running");
    }
}
class child extends Parent{
    int age;
    @Override
    void display() {
        System.out.println(" super class is running  ");
    }
}
class DownCasting{
    public static void main(String[] args) {
        Parent p= new child () ; // upcasted object
        p.name = "Banuka";
        child c= (child) p;
        c.age=25;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();
    }

}