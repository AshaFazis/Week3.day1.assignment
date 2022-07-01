package week3.day1.assignment;

public class Students //create class students
{
	public static void main(String[] args) 
	{
		Students student = new Students();
		int studentsInfo = student.getStudentsInfo(123);
		System.out.println("Student ID:" + studentsInfo);
		student.getStudentsInfo(123, "Asha");
		student.getStudentsInfo("asha@gmail.com", 9834577886l);
		
	}
	public int getStudentsInfo(int id) //create method studentinfo
	{
		return id;
	}
	public void getStudentsInfo(int id,String name) //create method studentinfo and override it with different arguments
	{
		System.out.println("Student ID:" + id + " " + "Student Name:" + name);
	}
	public void getStudentsInfo(String email,long phoneNumber) //create method studentinfo and override it with different arguments
	{
		System.out.println("email ID:" + email + " " + "Phone number:" + phoneNumber);
	}
}
