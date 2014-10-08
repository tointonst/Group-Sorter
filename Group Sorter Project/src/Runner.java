import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;

public class Runner
	{
	static ArrayList<Student> listOfStudents = new ArrayList<Student>();
	static int numberOfGroups;

	public static void main(String[] args) throws IOException
		{

		Scanner file = new Scanner(new File("classroster.txt"));
		int numberOfLinesOfData = file.nextInt();
		file.nextLine();
		for (int i = 0; i < numberOfLinesOfData; i++)
			{
			String firstName = file.next();
			String lastName = file.next();
			double score = file.nextDouble();
			listOfStudents.add(new Student(firstName, lastName, score, 0));
			}

		Collections.sort(listOfStudents, new ScoreSorter());

		System.out.println("How many groups would you like to have?");
		Scanner userInput1 = new Scanner(System.in);
		numberOfGroups = userInput1.nextInt();

		int counter = 1;
		for (int i = 0; i < listOfStudents.size(); i++)
			{
			listOfStudents.get(i).setGroup(counter);
			if(counter<numberOfGroups)
				{
				counter++;
				}
			else
				{
				counter=1;
				}
			}
		
		Collections.sort(listOfStudents, new NameSorter());
		Collections.sort(listOfStudents, new GroupSorter());
		
	

		for (Student i : listOfStudents)
			{
			System.out.println("Group " + numberOfGroups + listOfStudents);
			}
		
		
		}

	}
