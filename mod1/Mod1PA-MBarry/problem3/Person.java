/**
* @author Michael Barry
*/


class Person implements Payroll {

  // Private Variables
  private String name;

  // Constructors
  Person() {}

  Person(String name) {
    this.name = name;
  }

  // Accessors
  public String getName() {
    return this.name;
  }

  // Mutators
  public void setName(String name) {
    this.name = name;
  }

  // Methods
  public String toString() {
    return this.name;
  }


  // Implementing Payroll interface
  public double calculateMonthlyGrossPay() {
    return 0.0;
  }

  public void displayPayInfo() {}

}
