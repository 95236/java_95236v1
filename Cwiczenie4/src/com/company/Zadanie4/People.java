// Stwórz klasę People (imię, nazwisko, wiek).
// Utwórz List<People> i wrzuć tam kilka elementów.
//	1) Spraw aby drukujšc wszystkie elementy: linijka System.out.println(person); drukowała dane o osobie w przystepnej formie.
//	2) Pokaż przykład sortowania malejšco wg. wieku za pomocš interfejsu Comparable
//	3) Pokaż przykład sortowania malejšco wg. nazwiska osoby przy użyciu komparatora
//Dla klasy People zobacz jak działa HashSet.
//	1) Dodaj kilka osób do zbioru
//	2) Stwórz dwa obiekty  tak samo się nazywające i mające tyle samo lat (takie same osoby).
//		Spróbuj dodać te elementy do zbioru. Udało się?
//	3) Zaimplementuj poprawnie hashCode() oraz equals(...)
//		i sprawdź teraz czy się powyższa procedura powiodła
//	4) Utwórz TreeSet dla People i niech będzie domyślnie
//		sortowany po Comparable (wiek rosnąco)
//	5) Utwórz kolejny TreeSet ale posortowany po wieku malejąco.


package com.company.Zadanie4;

public class People {

    public String name;
    public String surname;
    public int age;

    public People(String imie , String nazwisko, int wiek){
        this.name = nazwisko;
        this.surname = imie;
        this.age = wiek;
    }

    public String PrintInfo() {
        return "Imie: " + name +  ", Nazwisko: " + surname + ", Wiek: " + age;
    }
}
