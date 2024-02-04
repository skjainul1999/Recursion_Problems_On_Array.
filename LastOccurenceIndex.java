
// Question Link -- https://course.acciojob.com/idle?question=19c1d7f8-13a4-4da2-83d3-4164bacb02c5


import java.util.*;
public class Main{
    public static void main(String[] hi){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        System.out.println(lastOccurenceIndex(a,n,t,n-1));
    }
    static int lastOccurenceIndex(int a[], int n, int t,int startIndex){
        if(startIndex == -1){
            return -1;
        }
        if(a[startIndex] == t){
            return startIndex;
        }
        return lastOccurenceIndex(a,n,t,startIndex-1);
    }
}
