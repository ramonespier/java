package java_collections;

import java.util.*;

public class Generics {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("\n");

        // Map => objeto js { chave: valor }
        // List => Lista ordenada que permite duplicatas [ 1, 1, 1, 2, 2 ]
        // Set => Lista ordenada que NÃO permite duplicatas [ 1, 2, 3, 4, 5 ]
        // Queue => Filas, normalmente usadas em processamento em ordens.

        // São apenas interfaces!

        // Exemplos

        List<String> list = new ArrayList<>();
        list.add("Cereja");
        list.add("Cereja");
        list.add("Banana");

        System.out.println(list);
        System.out.println("\n");

        Set<String> setStrings = new HashSet<>(); // hash table
        setStrings.add("Cereja");
        setStrings.add("Cereja");
        setStrings.add("Banana");

        System.out.println("Set: " + setStrings.contains("Cereja"));
        System.out.println(setStrings);
        System.out.println("\n");

        Map<String, String> map = new HashMap<>();
        map.put("name", "ramon");
        map.put("gender", "male");

        System.out.println(map.get("name"));
        System.out.println(map.get("\n"));

        Queue<String> queue = new LinkedList<>(); // linked list
        queue.add("Ramon");
        queue.add("Coelho");

        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.poll()); // pegar o primeiro item da fila e remover
        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue);

        System.out.println("\n");
        queue.add("Ramon");
        queue.add("Coelho");

        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.peek()); // pegar o primeiro item da fila sem remover / "espiar"
        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.remove()); // faz o mesmo que o poll(). PORÉM, lança uma exceção se a fila estiver vazia
        System.out.println("Queue: " + queue.remove());
        System.out.println("Queue: " + queue);

        System.out.println("\n");

        // posso usar o LinkedList como uma lista encadeada pura
        // LinkedList<String> linked = new LinkedList<>();
        // dessa forma, terei mais metodos, ja que LinkedList está extendendo uma Queue

        // STREAM API
        // realizar opreações funmcionais nas nossas collections (estruturas de dados)
        // filter, map, reduce, agregações

        List<String> nomes = new ArrayList<>();
        nomes.add("Ramon Coelho");
        nomes.add("Ramon Melo");
        nomes.add("Rachel Viana");
        nomes.add("Rachel Moraes");

        List<String> ramons = nomes
                .stream()
                .filter(nome -> nome.startsWith("Ramon"))
                .toList();

        System.out.println("Ramons: " + ramons);

        List<String> rachelsMap = nomes
                .stream()
                .filter(nome -> nome.startsWith("Rachel"))
                .map(String::toUpperCase)
                .toList();

        System.out.println("Rachels: " + rachelsMap);

        String rachelsReduce = nomes
                .stream()
                .filter(nome -> nome.startsWith("Rachel"))
                .map(String::toUpperCase)
                // .map(nome -> nome.replace(" ", "")) // brincar com .map
                .reduce("Rachel", (x, y) -> x + ", " + y);

        System.out.println("Rachels: " + rachelsReduce);

    }
}
