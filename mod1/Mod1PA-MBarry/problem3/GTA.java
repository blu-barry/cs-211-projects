/**
* @author Michael Barry
*/

class GTA extends Graduate {

  // Private Variables

  private double hourlySalary;

  // Constructors

  GTA() {
    super();
  }

  GTA(String name, int studentNumber, String department, double hourlySalary) {
    super(name, studentNumber, department);
    this.hourlySalary = hourlySalary;
  }

  // Accessors

  public double getHourlySalary() {
    return this.hourlySalary;
  }

  // Mutators

  public void setHourlySalary(double hourlySalary) {
    this.hourlySalary = hourlySalary;
  }

  // Methods
  public String toString() {
    return "Name: " + this.getName() + "\n" + "Student Number: " + this.getStudentNumber() + "\n" + "Department: " + this.getDepartment();
  }

  // public double calculateMonthlyGrossPay() {
  //
  // }

  public double calculateMonthlyGrossPay(double weeklyHours) {
    return (weeklyHours * hourlySalary);
  }

  public void displayPayInfo() {
    System.out.println("Department: " + this.getDepartment() + "\n" + "Hourly Salary: " + this.getHourlySalary());
  }

  public void displayPayInfoWithHours(double hours) {
    System.out.println("Department: " + this.getDepartment() + "\n" + "Hourly Salary: " + this.getHourlySalary()  + "\n" + "Monthly salary with " + hours + " hours per week: " + this.calculateMonthlyGrossPay(hours));
  }
}
