package week1.day3;

public class Rem0veDuplicates {

	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		String[] word = text.split("");

		for(int j=0;j<word.length;j++) {
			for(int k=j+1;k<word.length;k++)
			{
				if (word[j].equals(word[k]))
				{
					word[k]="";
				}
			}
		}
		System.out.println("Removing Duplicates");
		for(int l=0;l<word.length;l++) {
			System.out.println(word[l]);
		}

	}
}



