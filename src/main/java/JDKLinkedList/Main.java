package JDKLinkedList;

import doublyLinkedList.Employee;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Jane", "Jones", 123);
        Employee employee2 = new Employee("John", "Doe", 4567);
        Employee employee3 = new Employee("Mary", "Smith", 22);
        Employee employee4 = new Employee("Bill", "Smith", 144);


        LinkedList<Employee> list = new LinkedList<>();

        // addFirst
        list.addFirst(employee1);
        list.addFirst(employee2);
        list.addFirst(employee3);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.print("null");

        //add or addLast is the same
        list.add(employee4);
        iter=list.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");

        //removeFirst and remove are the same
        list.removeFirst();
        iter=list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()){
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.print("null");

        //removeLast
        list.removeLast();
        iter=list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()){
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.print("null");



//        for (Employee employee:list){
//            System.out.println(employee);
//        }
        
    }
}
