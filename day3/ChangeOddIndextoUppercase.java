package week1.day3;

public class ChangeOddIndextoUppercase {

	public static void main(String[] args) {
		String word="changeme";
		char[]ch=word.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i%2==0) {
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(new String(ch));

	}

}
