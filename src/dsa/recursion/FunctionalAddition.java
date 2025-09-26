package dsa.recursion;

public class FunctionalAddition {
    public static int functionalAddition(int n){
        if(n==0){
            return 0;
        }
        return n+functionalAddition(n-1);

    }
}
