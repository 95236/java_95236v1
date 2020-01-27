// Napisz metodê klasyczn¹ (nie statyczn¹), o nazwie contains,
// która przyjmuje typ generyczny <T> która przyjmuje 2 argumenty:
//	- Dowoln¹ listê obiektów typu T
//	- Jeden element typu T

// Metoda zwraca true, jeœli element podany w drugim parametrze znajduje siê w tablicy
// (z dok³adnoœci¹ do metody equals).


package com.company;

public class Zadanie1<T> {
  
  // tutaj napisz niestatyczn� metod� contains
  public boolean contains(T[] array, T element) {
    for(T item : array){

      if(item.equals(element)){
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String[] array = {"element", "item"};
    String element1 = "element";
    String element2 = "element2";
    
    Zadanie1 main = new Zadanie1();
    System.out.println(main.contains(array, element1));
    System.out.println(main.contains(array, element2));
    
    
  }
}