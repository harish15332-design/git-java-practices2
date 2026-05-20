import java.util.Scanner;

public class alwin {
    public static void main(String[] args) {
        System.out.println("Hi Alwin \nWelcome to Quiez \nThis Test is Conducted by Madhan \n \nDo you like games");

        System.out.println("Type yes or no");

        String str1 = "yes";
        String str2 = "no";
        Scanner sc = new Scanner(System.in);
        String sc1 = sc.nextLine();

        if (str1.equals(sc1)) {
            System.out.println("ARE YOU GAY");
        } else if (str2.equals(sc1)) {
            for(int i=0;i<=10;i++){
                System.out.print("GAY");
            }
            System.out.println( "GAY");
        }

    }
}
