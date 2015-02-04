import java.util.ArrayList;
import java.util.Iterator;


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
		Student s = studentList.get(i);
		i++;
		return s;
	}

}
