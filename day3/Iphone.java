package week2.day3;

public class Iphone extends ios {
	public void makecall() {
		System.out.println("make call");
	}
	public void sendsms() {
		System.out.println("send sms");
	}
	public void increasevolume()
	{
		System.out.println("Volume increased");
	}

	public static void main(String[] args) {
		Iphone apple=new Iphone();
		apple.startapp();
		apple.makecall();
		apple.shutdown();
		apple.increasevolume();
		apple.sendsms();
		

	}

}
