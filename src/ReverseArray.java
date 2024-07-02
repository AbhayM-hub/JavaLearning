public class ReverseArray {
    //reverse an array
    //original array ={1,2,3,4,5}
    public static  void reverse(int[] numbers,int start, int end){
        while(start<end){
            int temp = numbers[start];
            numbers[start] =numbers[end];
            numbers[end] =temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr,0,arr.length-1);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
