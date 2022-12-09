package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Person.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John",Male), new Person("Mumtaz",Female),
                new Person("Fatima",Female)
        );

        List<Person> females = new ArrayList<>();

        for(Person person : people) {
            if (Female.equals(person.gender)) {
                females.add(person);
            }
        }
        for(Person female : females) {
            System.out.println(female);
        }

        System.out.println("//Declarative Approach");
        //Declarative Approach
        people.stream().filter(person -> Female.equals(person.gender))
                .forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
        enum Gender {
            Male, Female
        }
    }


}
