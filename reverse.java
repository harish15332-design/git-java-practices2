import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");

        int num = sc.nextInt();

        int original = 0;

        for( int temp= num; temp>0; temp= temp/10){
            int reverse = temp%10;
             original = original*10+reverse;
        }
        System.out.println(original );
    }
}
