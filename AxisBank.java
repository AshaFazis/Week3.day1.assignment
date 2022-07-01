package week3.day1.assignment;

public class AxisBank extends BankInfo //create class Axisbank 
{
	public void deposit() //create method deposit and override 
	{
		System.out.println("This is another Deposit amount");
	}
	public static void main(String[] args) 
	{
		AxisBank bank = new AxisBank();
		bank.deposit();
		bank.saving();
		bank.fixed();
		System.out.println("Is this is a fixed account:" + bank.fixed());
		
	}
}
