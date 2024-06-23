package com.company;

//Comparable: Implemented within the class and defines the natural ordering of objects. Use the compareTo method.
//Comparator: Implemented as separate classes or anonymous classes and defines custom orderings. Use the compare method.
//You can create multiple comparators for different sort orders.

import java.util.*;
import com.company.Worker;

public class ComparableVsComparator {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(2);
        intList.add(9);
        intList.add(1);
        intList.add(7);

        System.out.println("Before sorting: " + intList);

        Collections.sort(intList);
        System.out.println("After sorting: " + intList);

        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker(3, "Sahil"));
        workers.add(new Worker(1, "Vansh"));
        workers.add(new Worker(2, "Kamal"));

        System.out.println("Before sorting by ID: " + workers);
        Collections.sort(workers, new Comparator<Worker>() {
            @Override
            public int compare(Worker s1, Worker s2) {
                return Integer.compare(s1.getWorkerId(), s2.getWorkerId());
            }
        });
        System.out.println("After sorting by ID: " + workers);

        System.out.println("Before sorting by Name: " + workers);
        Collections.sort(workers, new Comparator<Worker>() {
            @Override
            public int compare(Worker w1, Worker w2) {
                return w1.getWorkerName().compareTo(w2.getWorkerName());
            }
        });
        System.out.println("After sorting by Name: " + workers);


        List<Worker> workers1 = new ArrayList<>();
        workers1.add(new Worker(3, "Sahil"));
        workers1.add(new Worker(1, "Nobita"));
        workers1.add(new Worker(2, "Suniyo"));

        System.out.println("Before sorting: " + workers1);

        Collections.sort(workers1);
        System.out.println("After sorting: " + workers1);


    }

}