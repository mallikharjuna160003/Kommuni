// Java program to find the target value first occurrence of an elements in given sorted array
import java.io.*;
class Question1 {
	
	public static void findFirst(int arr[], int x)
	{
		int n = arr.length;
		int first = -1, last = -1;
		for (int i = 0; i < n; i++) {
			if (x != arr[i])
				continue;
			if (first == -1)
				first = i;
		}
		if (first != -1) {
			System.out.println("First Occurrence = " + first);
			
		}
		else
			System.out.println("Not Found");
	}

	public static void main(String[] args)
	{
		int arr[] = { 1,2, 2,5, 5, 6, 6, 6, 6, 8, 9, 9, 9,11,12,15 };
		int target = 9;
		findFirst(arr, target);
	}
}

