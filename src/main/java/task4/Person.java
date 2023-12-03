package task4;

import java.util.*;

class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int height;
    private int weight;

    public Person(String firstName, String lastName, int birthYear, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.birthYear, otherPerson.birthYear);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (Birth Year: " + birthYear + ", Height: " + height + " cm, Weight: " + weight + " kg)";
    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Set<Person> people = createPersonSet();
//
//        sortByHeight(people);
//        sortByWeight(people);
//        sortByAgeDefault(people);
//    }

    private static Set<Person> createPersonSet() {
        Person person1 = new Person("Anna", "Kowalska", 1990, 165, 60);
        Person person2 = new Person("John", "Nowak", 1985, 180, 75);
        Person person3 = new Person("Caroline", "Duda", 1995, 170, 70);

        Set<Person> people = new TreeSet<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        return people;
    }

    private static void sortByHeight(Set<Person> people) {
        System.out.println("Sorting by height (shortest to tallest):");
        people.stream().sorted(Comparator.comparingInt(Person::getHeight)).forEach(System.out::println);
    }

    private static void sortByWeight(Set<Person> people) {
        System.out.println("\nSorting by weight (heaviest to lightest):");
        people.stream().sorted(Comparator.comparingInt(Person::getWeight).reversed()).forEach(System.out::println);
    }

    private static void sortByAgeDefault(Set<Person> people) {
        System.out.println("\nSorting by age (youngest to oldest - default):");
        people.forEach(System.out::println);
    }
}