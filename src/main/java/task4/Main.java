package task4;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Anna", "Kowalska", 1990, 165, 60);
        Person person2 = new Person("John", "Nowak", 1985, 180, 75);
        Person person3 = new Person("Caroline", "Duda", 1995, 170, 70);

        Set<Person> people = new TreeSet<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        Person.sortByHeightAscending(people);
        Person.sortByWeightDescending(people);
        Person.sortByAgeDefault(people);
    }
}