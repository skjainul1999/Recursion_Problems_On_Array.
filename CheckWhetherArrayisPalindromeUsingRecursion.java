// Question Link - https://course.acciojob.com/idle?question=4fd07c50-1cdf-488e-befd-e68b4b371c24



import java.util.*;
public class Main{
    public static void main(String[] hi){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
        }
        System.out.println(isPalindrome(a, 0, n-1));
    }
    static boolean isPalindrome(int[] a, int start, int end){
        if(start >=end ){
            return true;
        }
        else if(a[start] == a[end]){
            return isPalindrome(a, start+1, end-1);
        }
        else{
            return false;
        }
    }
    
}
