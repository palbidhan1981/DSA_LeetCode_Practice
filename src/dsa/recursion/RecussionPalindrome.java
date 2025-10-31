package dsa.recursion;

public class RecussionPalindrome {
    public static boolean RecursionPalindrome(String palindrome,int start,int end){
        if(start>end){
            return true;
        }
       if(palindrome.charAt(start)!=palindrome.charAt(end))
           return false;
        return RecursionPalindrome(palindrome,++start,--end);

    }

}
