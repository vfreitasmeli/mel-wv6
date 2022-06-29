package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Exemplo05 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(51,21,13,74,35,6,71,18,9,10);

        Stream<Integer> stream = lista.stream();

        System.out.println("Lista Original: ");
        lista.forEach(n -> System.out.print(n + " "));
        System.out.println("\nStream: ");
        stream.forEach(n -> System.out.print(n + " "));

        List<Integer> listaAlterada =  lista.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("\nLista filtrada e alterada:");
        listaAlterada.forEach(n -> System.out.print(n + " "));

        long count =  lista.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("\nQtde pares: " + count);

        List<Integer> listaOrderada =  lista.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nLista ordenada:");
        listaOrderada.forEach(n -> System.out.print(n + " "));

//        exemplo de referência para método
//        lista.forEach(n -> System.out.print(n));
        System.out.println("\nReferencia para método:");
        lista.forEach(System.out::print);

    }
}
