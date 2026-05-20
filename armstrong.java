import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int temp = num;
        int temp1 = num;

        int count = 0;

        while (temp!=0) {
            count++;
            temp = temp / 10;
        }
        // System.out.println(temp)

         int sum= 0;
         for(int i = temp1; i>0; i = i/10){
               int prod = 1;
               int lastdigit = i%10;
               for(int j = 1; j<=count; j++){
                   prod = prod *lastdigit;
               }
               sum  = sum+ prod;
         }
         if(temp1 == sum){
            System.out.println("it is armstrong number");

         }
         else{
            System.out.println("it is not armstrong number");
         }

       
    }
}