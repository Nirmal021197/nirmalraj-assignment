package week2.day3;

public class Desktop extends Computer {
	public void desktopsize()
	{
		System.out.println("15.6 inches");
	}

	public static void main(String[] args) {
		Desktop laptop=new Desktop();
		laptop.desktopsize();
		laptop.computermodel();

	}

}
