/*
* Michael Barry
*/


public class PolynomialDriver {

  public static void main(String[] args) {

    Polynomial zero = new Polynomial(0, 0);
    Polynomial p1 = new Polynomial(4, 6);
    Polynomial p2 = new Polynomial(3, 5);

    System.out.println("zero(x) = " + zero);
    System.out.println("p1(x) = " + p1);
    System.out.println("p2(x) = " + p2);

    System.out.println("p1(x) + p2(x) = " + p1.addPolynomial(p2));
    System.out.println("zero(x) - p1(x) = "+zero.subtractPolynomial(p1));

    System.out.println("p1(2) = "+p1.evaluate(2));

    System.out.println("p1'(x) = "+p1.derivative());

    System.out.println("p1 and derivative of p1 are equal is a "+p1.equals(p1.derivative())+" statement");
  }

}
