/**
* @author EMILIA BUTU
* version 1.0
* since   2020-07
*
* Student name:  Michael Barry
* Completion date: 22 May 2022
*
* EmployeeExceptionDriver.java
*
* This class represents the driver for the EmployeeException class.
* The driver program uses an array that can hold up to 100 employees (
* the array will be of EmployeeException type).
* The user should be free to enter as many employees as needed.
* The driver class should use two exception classes to signal the user that the SSN entered is not correct. * SSN needs to be entered as a  9-digit string without separators.
*
*
*/
import java.util.Scanner;
public class EmployeeExceptionDriver
{
	public static void main(String [] args)
	{
		//*** Task #1: define the variables required for the program
		EmployeeException[] e = new EmployeeException[100];
		String empName;
		String empSSN;
		double empSalary;
        double salarySum = 0;
        double averageSalary;
        String ignore;

		//*** Task #2: define and instantiate variable of type Scanner to be able to read from keyboard
		Scanner keyboard = new Scanner(System.in);

        char repeat;
        int i = 0;  // Employee subscript: add 1 for employee number

		//*** Task #3: create a loop in which you enter the data for employee.

		do // Repeat if user says 'yes'
        {
 			// Important note:
 			// Make a new Scanner object each time through the loop
            // to avoid problems with mixing nextLine calls with
            // other Scanner methods.
            keyboard = new Scanner(System.in);

            System.out.println();

		//*** Task #4: inside the loop, instantiate each element of the array with the constructor
		// that has no arguments
			e[i] = new EmployeeException();

		//*** Task #5: read the name of the employee
            System.out.print("Enter employee #" + (i + 1) + "'s name: ");
            empName = keyboard.nextLine();
            e[i].setName(empName);
            System.out.println();

		//*** Task #6: read the salary of the employee

            System.out.print("Enter employee #" + (i +1) + "'s salary: ");
            empSalary = keyboard.nextDouble();
            e[i].setSalary(empSalary);
            System.out.println();

		//*** Task #7: read SSN using the exceptions blocks
		// check that the employee's ssn has 9 characters without separators
		// check that the structure of the employee's ssn is correct
            try
            {
                System.out.print(
                    "Enter employee #" + (i + 1) + "'s SSN (9 digits): ");
                // Get rid of end of line left from nextDouble() call.
                ignore = keyboard.nextLine();
                empSSN = keyboard.nextLine();
                if(empSSN.length() != 9)
                {
                    throw new SSNLengthException(
                                               empSSN, empSSN.length());
                }
                else
                {
                    for(int j = 0; j < 9; ++j)
                    {
                        if(empSSN.charAt(j) > '9'
                                             || empSSN.charAt(j) < '0')
                        {
                            throw new SSNCharacterException(
                                             empSSN, empSSN.charAt(j));
                        }
                    }
                }
                e[i].setSSN(empSSN);
                ++i; // Next employee
            }

            catch(SSNLengthException e1)
            {
                System.out.println(e1.getMessage());
                System.out.println(
                          "Re-enter data for employee #" + (i + 1));
            }

            catch(SSNCharacterException e2)
            {
                System.out.println(e2.getMessage());
                System.out.println(
                           "Re-enter data for employee #" + (i + 1));
            }

		//*** Task #8: ask the user if there are more employees to enter

            System.out.println(
                 "Continue entering employees? (Y for Yes, or N for No)");
            repeat = keyboard.next().charAt(0);

        }while((repeat == 'y') || (repeat == 'Y'));

		//*** Task #9: calculate the average salary

        for(int j = 0; j < i; ++j)
            salarySum = salarySum + e[j].getSalary();

        averageSalary = salarySum / i;

		//*** Task #10: display the information about all employees with a note if their salary
		// is above average, under average or average.

        System.out.println();
        for(int j = 0; j < i; ++j)
        {
            System.out.println("Employee #" + (j + 1));
            e[j].writeOutput();
            if(e[j].getSalary() > averageSalary)
                System.out.println("  Above average");
            else if(e[j].getSalary() < averageSalary)
                System.out.println("  Below average");
            else
                System.out.println("  Average");
        }
        System.out.println("No more employees.");
	}
}
