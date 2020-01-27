package com.company.Zadanie4;

import com.company.Zadanie4.People;

import java.util.*;

public class People1 {

	public static void main(String[] args) {

		People person1 = new People("Michal", "Andryszak", 42);
		People person2 = new People("Kamil", "Stoch", 2);
		People person3 = new People("Jakub", "Wolny", 56);

		List<People> peopleList = new ArrayList<>();
		peopleList.add(person1);
		peopleList.add(person2);
		peopleList.add(person3);

		System.out.println("Bez sortowania: ");
		for (People person: peopleList) {
			System.out.println(person.PrintInfo());
		}

		System.out.println("Sortwoanie po wieku:");
		peopleList.sort(Comparator.comparingInt(a -> a.age));
		Collections.reverse(peopleList);
		for (People person: peopleList) {
			System.out.println(person.PrintInfo());
		}

		System.out.println("Sortowanie po nazwisku:");
		peopleList.sort(Comparator.comparing(a -> a.surname));
		Collections.reverse(peopleList);
		for (People person: peopleList) {
			System.out.println(person.PrintInfo());
		}
	}
}
