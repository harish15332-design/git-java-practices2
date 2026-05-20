import java.util.Scanner;

public class firsrAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int lastDigit = num%10;
        int lastDigit1 = 0; 
        System.out.println(lastDigit);
        int firstDigit = 0;
        int reverse = 0;

        for(int temp = num; temp>0; temp = temp/10){
            lastDigit1 = temp%10;
            reverse = reverse*10 + lastDigit1;

        }
        firstDigit = reverse%10;
        // System.out.println(firstDigit);

        int sum = firstDigit + lastDigit;
        System.out.println(sum);

    }
    
}
