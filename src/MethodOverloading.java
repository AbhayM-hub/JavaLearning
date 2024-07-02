public class MethodOverloading {


//  //1)Method overloading : changing no of arguments
//     static  int add(int a,int b){
//         return a+b;
//     }
//     static int add(int a,int b,int c){
//         return a+b+c;
//     }
//
//
//    public static void main(String[] args) {
//        System.out.println(add(11,11));
//        System.out.println(add(11,11,11));
//    }

    //2) chaning data type of argument
//    static  int add(int a,int b){
//         return a+b;
//     }
//     static double add(double a, double b){
//        return  a+b;
//     }
//
//    public static void main(String[] args) {
//        System.out.println(add(11,11));
//        System.out.println(add(11.2,11.3));
//    }

        //why method overloading is not possible by changing the return type
        static  int add(int a,int b){
         return a+b;
     }
     static double add(double a, double b){
        return  a+b;
     }

}
