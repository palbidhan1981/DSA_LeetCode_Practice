package dsa.recursion;

public class RecursionReverseArray {

    public static int[] RecursionReverseArray(int[] recursionReverserArray, int start, int end){
        if(start>end){
            return recursionReverserArray;
        }
        int temp=recursionReverserArray[end];
        recursionReverserArray[end]=recursionReverserArray[start];
        recursionReverserArray[start]=temp;
        RecursionReverseArray(recursionReverserArray,++start,--end);
        return recursionReverserArray;

    }

    public static int[] RecursionReverseArraySingleParametere(int[] recursionReverserArray, int start){
        if(start>=recursionReverserArray.length/2){
            return recursionReverserArray;
        }
        int temp=recursionReverserArray[recursionReverserArray.length-start-1];
        recursionReverserArray[recursionReverserArray.length-start-1]=recursionReverserArray[start];
        recursionReverserArray[start]=temp;
        RecursionReverseArraySingleParametere(recursionReverserArray,++start);
        return recursionReverserArray;

    }
}
