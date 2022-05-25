import java.util.*;

class TestClass {
    static void spdCars(int n , int[] arr){
       int count = 0;
       for(int i= 1 ; i < n ; i++){
            if(arr[i]<=arr[i-1]){
                count++;
            }
            else if(arr[i]>arr[i-1]){
                arr[i]=arr[i-1];// we have to update current car speed to the previous speed of the car
            }      
       }
       System.out.println(count+1);// as the first car can always maintain highest speed
    }

    public static void main(String args[] ) throws Exception {
      int T ;
      Scanner sc = new Scanner(System.in);
      T = sc.nextInt();
      while(T--!=0){
          int n = sc.nextInt();
          int[] arr = new int[n];
          for(int i =0 ; i< n ; i++){
             arr[i] = sc.nextInt();
          }
           spdCars(n,arr);
      }
       

    }
}
