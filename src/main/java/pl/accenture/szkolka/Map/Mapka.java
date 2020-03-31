package pl.accenture.szkolka.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Mapka {
    public static void main(String[] args) {
        List<String> imionaLudzi = List.of(
                new Person("Baba", "Jaga"),
                new Person("aaba", "Jaga"),
                new Person("caba", "Jaga"),
                new Person("daba", "Jaga"),
                new Person("eaba", "Jaga")
        ).stream()
                // ogólnie mapowania używamy do tego, żeby ze strumienia jednych obiektów zrobić inne obiekty :D
                .map(p -> p.getName())
                .collect(Collectors.toList());

        System.out.println(imionaLudzi);
        List<String> esy = Arrays.asList("Anna-Maria", "Krystyna-Czubowna", "Wojciech-Mann");

        List<String> collect = esy.stream().map(p -> p.split("-")[0]).collect(Collectors.toList());
        System.out.println(collect);

        // done 1 u twórz 3 listy intów



        List<Integer> piewsze = List.of(5,7,11);
        List<Integer> parzyste = List.of(8,10,12);
        List<Integer> nieparzyste = List.of(1,5,9);

        // done 2 utwórz listę list i wydrukuj do konsoli
        List<List<Integer>> listaDoSplaszczenia = List.of(piewsze,parzyste,nieparzyste);

        System.out.println(listaDoSplaszczenia);

        // done 3 'spłaszcz' listę używając flatMap, posortuj i wydrukuj do konsoli
        List<Integer> splaszczonaLista = listaDoSplaszczenia.
                stream().
                flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(splaszczonaLista);



    }
}

@Data
@AllArgsConstructor
class Person {
    private String name;
    private String lastName;
}

/*
flatMap takie coś
[
    [1,2,3,4],
    [5,6,7,8],
    [9,10,11,12]
] zamienia nam na takie coś

[1,2,3,4,5,6,7,8,9,10,11,12]
 */
