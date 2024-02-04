// Question Link -- https://course.acciojob.com/idle?question=8c8b34c5-be46-4d9c-9a68-51dcc9542b0b

import java.util.*;
public class Main{
    public static void main(String[] abc){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(smallestNumberInArrayUsingRecursion(arr,n));
    }
    static int smallestNumberInArrayUsingRecursion(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        int minElement=Math.min(arr[n-1],smallestNumberInArrayUsingRecursion(arr,n-1));
        return minElement;
    }
}
