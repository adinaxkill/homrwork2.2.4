package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> homePets = new ArrayList<>();
        homePets.add("Dog");
        homePets.add("Cat");
        homePets.add("Cow");
        homePets.add("Sheep");
        homePets.add("Chicken");
        System.out.println(homePets);


        ArrayList<String> wildAnimals = new ArrayList<>();
        wildAnimals.add("Leon");
        wildAnimals.add("Bear");
        wildAnimals.add("Tiger");
        wildAnimals.add("Monkey");
        wildAnimals.add("Squirrel");
        System.out.println(wildAnimals);


        ArrayList<String> animals = new ArrayList<>();

        animals.add("Dog");
        animals.add("Squirrel");
        animals.add("Cat");
        animals.add("Monkey");
        animals.add("Cow");
        animals.add("Tiger");
        animals.add("Sheep");
        animals.add("Bear");
        animals.add("Chicken");
        animals.add("leon");
        System.out.println(animals);

        Comparator<String> comparator = ((o1, o2) -> o1.length() - o2.length());
        Collections.sort(animals,comparator);
        for (String str:animals) {
            System.out.println(str);
        }
        }
    }
