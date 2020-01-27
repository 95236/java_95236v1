/*
 * public class Quadruple {

  public static void main(String[] args) {

	  // Korzystajšc z klas: Pair oraz Triple (możesz je tu wkleić) - stwórz klasę Quadruple,
	  //która jest uniwersalnym kontenerem dla 4 typów generycznych. 
	  // W main pokaż użycie. 
  }
} 
 */

package com.company.Zadanie2;

import java.util.Scanner;

public class Quadruple<X, Y, Z, Q> {
  private X x;
  private Y y;
  private Z z;
  private Q q;

  public Quadruple(X x, Y y, Z z, Q q){
    this.x = x;
    this.y = y;
    this.z = z;
    this.q = q;
  }

  public X getX() {
    return x;
  }

  public void setX(X x) {
    this.x = x;
  }

  public Y getY() {
    return y;
  }

  public void setY(Y y) {
    this.y = y;
  }

  public Z getZ() {
    return z;
  }

  public void setC(Z z) {
    this.z = z;
  }

  public Q getQ() {
    return q;
  }

  public void setQ(Q q) {
    this.q = q;
  }

  public static void main(String[] args) {

    Quadruple<String,String,String,String> quadruple = new Quadruple
            <String, String, String,String>
            ("Michal", "Materla", "Jan", "Blachowicz");
    Scanner scanner = new Scanner(System.in);

    System.out.println(quadruple.getX());
    quadruple.setQ("Pawlik");
    System.out.println(quadruple.getQ());

  }
}