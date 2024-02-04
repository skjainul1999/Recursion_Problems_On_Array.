// Question Link -- https://course.acciojob.com/idle?question=19c1d7f8-13a4-4da2-83d3-4164bacb02c5



import java.util.*;
public class Main{
    public static void main(String[] abcdefg){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int T=sc.nextInt();
        System.out.print(firstOccurenceIndex(A,N,T,0));
    }
    static int firstOccurenceIndex(int[] A,int N,int T, int startIndex){
        if(startIndex == N){
            return -1;
        }
        if(A[startIndex] == T){
            return startIndex;
        }
        return firstOccurenceIndex(A,N,T,startIndex+1);
    }
}
