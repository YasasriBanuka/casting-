public class World {
    String name;
    void process(){
        System.out.println("Earth can Rotate!");
    }
}
class Earth extends World{
    int area;

    @Override
    void process() {
        System.out.println("Earth is world");
    }
}
class testCasting{
    public static void main(String[] args) {
        World w=new Earth();
        w.name="Earth";
        System.out.println(w.name);
        w.process();
        Earth e= (Earth) w;
        e.area = 510;
        System.out.println(e.name);
        System.out.println(e.area);
        e.process();
    }
}