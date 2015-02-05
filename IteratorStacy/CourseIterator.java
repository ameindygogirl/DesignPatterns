/*
Team: The Nikola Teslas
Members: Ryan Babcock, Stacy Carlson, and Laura Humphreys 
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class CourseIterator implements Iterator<Student>
{
	private ArrayList<Student> studentList;
	private int i;
	
	public CourseIterator(ArrayList<Student> list)
	{
		this.studentList = list;
		i = 0;
	}

	@Override
	public boolean hasNext()
	{
		if(i < studentList.size())
		{
			return true;
		}
		return false;
	}

	@Override
	public Student next()
	{
		if(hasNext())
		{
			Student s = studentList.get(i);
			i++;
			return s;
		}
		throw new NoSuchElementException();
		
	}
	
	@Override
	public void remove()
	{
		throw new UnsupportedOperationException();
	}

}
