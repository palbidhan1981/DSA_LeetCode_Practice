package dsa.pattern;

public class Pattern {

    public static void printStarSquare(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printStarPerpendicularTriangle(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printNoPerpendicularTriangle(int n){
        for(int i=1;i<n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void printNoPerpendicularTriangleSamenoEachRow(int n){
        for(int i=1;i<n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }

    public static void printStarReversePerpendicularTriangle(int n){
        for(int i=n;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printNoReversePerpendicularTriangle(int n){
        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void noEqualTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=1;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    public static void starEqualTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
