import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='A'&& ch<='Z'|| ch>='a'&& ch<='z'){
            System.out.println("Alpahabet");
        }
        else if(ch>='0'&& ch<='9'){
            System.out.println("number");
        }
        else{
            System.out.println("why are you gay");
        }
    }
}
