// Question Link -- https://course.acciojob.com/idle?question=400e860f-4061-4caa-bc11-0b2cf75c100e


import java.util.*;
public class Main{
   public static void main(String[] abcfsdkfj){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       System.out.println(maxElement(arr,n));
       
   } 
   static int maxElement(int[] arr, int n){
       if(n==1){
           return arr[0];
       }
       int max=Math.max(arr[n-1],maxElement(arr,n-1));
       return max;
   }
}
