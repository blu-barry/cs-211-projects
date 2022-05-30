/**
* @author EMILIA BUTU
* version 1.0
* since   2020-07
*
* Student name:  Michael Barry
* Completion date: 10 May 2022
*
* Staff.java
*
* Driver for the inheritance application testing the inheritance, and
* showing how polymorphism and dynamic binding works.
*
* Students have to run the program after building all classes
*
*/



public class Staff
{
	public static void main(String[] args)
	{
		// Person[] group = new Person[3];
		GTA p1 = new GTA("Mary Jane", 234, "Math", 15.0);
		FullTimeFaculty p2 = new FullTimeFaculty("Jane Dane", 2343, "Lecturer", 100000.00);
		AdjunctFaculty p3 = new AdjunctFaculty("Edward Stone", 121, "Lecturer", 5000);


		System.out.println(p1.toString());
		p1.displayPayInfoWithHours(80.0);

		System.out.println(p2.toString());
		p2.displayPayInfo();

		System.out.println(p3.toString());
		p3.displayPayInfo(12);
		// for(Person p: group)
		// {
		// 	System.out.println(p);
		// 	System.out.println();
		// }

	}

}
