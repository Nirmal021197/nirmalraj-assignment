package week1.day3;

public class Reverseevenwords {
	public static void main(String[] args)
	{
		String words="I am a software tester";
		String Evenwords[]=words.split("");
		for(int i=0;i<Evenwords.length;i++)
		{
			if(i%2==1)
			{
				char[] charArray=Evenwords[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--) {
					System.out.println(charArray[j]);
				}
			}
			else {
				System.out.println(Evenwords[i]);
			}
		}
		
		
	}

}
