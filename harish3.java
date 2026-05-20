public class harish3 {
   public static void main(String[] args) {
    int a = 7;
    
    for (int i=0;i<a;i++){
       for(int j=0;j<a;j++){
        if(j==0 || i==0 || j==a-1 || i==a-1 || j==a/2 && i==a/2 || j==1 && i==1
            || j==3 && i==3 || j==5 && i==5 || j==5 && i==1 || j==1 && i==5 )
         {
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }
       }
       System.out.println(" ");
        }
   } 
}
