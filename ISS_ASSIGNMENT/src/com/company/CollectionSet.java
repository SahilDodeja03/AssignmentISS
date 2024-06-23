package com.company;

import java.util.*;

class Employee{
    private int employeeId;
    private String employeeName;

    Employee(){
        employeeId=0;
        employeeName="XYZ";
    }

    Employee(int employeeId, String employeeName){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
    }

    public int getEmployeeId(){
        return this.employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
public class CollectionSet {
    public static void main(String args[]){
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("John");
        treeSet.add("James");
        treeSet.add("Preeti");
        treeSet.add("Kashish");
        treeSet.add("Bills");
        System.out.println("Tree set output");
        Iterator<String> it1=treeSet.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }


        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("John");
        linkedHashSet.add("James");
        linkedHashSet.add("Preeti");
        linkedHashSet.add("Kashish");
        linkedHashSet.add("Bills");
        System.out.println("Linked hash set output");
        Iterator<String> it2=linkedHashSet.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }


        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("John");
        hashSet.add("James");
        hashSet.add("Preeti");
        hashSet.add("Kashish");
        hashSet.add("Bills");
        System.out.println("Hash set output");
        Iterator<String> it3=hashSet.iterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
        }

        Set<Employee> employeeSet=new HashSet<>();
        employeeSet.add(new Employee(1,"John"));
        employeeSet.add(new Employee(2,"James"));
        employeeSet.add(new Employee(3,"Preeti"));
        employeeSet.add(new Employee(4,"Kashish"));

        for (Employee employee : employeeSet)   System.out.println("Id "+employee.getEmployeeId()+" "+"Name "+employee.getEmployeeName());

    }
}