/**
* @author Michael Barry
*/

class Graduate extends Student {

  // Private Variables

  private String department;

  // Constructors

  Graduate() {
    super();
  }

  Graduate(String name, int studentNumber, String department) {
    super(name, studentNumber);
    this.department = department;
  }

  // Accessors

  public String getDepartment() {
    return this.department;
  }

  // Mutators
  public void setDepartment(String department) {
    this.department = department;
  }

  // Methods
  public String toString() {
    return "Name: " + this.getName() + "\n" + "Student Number: " + this.getStudentNumber() + "\n" + "Department: " + this.getDepartment();
  }
}
