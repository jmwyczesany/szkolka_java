package pl.accenture.szkolka.lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static pl.accenture.szkolka.lambda.Person.imieKonczySieNaAPredicate;
import static pl.accenture.szkolka.lambda.Person.imieZaczynaSieNaBPredicate;

class PredykatZad {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Bogdan"),
                new Person("Ala"),
                new Person("Barbara"),
                new Person("Zbyszek"),
                new Person("Beata"));

        List<Person> collect = people.stream()
                // statyczny import :D:D:D:D:D
                .filter(imieZaczynaSieNaBPredicate.and(imieKonczySieNaAPredicate))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    // TODO: 31.03.2020 1 - klasa person: name, lastName, age
    // TODO: 31.03.2020 2 - predykaty w klasie imieNaA, nazwizkoNaB, wiekPowyzej20Lat
    // TODO: 31.03.2020 3 - kolekcja List<Person>
/*    TODO: 31.03.2020 4 - stream API
        - odfiltruj używając trzech predykatów
        - wypisz do konsoli odfiltrowane elementy
 */

}

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
 // większa logika -> dobrze definiować predicate a nie w lambdzie
    static Predicate<Person> imieZaczynaSieNaBPredicate = person -> person.name.startsWith("B");
    static Predicate<Person> imieKonczySieNaAPredicate = person -> person.name.endsWith("a");


}
 // predykaty są często przypisane do danego obiektu
/*
Jak zrobić predykat?
1. najpierw strzała
2.boolean test(T t) <- pierwszy person to nasz argument, typu takiego jak w predykacie
 */

