import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int arr1[] = {1,3,5};
        int arr2[] = {2,4,6};

        int res[] = new int[arr1.length+arr2.length];
        int a=0, b=0,c=0;
        while( a<arr1.length && b<arr2.length){
            
            if(arr1[a]<arr2[b]){
                res[c] = arr1[a];
                c++;a++;
            }
            else{
                res[c] = arr2[b];
                c++;b++;
            }
            while (a<arr1.length) {
                res[c++] = arr1[a++];
            }
             while (b<arr2.length) {
                res[c++] = arr1[b++];
            }

        }
        System.out.println(Arrays.toString(res));
    }
}
