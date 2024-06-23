package com.company;
import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.*;

class Worker implements Comparable<Worker>{
private int workerId;
private String workerName;

        Worker(){
        workerId=0;
        workerName="XYZ";
        }

        Worker(int workerId, String workerName){
        this.workerId=workerId;
        this.workerName=workerName;
        }

        public int getWorkerId(){
                return this.workerId;
                }

        public String getWorkerName() {
                return workerName;
                }


    @Override
    public int compareTo(Worker other) {
        return Integer.compare(this.workerId, other.workerId);
    }
}

public class CollectionMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<>();


        hmap.put(101, "Dodeja");
        hmap.put(105, "Sahil");
        hmap.put(111, "Naksh");
        hmap.put(120, "Rohit");


        for (Map.Entry<Integer, String> entry1 : hmap.entrySet()) {
            System.out.println("Key: " + entry1.getKey() + ", Value: " + entry1.getValue());
        }



        TreeMap<Integer, String> tmap = new TreeMap<>();


        tmap.put(101, "Dodeja");
        tmap.put(105, "Sahil");
        tmap.put(111, "Naksh");
        tmap.put(120, "Rohit");


        for (Map.Entry<Integer, String> entry2 : tmap.entrySet()) {
            System.out.println("Key: " + entry2.getKey() + ", Value: " + entry2.getValue());
        }



        LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();


        lmap.put(100, "Chaitanya");
        lmap.put(120, "Paul");
        lmap.put(105, "Derick");
        lmap.put(111, "Logan");


        for (Map.Entry<Integer, String> entry3 : lmap.entrySet()) {
            System.out.println("Key: " + entry3.getKey() + ", Value: " + entry3.getValue());
        }



        Map<Worker, Worker> studentMap = new HashMap<>();
        studentMap.put(new Worker(1, "Alice"), new Worker(101, "Alicia"));
        studentMap.put(new Worker(2, "Bob"), new Worker(102, "Bobby"));
        studentMap.put(new Worker(3, "Charlie"), new Worker(103, "Charles"));


        for (Map.Entry<Worker, Worker> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
