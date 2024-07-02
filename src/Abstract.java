
abstract class Shape{
    Shape(){
        System.out.println("Shape is create");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}
class Volvo extends  Shape{
    void run(){
        System.out.println("runnig safely");
    }
}
public class Abstract{
    public static void main(String[] args) {
        Shape obj1= new Volvo();
        obj1.run();
        obj1.changeGear();
    }


}
