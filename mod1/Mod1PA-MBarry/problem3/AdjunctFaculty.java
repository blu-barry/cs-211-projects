/**
* @author Michael Barry
*/


class AdjunctFaculty extends Faculty {

  // Private Variables

  private double perCreditRate;

  // Constructors

  AdjunctFaculty() {
    super();
  }

  AdjunctFaculty(String name, int empI, String rank, double perCreditRate) {
    super(name, empI, rank);
    this.perCreditRate = perCreditRate;
  }

  // Accessors

  public double getPerCreditRate() {
    return this.perCreditRate;
  }

  // Mutators
  public void setPerCreditRate(double perCreditRate) {
    this.perCreditRate = perCreditRate;
  }

  // Methods
  public String toString() {
    return "Name: " + this.getName() + "\n" + "Employee ID: " + this.getEmployeeID() + "\n" + "Rank: " + this.getRank() + "\n" + "Per Credit Rate: " + this.getPerCreditRate();
  }

  public double calculateGrossPay(int credits) {
    return credits* (this.perCreditRate/2);
  }

  public void displayPayInfo(int credits) {
    System.out.println("Rank: " + this.getRank() + "\n" + "Semester salary with " + credits + "credits: " + this.calculateGrossPay(credits));
  }

}
