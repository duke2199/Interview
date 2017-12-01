package durai.interview;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctPairsOfSeven {
	static int  sum = 7;
	public static void main(String[] args) {
		System.out.println("Enter the input array size\n");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int size=scanner.nextInt();
		System.out.println("Enter the input array of integers and it should be less than "+sum+"\n");
		int[] input = new int[size];
		for(int i=0;i<size;i++) {
			input[i]=scanner.nextInt();
			if(input[i]>7) {
				System.out.println("Please enter a value less than "+ sum+"\n");
				input[i]=scanner.nextInt();
			}
	
		}
		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		findDistinctPairOfSeven(input);
	
	}

	private static void findDistinctPairOfSeven(int[] input) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < input.length; i++) {
	            for (int j = i + 1; j < input.length; j++) {
	                if ((input[i] + input[j]) == sum) {
	                    System.out.println("("+input[i]+","+input[j]+")");
	                }
	            }
		 }
	}

}
