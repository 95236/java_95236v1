// Przeczytaj artykuł https://kobietydokodu.pl/niezbednik-juniora-kolekcje-w-jezyku-java/,
// a nstępnie wykonaj zadanie.

// Stwórz mapę typu: Map<Integer, Person> gdzie Key=numer PESEL, Value=Person.
// Pokaż jak łatwo z wykorzystaniem Mapy można znajdować osoby po numerach PESEL.
// Zaprezentuj w main korzystnie z tego mechanizmu.

package com.company.Zadanie3;

import java.util.Map;
import java.util.HashMap;

public class Maps {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.pesel = 951223;
		person.imie = "Jakub";

		Map<Integer, Person> personMap =new HashMap<Integer,Person>();

		personMap.put(person.pesel, person);

		Person myPerson = personMap.get(951223);
		System.out.println("Imie: " + myPerson.imie + ", Pesel: " + myPerson.pesel);
	}

}
