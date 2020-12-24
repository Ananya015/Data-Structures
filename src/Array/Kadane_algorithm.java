package Array;

import java.util.Scanner;

//This algorithm is used for finding Largest Sum Contiguous Subarray


public class Kadane_algorithm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner ( System.in );
        System.out.println ("Enter size of array");
        int size_of_array= scanner.nextInt ();
        System.out.println ("Enter elements of array");
        int array[] = new int[size_of_array];
        for(int i=0;i<size_of_array;i++){
            array[i] = scanner.nextInt ();
        }

        int max_sum=array[0];
        int a=0;
        for(int i=0;i<array.length;i++){
            a=a+array[i];
            if(a>max_sum){
                max_sum=a;
            }
          if(a<0){
                a=0;
            }
        }
        System.out.println (max_sum);
    }

}
