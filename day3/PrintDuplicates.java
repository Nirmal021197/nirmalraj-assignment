package week1.day3;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int array[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(array);
		for(int i=0;i<array.length-1;i++)
		{
		
			for(int j=i+1;j<array.length-1;j++) {
				if(array[i]==array[j])
				{
					System.out.println(array[j]);
				}
				
			}
			
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
