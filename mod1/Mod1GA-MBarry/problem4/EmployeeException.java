/**
* @author EMILIA BUTU
* version 1.0
* since   2020-07
*
* Student name:  Michael Barry
* Completion date: 22 May 2022
*
* EmployeeException.txt - save as EmployeeException.java
*
* This class represents the blueprint for instantiating EmployeeException objects,
* with the following attributes:

	name: String
	sSN: String
	salary: double
* and methods:
  	A constructor with no arguments that sets the attributes at default values
	A constructor that passes values for all attributes
	Accessor, mutator and display methods for each attribute
	An equals method that has an object of type Employee as argument, and returns true if two employees have the same name, salary and sSN

*
* Students have to build the file from scratch
*/

import java.lang.Exception;


public class EmployeeException
{

	//*** Task #1: define the instance variables
  private String name;
  private String sSN;
  private double salary;

	//*** Task #2: define constructor with no arguments
  EmployeeException() {}
	//*** Task #3: define constructor passing values for all arguments
  EmployeeException(String name, String sSN, double salary) {
    // this.name = setName(name);
    // this.sSN = setSSN(sSN);
    // this.salary = setSalary(salary);
    this.name = name;
    this.sSN = sSN;
    this.salary = salary;
  }
	//*** Tasks #4: define accessor, mutator, and write out methods for name attribute
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void writeOutName() {
    System.out.println("Name: " + this.getName());
  }

	//*** Tasks #5: define accessor, mutator, and write out methods for sSN attribute
	//    Display the SSN as ddd-dd-dddd

  public String getSSN() {
    return this.sSN;
  }

  public void setSSN(String sSN) {
    this.sSN = sSN;
    // try {
    //   if(sSN.length() != 9) {
    //     throw new SSNStructureException(1, "SSN Length is not 9.");
    //   } else {
    //
    //   }
    //   this.sSN = sSN;
    // } catch(SSNStructureException e1) {
    //
    // } catch(SSNStructureException e2) {
    //
    // }

  }

  public void writeOutSSN() {
    System.out.println("SSN: " + this.getSSN().substring(0, 4)+"-"+this.getSSN().substring(4, 6)+"-"+this.getSSN().substring(6));
  }

	//*** Tasks #6: define accessor, mutator, and write out methods for salary attribute

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void writeOutSalary() {
    System.out.println("Salary: " + this.getSalary());
  }

	//*** Tasks #7: Define method writeOutput() that display all information about the employee.
  public void writeOutput() {
    this.writeOutName();
    this.writeOutSSN();
    this.writeOutSalary();
  }

	//*** Tasks #8: Define equals method, having argument of type EmployeeException
  public Boolean equals(EmployeeException employeeException) {
    Boolean result = true;

    if(this.getName() != employeeException.getName()) {
      result = false;
      return result;
    }

    if(this.getSSN() != employeeException.getSSN()) {
      result = false;
      return result;
    }

    if(this.getSalary() != employeeException.getSalary()) {
      result = false;
      return result;
    }

    return result;
  }

}
