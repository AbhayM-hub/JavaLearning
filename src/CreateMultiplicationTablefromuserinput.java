import java.util.Scanner;
public class CreateMultiplicationTablefromuserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the positive numbber");
        num = sc.nextInt();
        System.out.println("Multiplication table of "+num);
        for(int i=1; i<=10 ;i++){
            System.out.println(num+ " x " +i + " = " +(num *i));
        }
    }


}
