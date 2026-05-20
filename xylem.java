import java.util.Scanner;

public class xylem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int lastDigit = num % 10;
        int middle = 0;
        int sum = lastDigit;
        int temp = num / 10;

        for (; temp > 9; temp = temp / 10) {
            int tem = temp%10;

            middle = middle + tem;

        }
        sum = sum + temp;
        if (sum == middle) {
            System.out.println("It is Xylem");
        } else {
            System.out.println("It is phylem");
        }

        // System.out.println(sum);
        // System.out.println(middle);
        // System.out.println();

    }
}