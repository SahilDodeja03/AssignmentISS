package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionList {
    public static void main(String args[]){
        ArrayList<String> arrList=new ArrayList<>();
        arrList.add("John");
        arrList.add("James");
        arrList.add(1, "Priti");
        System.out.println("ArrayList Output: ");
        for(String str:arrList)     System.out.println(str);

        LinkedList<String> linkList=new LinkedList<>();
        linkList.add("John");
        linkList.add("James");
        linkList.add(1, "Kashish");
        System.out.println("LinkedList elements: ");
        Iterator<String> it1=linkList.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John"));
        employees.add(new Employee(2, "James"));
        employees.add(new Employee(3, "Priti"));
        for (Employee emp : employees) {
            System.out.println("Id "+emp.getEmployeeId()+" Name: "+emp.getEmployeeName());
        }

        employees.set(1, new Employee(1, "Kashish"));
        System.out.println("Updated student list: ");
        for (Employee emp : employees) {
            System.out.println("Id "+emp.getEmployeeId()+" Name: "+emp.getEmployeeName());
        }
        employees.remove(2);
        System.out.println("List after removal: " );
        for (Employee emp : employees) {
            System.out.println("Id "+emp.getEmployeeId()+" Name: "+emp.getEmployeeName());
        }

    }
}