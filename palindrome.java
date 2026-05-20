import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
        Palindrome(x);
        System.out.println(Palindrome(x));
    }

    public static boolean Palindrome(int x){
        if(x<0){
            return false;
       }
       String num = x+"";
       return isPalindrome(num);
    }
    public static boolean isPalindrome(String num){
        int left = 0;
        int right = num.length()-1;
         while (left<right) {
            if(num.charAt(left)!=num.charAt(right)){
                 return false;
            }
            left++; right--;
         }
        return true;
    }
    
    
}
