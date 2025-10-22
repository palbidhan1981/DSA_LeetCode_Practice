package dsa.recursion;

public class RecursionMain {
    public static void main(String[] arg){
        System.out.println("Starting recursion practice");
        int count=5;
        int sum=0;
        int[] recursionArray=new int[]{1,2,3,4};
        //printNameFiveTimes("Bidhan",count);
        //printNto1(count);
        //print1toN(0,count);
        //printNto1BackTracking(1,count);
        //print1toNBackTracking(count);
        //RecursionAddition.recursionAddition(sum,5);
        //System.out.println("Functional Addition : " + FunctionalAddition.functionalAddition(6));
        //System.out.println("Recursion Factorial : " + RecursionFactorial.recursionFactorial(4));

       /* int[] recursionReverseArray=RecursionReverseArray.RecursionReverseArray(recursionArray,
                        0,recursionArray.length-1);*/
        int[] recursionReverseArray=RecursionReverseArray.RecursionReverseArraySingleParametere(recursionArray,
                0);
        for(int i:recursionReverseArray) {
            System.out.print(i+",");
        }
    }

    private static void print1toNBackTracking(int count) {
        if(count<1) return;
        print1toNBackTracking(count-1);
        System.out.println(count);
    }

    private static void printNto1(int count) {
        if(count==0){return;}
        System.out.println(count);
        printNto1(--count);
    }

    private static void print1toN(int start,int count) {
        if(count==start){return;}
        System.out.println(++start);
        print1toN(start,count);
    }

    public static void printNameFiveTimes(String name,int count) {
        if(count==0){
            return;
        }
        System.out.println("printNameFiveTimes "+ name );
        printNameFiveTimes(name,--count);
    }

    private static void printNto1BackTracking(int start,int count) {
        if(count<start){return;}

        printNto1BackTracking(start+1,count);
        System.out.println(start);
    }


}
