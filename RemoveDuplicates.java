package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	

	public static void main(String[] args) {
	
	        String companyName = "google";
	        char[] charArray = companyName.toCharArray();
	        System.out.println(charArray);
	        
	        
	        Set<Character> uniquename=new LinkedHashSet<Character>();
	        Set<Character> duplicate=new LinkedHashSet<Character>();
	        for(int i=0;i<charArray.length;i++) {
	            if(!uniquename.add(charArray[i]))
	            {
	                duplicate.add(charArray[i]);
	            }
	            
	        }
	        System.out.println(uniquename);
	        System.out.println(duplicate);
	    }
	    }

		


