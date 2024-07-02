class Animals{
//    String color = "White";
//    void eat(){
//        System.out.println("eating");
//    }
    Animals(){
        System.out.println("Animal is created");
    }
}
class Bunny extends Animals{
//    String color ="Black";
//    void printColor(){
//        System.out.println(color);
//        System.out.println(super.color);
//    }
//    void eat(){
//        System.out.println("dog is eating");
//    }
//    void bark(){
//        System.out.println("Barking");
//    }
//    void work(){
//        super.eat();
//        bark();
//    }
    Bunny(){
        super();
        System.out.println("Bunny is created");
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        Bunny obj1 = new Bunny();
//        obj1.work();

    }
}
