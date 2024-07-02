//interface Banks{
//    float rateOfInterest();
//}
//
//class SBI implements Banks{
//    public float rateOfInterest(){
//        return 9.15f;
//    }
//}
//
//
//
//public class Interface {
//    public static void main(String[] args) {
////        Banks obj1= new SBI();
////        System.out.println("SBI rate of interest is:" +obj1.rateOfInterest());
//    }
//}
//



//multiple interfaces
interface Printable{
    void print();
}
interface Showable{
    void show();
}

public class Interface implements Printable, Showable{

    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("World");
    }

    public static void main(String[] args) {
        Interface obj1 = new Interface();
        obj1.print();
        obj1.show();
    }
}