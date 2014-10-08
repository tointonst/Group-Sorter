import java.util.Comparator;

public class NameSorter implements Comparator <Student>
	{
	public int compare(Student s1, Student s2)
		{
		return s2.getLastName().compareTo(s1.getLastName());
		}
	}
