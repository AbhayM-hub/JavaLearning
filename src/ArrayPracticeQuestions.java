import java.util.Arrays;

public class ArrayPracticeQuestions {
//    public static void main(String[] args) {
//        int arr[]= {1,2,3,4,5,6,7,8,9};
//        int sum = 0;
//        for(int i:arr){
//            sum +=i;
//        }
//        System.out.println("the sum is:" +sum);
//    }
//public static void main(String[] args) {
//    //grid
//    int a[][]=new int[10][10];
//    for(int i=0;i<10;i++){
//        for(int j=0;j<10;j++){
//            System.out.print(a[i][j]);
//        }
//        System.out.println();
//    }
//}
//public static void main(String[] args) {
////    average of value
//    int []number = new int[]{20,30,35,-16,60,-100};
//    int sum =0;
//    for (int i=0;i<number.length;i++){
//        sum= sum +number[i];
//    }
//    double average = sum / number.length;
//    System.out.println("The average of the array elements are  " +average);
//}

//    //write a java program to test if aan array contains a specific value
//    public static boolean contains(int[] arr, int item) {
//        for (int i : arr) {
//            if (i == item) {
//                return true;
//            }
//        }
//        return false;
//    }
//        public static void main (String[]args){
//        int[] arr = {10,20,23,30,45};
//        int item = 23;
//            System.out.println(contains(arr,item));
//
//        }

//    // Write a java program to the index of an array element
//    public static int findIndex(int[] arr,int t){
//        //base condition
//        if(arr ==null){
//            return -1;
//        }
//        int len =arr.length;
//        int i =0;
//        while (i<len){
//            if(arr[i]==t){
//                return i;
//            }
//            else{
//                i++;
//
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int[] arr = {10,20,23,30,45};
//        int item=4;
//        System.out.println(findIndex(arr,item));
//    }

    //write a program to copy an array by itterating of array


    public static void main(String[] args) {
        int[] arr={10,20,23,30,45};
        int[] new_arr=new int[5];
        System.out.println("Original array: "+ Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            new_arr[i]=arr[i];
        }
        System.out.println("Copied array: "+ Arrays.toString(new_arr));
    }

}
