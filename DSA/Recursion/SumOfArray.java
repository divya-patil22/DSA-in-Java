public class SumOfArray {
              static  int sumOfArray1(int[] arr,int i){
              
              if(i>arr.length-1){
              return 0;
              }
              
              return arr[i]+sumOfArray1(arr,i+1);
              }
                static  int sumOfArray2(int[] arr,int i){
              
              if(i<0){
              return 0;
              }
              //start with =>sumOfArray1(arr,0);
              return arr[i]+sumOfArray2(arr,i-1);
              }
     public static void main(String[] args) {
         int[] arr={1,2,3,4,5};
         int sum = sumOfArray2(arr,arr.length-1);
         System.out.println(sum);
     }         
}
