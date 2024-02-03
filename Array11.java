
// Question Link -- https://course.acciojob.com/idle?question=fad89b8e-c73f-4a75-9de6-a5b045e60394



import java.util.*;
public class Main{
    public static void main(String[] hi){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
        }
        System.out.println(array1(a, 0));
    }
    static int array1(int[] a, int index){
        if(index >= a.length){
            return 0;
        }
        else if(a[index] == 11){
            return 1 + array1(a, index+1);
        }
        else{
            return array1(a,index+1);
        }
    }
}
