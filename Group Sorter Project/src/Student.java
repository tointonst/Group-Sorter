
public class Student
	{
	private String firstName;
	private String lastName;
	private double score;
	private int group;
	
	public Student(String fn, String ln, double s, int g)
		{
		firstName = fn;
		lastName = ln;
		score = s;
		group = g;
		}
	
	public String getFirstName()
		{
		return firstName;
		}
	public String getLastName()
		{
		return lastName;
		}
	public double getScore()
		{
		return score;
		}
	public int getGroup()
		{
		return group;
		}

	public void setFirstName(String firstName)
		{
		this.firstName = firstName;
		}

	public void setLastName(String lastName)
		{
		this.lastName = lastName;
		}

	public void setScore(double score)
		{
		this.score = score;
		}

	public void setGroup(int group)
		{
		this.group = group;
		}

	@Override
	public String toString()
		{
		return firstName + " " + lastName
				;
		}
	
	
	}
