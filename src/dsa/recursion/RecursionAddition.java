package dsa.recursion;

public class RecursionAddition {

    public static void recursionAddition(int sum,int n){
       if(n<1){
           System.out.println("Total Sum : " +sum);
           return ;
       }
       recursionAddition(sum+n,n-1);

    }
}
