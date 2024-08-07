public class SecondMaxValueInArray {
    //find second max value in array
    //1,2,5,9,7

    public static int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                secondMax =max;
                max = arr[i];

            }else if(arr[i]>secondMax && arr[i]!=max){
                secondMax =arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,5,9,7};
        System.out.println(findSecondMax(arr));
    }
}
