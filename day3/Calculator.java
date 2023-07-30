package week2.day3;

public class Calculator {
	public void add(int a,int b)

	{
		System.out.println(a+b);
	}
	public void add(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	public void multiple(double a,double b)
	{
		System.out.println(a*b);
	}
	public void multiple(float x,float y)
	{
		System.out.println(x*y);
	}
	
	public static void main(String[] args) {
		Calculator add=new Calculator();
	    add.add(1,2);
	    add.add(1, 3,6);
	    add.multiple(2.5,2.8);
	    add.multiple(1.6f,2.6f);
		
		
		

	}

}
