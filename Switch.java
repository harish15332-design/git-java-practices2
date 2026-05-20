import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                int res = a + b;
                System.out.println(res);
            }
                break;
            case 2: {
                int res = a - b;
                System.out.println(res);
            }
                break;
            case 3: {
                int res = a * b;
                System.out.println(res);
            }
                break;
            case 4: {
                int res = a / b;
                System.out.println(res);
            }
                break;
            default:
        
        }

    }
}
