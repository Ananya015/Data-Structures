package Array;
//find the majority element i.e. element that appears more than n/2 times where n is length of array
//eg. 7 5 7 2 6 7 7 output-7


import java.util.Scanner;

public class Majority_element1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner ( System.in );
        System.out.println ("enter length if array");
        int n=scanner.nextInt ();
        System.out.println ("enter elements of array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt ();
        }

        int count=0;
        int majorityElement=0;
        for(int el:arr) {
            if (count == 0) {
                majorityElement = el;
            }
            if (el == majorityElement) {
                count++;
            } else {
                count--;
            }
        }
            System.out.println ( majorityElement );

    }
}
