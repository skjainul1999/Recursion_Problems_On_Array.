
// Question Link -- https://course.acciojob.com/idle?question=65eafce1-0855-4edb-a0be-6907192010ca


import java.util.*;
public class Main{
   public static void main(String[] abcfsdkfj){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       PrintArrayRecursively(arr,n,0);
       
   } 
   static void PrintArrayRecursively(int arr[], int n, int i){
       if(n == 0){
           return;
           
       }
       PrintArrayRecursively(arr,n-1,i+1);
       System.out.print(arr[i]+" ");
   }
}
