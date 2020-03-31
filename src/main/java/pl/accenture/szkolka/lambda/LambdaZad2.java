package pl.accenture.szkolka.lambda;

import java.util.Arrays;
import java.util.List;

class LambdaZad2 {
    public static void main(String[] args) {
        List<String> aList = Arrays.asList("a21", "a2", "a13", "a4", "b10", "b2", "c13", "c4");

        //odfiltruj b

        //przekonwertuj do wielkiej litery

        //posortuj
        // każda metoda, którą wywołamy zwraca nam obiekt, na którym wywołujemy kolejną metodę
        aList
                .stream()
                .filter(s -> s.startsWith("b"))
                .map(s -> s.toUpperCase())
                .sorted()
                // void -> po prawej stronie strzałki metoda, która nic nie zwraca
                .forEach(s -> System.out.println(s));
    }

}
