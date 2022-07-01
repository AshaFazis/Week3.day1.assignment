package week3.day1.assignment;

public class Automation extends MultipleLanguage implements Language //concrete class extending abstract class which implements both interface
{

	public static void main(String[] args) 
	{
		Automation obj = new Automation();
		System.out.print(obj.python());
		
		Language obj1 = new Automation();
		obj1.Java();
		obj1.Selenium();

	}
	@Override
	public void Selenium() //implementing unimplemented method from testtool interface
	{
		
		
	}

	@Override
	public void Java() //implementing unimplemented method from language interface
	{
		
		
	}

	@Override
	public void ruby() //implementing unimplemented method from abstract class
	{
		
		
	}

}
