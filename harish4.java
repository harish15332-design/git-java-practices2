public class harish4 {
    public static void main(String[] args)throws InterruptedException  {
        int n=9;
        // char ch = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i>=j && i+j<=n-1 || i<=j && i+j>=n-1 )  {
                    Thread.sleep(250);
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
           

            System.out.println(" ");
        }
    }
}
