/**
* @author Michael Barry
*/


class Faculty extends Employee {

  // Private Variables

  private String rank;

  // Constructors

  Faculty() {
    super();
  }

  Faculty(String name, int empI, String rank) {
    super(name, empI);
    this.rank = rank;
  }

  // Accessors

  public String getRank() {
    return this.rank;
  }

  // Mutators
  public void setRank(String rank) {
    this.rank = rank;
  }

  // Methods
  public String toString() {
    return "Name: " + this.getName() + "\n" + "Employee ID: " + this.getEmployeeID() + "\n" + "Rank: " + this.getRank();
  }

}
