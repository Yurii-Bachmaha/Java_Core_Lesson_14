package task01;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		Set<Person> setPerson = new HashSet<Person>();
		setPerson.add(new Person("John", 20));
		setPerson.add(new Person("Lisa", 25));
		setPerson.add(new Person("Abriella", 30));
		setPerson.add(new Person("Barlow", 35));
		setPerson.add(new Person("Emma", 40));
		setPerson.add(new Person("Mia", 45));
		setPerson.add(new Person("Chloe", 50));
		setPerson.add(new Person("Zoe", 55));

		System.out.println("HashSet unsorted list:");
		for (Person person : setPerson) {
			System.out.println(person);
		}

		Set<Person> setPerson2 = new TreeSet<Person>(new PersonNameComparator());
		setPerson2.add(new Person("John", 20));
		setPerson2.add(new Person("Lisa", 25));
		setPerson2.add(new Person("Abriella", 30));
		setPerson2.add(new Person("Barlow", 35));
		setPerson2.add(new Person("Emma", 40));
		setPerson2.add(new Person("Mia", 45));
		setPerson2.add(new Person("Chloe", 50));
		setPerson2.add(new Person("Zoe", 55));

		System.out.println();
		System.out.println("TreeSet list sorted by name:");
		for (Person person : setPerson2) {
			System.out.println(person);
		}

		Set<Person> setPerson3 = new TreeSet<Person>();
		setPerson3.add(new Person("John", 15));
		setPerson3.add(new Person("Lisa", 42));
		setPerson3.add(new Person("Abriella", 12));
		setPerson3.add(new Person("Barlow", 67));
		setPerson3.add(new Person("Emma", 70));
		setPerson3.add(new Person("Mia", 8));
		setPerson3.add(new Person("Chloe", 54));
		setPerson3.add(new Person("Zoe", 3));

		System.out.println();
		System.out.println("TreeSet list sorted by age:");
		for (Person person : setPerson3) {
			System.out.println(person);
		}
	}
}