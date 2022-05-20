/**
* @author Michael Barry
*/

class Student extends Person {

  // Private Variables
  private int studentNumber;

  // Constructors
  Student() {
    super();
  }

  Student(String name, int studentNumber) {
    super(name);
    this.studentNumber = studentNumber;
  }

  // Accessors
  public int getStudentNumber() {
    return this.studentNumber;
  }

  // Mutators
  public void setStudentNumber(int studentNumber) {
    this.studentNumber = studentNumber;
  }

  // Methods
  public String toString() {
    return "Name: " + this.getName() + "\n" + "Student Number: " + this.getStudentNumber();
  }
}
