/**
* @author Michael Barry
*/

class Undergraduate extends Student {

  // Private Variables

  private String major;

  // Constructors

  Undergraduate() {
    super();
  }

  Undergraduate(String name, int studentNumber, String major) {
    super(name, studentNumber);
    this.major = major;
  }

  // Accessors

  public String getMajor() {
    return this.major;
  }

  // Mutators
  public void setMajor(String major) {
    this.major = major;
  }

  // Methods
  public String toString() {
    return "Name: " + this.getName() + "\n" + "Student Number: " + this.getStudentNumber() + "\n" + "Major: " + this.getMajor();
  }
}
