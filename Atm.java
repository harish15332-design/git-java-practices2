import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Initial = 10000;
        int choice = sc.nextInt();
        int res1;
        switch (choice) {
            case 1: {

                int res = Initial;
                System.out.println(res);
            }
                break;
            case 2: {
                int b =sc.nextInt();
                 res1 = Initial + b;
                System.out.println(res1);
            }
                break;
            case 3: {
                int b =sc.nextInt();
                 res1 = Initial - b;
                System.out.println(res1);
            }
                break;
            case 4: {
    
                System.out.println("Exit");
            
            }
                break;
            default:
        
        }

    }
}
