package week1.day2;
public class Fibonacciseries {
	public static void main(String[] args) {
		int count=8;
		int f1=0;
		int f2=1;
		int sum;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=1;i<count;i++) {
			sum=f1+f2;
			f1=f2;
			f2=sum;
			System.out.println(sum);
		}
	}
}