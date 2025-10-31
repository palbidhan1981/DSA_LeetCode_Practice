package dsa.recursion;

public class RecursionFactorial {

    public static int recursionFactorial(int n){
        if(n==1){
            return 1;
        }

        return n*recursionFactorial(n-1);
    }
}
