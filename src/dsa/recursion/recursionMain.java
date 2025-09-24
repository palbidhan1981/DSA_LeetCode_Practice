package dsa.recursion;

public class recursionMain {
    public static void main(String[] arg){
        System.out.println("Starting recursion practice");
        int count=5;
        //printNameFiveTimes("Bidhan",count);
        //printNto1(count);
    }

    private static void printNto1(int count) {
        if(count==0){return;}
        System.out.println(count);
        printNto1(--count);
    }

    private static void print1toN(int count) {
        if(count==0){return;}
        System.out.println(count);
        print1toN(--count);
    }

    public static void printNameFiveTimes(String name,int count) {
        if(count==0){
            return;
        }
        System.out.println("printNameFiveTimes "+ name );
        printNameFiveTimes(name,--count);
    }

}
