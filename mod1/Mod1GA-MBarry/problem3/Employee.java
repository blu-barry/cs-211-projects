/**
* @author Michael Barry
*/

class Employee extends Person {

  // Private Variables

  private int empID;

  // Constructors

  Employee() {
    super();
  }

  Employee(String name, int empID) {
    super(name);
    this.empID = empID;
  }

  // Accessors

  public int getEmployeeID() {
    return this.empID;
  }

  // Mutators
  public void setEmployeeID(int empID) {
    this.empID = empID;
  }

  // Methods
  public String toString() {
    return "Name: " + this.getName() + "\n" + "Employee ID: " + this.getEmployeeID();
  }

}
