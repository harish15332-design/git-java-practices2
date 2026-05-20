import java.util.Scanner;

public class number {
    public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
         int res =num%10;
         System.out.println(res);

         int res1 =num/10;
         System.out.println(res1);

    }
}
