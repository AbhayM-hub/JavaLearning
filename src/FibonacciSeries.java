import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //0 1 1 2 3 5 ....
        int number;
        int firstTerm= 0, secondTerm = 1, thirdTerm;

        System.out.println("Enter the number of terms you want the series");
        number = sc.nextInt();
        System.out.print(firstTerm+ " "+secondTerm+ " ");
        for(int i=3; i<=number ; i++){
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm+" ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }
}
