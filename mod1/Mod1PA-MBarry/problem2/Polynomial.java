/*
* Michael Barry
*/

import java.io.*;
import java.util.*;

public class Polynomial {


  // Instance variable for degree and coefficients
  private int degree;
  private int[] coefficient;

  public Polynomial(int a, int b) {
    if (b < 0) {
      throw new IllegalArgumentException("exponent cannot be negative: " + b);
    }

    coefficient = new int[b + 1];
    coefficient[b] = a;
    adjustPolynomial();
  }


  // adjust polynomial
  private void adjustPolynomial() {
    degree = -1;
      for (int i = coefficient.length - 1; i >= 0; i--) {
        if (coefficient[i] != 0) {
          degree = i;
          return;
      }
    }
  }


  // return degree
  public int degree() {
    return degree;
  }


  // evaluate polynomial
  public int evaluate(int x) {
    int poly = 0;
    for (int i = degree; i >= 0; i--)
      poly = coefficient[i] + (x * poly);
      return poly;
  }

  // add two polynomial
  public Polynomial addPolynomial(Polynomial other) {
    Polynomial poly = new Polynomial(0, Math.max(this.degree, other.degree));
      for (int i = 0; i <= this.degree; i++)
        poly.coefficient[i] += this.coefficient[i];
        for (int i = 0; i <= other.degree; i++)
          poly.coefficient[i] += other.coefficient[i];
          poly.adjustPolynomial();
    return poly;
  }

  //subtract two polunomial
  public Polynomial subtractPolynomial(Polynomial other) {
    Polynomial poly = new Polynomial(0, Math.max(this.degree, other.degree));
    for (int i = 0; i <= this.degree; i++)
      poly.coefficient[i] += this.coefficient[i];
      for (int i = 0; i <= other.degree; i++)
        poly.coefficient[i] -= other.coefficient[i];
        poly.adjustPolynomial();
    return poly;
  }

  // equals method
  @Override
  public boolean equals(Object other) {
    if (other == this)
      return true;
    if (other == null)
      return false;
    if (other.getClass() != this.getClass())
      return false;

    Polynomial that = (Polynomial) other;
    if (this.degree != that.degree)
      return false;

    for (int i = this.degree; i >= 0; i--)
      if (this.coefficient[i] != that.coefficient[i])
      return false;
    return true;
  }

  // derivative of polynomial
  public Polynomial derivative() {
    if (degree == 0)
      return new Polynomial(0, 0);

    Polynomial poly = new Polynomial(0, degree - 1);
    poly.degree = degree - 1;

    for (int i = 0; i < degree; i++)
      poly.coefficient[i] = (i + 1) * coefficient[i + 1];
    return poly;
  }

  // print the polynomial
  @Override
  public String toString() {
    if (degree == -1)
      return "0";
    else if (degree == 0)
      return "" + coefficient[0];
    else if (degree == 1)
      return coefficient[1] + "x + " + coefficient[0];

    String s = coefficient[degree] + "x^" + degree;
    for (int i = degree - 1; i >= 0; i--) {
      if (coefficient[i] == 0)
        continue;
      else if (coefficient[i] > 0)
        s = s + " + " + (coefficient[i]);
      else if (coefficient[i] < 0)
        s = s + " - " + (-coefficient[i]);
      if (i == 1)
        s = s + "x";
      else if (i > 1)
        s = s + "x^" + i;
    }
    return s;
  }

}
