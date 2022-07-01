package week3.day1.assignment;

public abstract class MultipleLanguage //create abstract class multiple language
{
   public boolean python() //implemented method
  { 
	String s = "Java is one of the languages";
	if(s.contains("Python"))
	{
	    System.out.println("Method is python");
	    return true;
	}
	else
	{
		System.out.println("Not Python method");
		return false;
	}
	
  }
   public abstract void ruby(); //unimplemented method
}
