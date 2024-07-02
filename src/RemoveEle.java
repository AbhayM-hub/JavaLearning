public class RemoveEle {
    //Remove the even numbers from an array
    //arr[]={3,2,4,7,8}
    //arr2[]={3,7}
    //steps: Count the number of add Number. create a new array of size = no. of odd numbers. if number is odd take it and put it inside in new array

    static int[] removeEven(int[] arr){
        int oddCount = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[idx]=arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={3,2,4,7,8};
        int arr2[]=removeEven(arr);
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]+" ");
        }
//        System.out.println(arr2);
//        System.out.println(removeEven(arr));


    }
}
