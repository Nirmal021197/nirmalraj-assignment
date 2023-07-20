package week1.day3;

import java.util.Arrays;

public class SecondLargestArray {
public static void main(String[] args)
{
	int data[]= {3,2,11,4,6,7};
	int length=data.length;
Arrays.sort(data);

System.out.println("the second largest number" +data[(data.length-2)]);
	
}
}
