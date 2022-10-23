package Task1;

import java.util.*;

public class Array {

    public static void main(String[] args) {

        String[] animals = {"Cat", "Dog", "Horse", "Elephant", "Dog", "Hamster", "Lion", "Cat", "Rabbit", "Sheep", "Cow"};

        //Задание №1

        Set<String> unique = new HashSet<String>(Arrays.asList(animals));

        System.out.println("Unique words: ");
        System.out.println(unique.toString());

        //Задание №2

        Map<String, Integer> map = new HashMap<>();

        for (String animal : animals) {
            if (map.containsKey(animal))
                map.put(animal, map.get(animal) + 1);
            else
                map.put(animal, 1);
        }
        System.out.println();
        System.out.println("How many times: ");
        System.out.println(map);
    }
}


