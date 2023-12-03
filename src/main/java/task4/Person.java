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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public static void sortByHeightAscending(Set<Person> people) {
        System.out.println("Sortowanie od najniższej do najwyższej:");
        people.stream().sorted(Comparator.comparingInt(Person::getHeight)).forEach(System.out::println);
    }

    public static void sortByWeightDescending(Set<Person> people) {
        System.out.println("\nSortowanie od najcięższej do najlżejszej:");
        people.stream().sorted(Comparator.comparingInt(Person::getWeight).reversed()).forEach(System.out::println);
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(otherPerson.birthYear, this.birthYear);
    }

    public static void sortByAgeDefault(Set<Person> people) {
        List<Person> sortedList = new ArrayList<>(people);
        sortedList.sort(Comparator.comparingInt(Person::getBirthYear));
        Collections.reverse(sortedList);

        System.out.println("\nSortowanie od najmłodszej do najstarszej (domyślne):");
        sortedList.forEach(System.out::println);
    }


    @Override
    public String toString() {
        return firstName + " " + lastName + " (Birth Year: " + birthYear + ", Height: " + height + " cm, Weight: " + weight + " kg)";
    }
}