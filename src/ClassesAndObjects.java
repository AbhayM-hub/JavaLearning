import java.util.Scanner;

public class ClassesAndObjects {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        Objects obj1 = new Objects();
        obj1.print();
    }
}

class Objects{
    Scanner sc = new Scanner(System.in);

    void print(){
        System.out.println("Hello World");
        int a=0;
        a =sc.nextInt();
        System.out.println("The maximum number is: " +Math.max(10,a));
    }
}