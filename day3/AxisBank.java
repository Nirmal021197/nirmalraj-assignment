package week2.day3;

public class AxisBank extends Bankinfo {
public void deposit()
{
	System.out.println("deposit");
}
public static void main(String[] args) {
	AxisBank account=new AxisBank();
	account.saving();
	account.fixed();
	account.deposit();
	



}

}
