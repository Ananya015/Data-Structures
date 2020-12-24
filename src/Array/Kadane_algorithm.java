package Array;

import java.util.Scanner;

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
    }

}
