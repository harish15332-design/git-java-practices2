import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;

        int count = 0;
        int sum = 0;

        for (int temp = num; temp > 0; temp = temp / 10) {
            int digit = temp % 10;
            count++;
        }
        // System.out.println(count);

        for (int j = original; j > 0; j = j / 10) {
            int digit1 = j % 10;
            int prod = 1;

            for (int i = 1; i <= count; i++) {
                prod = prod * digit1;

            }
            sum = sum + prod;
        }

        if (num == sum) {
            System.out.println("it is a armstrong number");
        } else {
            System.out.println("it is not armstrong");
        }
    }
}
