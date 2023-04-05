public class Human {
    void printData(){
        System.out.println("method of super class");
    }
}
class man extends  Human {
    @Override
    void printData() {
        System.out.println(" method of sub class ");
    }
}
class test{
    public static void main(String[] args) {
        Human H = new man();
        Human h1= new man ();
        H.printData();
        h1.printData();
    }
}