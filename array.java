import java.util.Arrays;

public class array {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3 };
    int[] arr2 = { 4, 5, 6 };
    int[] arr3 = { 7, 8, 9 };

    merge(arr1, arr2, arr3);

  }

  public static void merge(int[] arr1, int[] arr2, int[] arr3) {
    int i = 0, j = 0, k = 0, h = 0;
    int res[] = new int[arr1.length + arr2.length + arr3.length];

    for (; i < arr1.length;i++) {
      res[k] = arr1[i];
      k++;
    }
    while(j<arr2.length){
      res[k] = arr2[j];
      j++;
      k++;
    }
    while(h<arr3.length){
      res[k] = arr3[h];
      k++;
      h++;
    }
    for(int g=0;g<res.length;g++){
      System.out.println(res[g]);
    }
    System.out.println(Arrays.toString(res));
  }

}
