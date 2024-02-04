// Question Link -- https://course.acciojob.com/idle?question=249da881-b2a3-45a9-9e10-8b74832fb0b9


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
       System.out.print(arr[i]+" ");
       PrintArrayRecursively(arr,n-1,i+1);
   }
}
