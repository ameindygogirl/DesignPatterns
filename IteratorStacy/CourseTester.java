/*
Team: The Nikola Teslas
Members: Ryan Babcock, Stacy Carlson, and Laura Humphreys 
*/
public class CourseTester
{
	public static void main(String[] args)
	{
		Course testCourse = new Course(101, "English", "Dr. Welsh");
		testCourse.registerStudent(1, "Brent", "Jacks", 3.4, "Arts");
		testCourse.registerStudent(2, "Jackson", "Smith", 3.0, "Math");
		testCourse.registerStudent(3, "Mary", "Luck", 4.0, "Computer Science");
		for(Object o : testCourse)
		{
			System.out.println(o.toString());
		}
	}	
}
