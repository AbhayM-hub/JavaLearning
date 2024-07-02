//find minimum and maximum element from an array
//5,6,9,10,25

public class MInMaxArray {
    public static int findMinimum(int[] arr){
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMaximum(int[] arr){
        int max =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={5,6,9,10,25,4};
        findMinimum(arr);
        System.out.println("Minimum number is : "+findMinimum(arr));
        findMaximum(arr);
        System.out.println("Maximum number is : "+findMaximum(arr));
    }
}
