import java.util.Scanner;

public class Static {
    int apple_price = 20;
    int total_apple = 5;

    void totalCash(int a){
        if(a%2==0){
             System.out.println("it is even number");
        }
        else{
            System.out.println("it is odd number");
        }
    }
    public static void main(String[] args) {
        Static obj = new Static();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
           obj.totalCash( num); 
          System.out.println(  );
        
    }
    
}
