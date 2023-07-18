package week1.day2;

public class Mobile {
	public void sendsms() {
		System.out.println("from oppo");
		
	}
	public long makecall(long phno) {
		System.out.println("phno is 6380443614");
		return phno;
	}
	
	public static void main(String[] args) {
		Mobile Perform=new Mobile();
		Perform.sendsms();
	    Perform.makecall(6380443614l);
	   
	}

}
