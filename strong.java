import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int lastDigit , sum = 0;

        for (int temp = num; temp > 0; temp = temp/10) {
            lastDigit = temp%10;

            int fact = 1;

            for (int i = 1; i<=lastDigit; i++) {
                fact = fact * i;

            }
            sum = sum + fact;
           
        }
        // System.out.println(sum);
         if == sum){
                System.out.println("It is a Strong Number");

            }
            else{
                System.out.println("It is not a strong number");
            }

    }

}
