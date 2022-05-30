/**
* @author Michael Barry
*/


class FullTimeFaculty extends Faculty {

  // Private Variables

  private double salary;

  // Constructors

  FullTimeFaculty() {
    super();
  }

  FullTimeFaculty(String name, int empI, String rank, double salary) {
    super(name, empI, rank);
    this.salary = salary;
  }

  // Accessors

  public double getSalary() {
    return this.salary;
  }

  // Mutators
  public void setSalary(double salary) {
    this.salary = salary;
  }

  // Methods
  public String toString() {
    return "Name: " + this.getName() + "\n" + "Employee ID: " + this.getEmployeeID() + "\n" + "Rank: " + this.getRank() + "\n" + "Salary: " + this.getSalary();
  }

  public double calculateGrossPay(int weeks) {
    return weeks*salary;
  }

  public void displayPayInfo() {
    System.out.println("Rank: " + this.getRank() + "\n" + "Salary: " + this.getSalary());
  }

}
