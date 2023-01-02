package linkedList2;

public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Jane", "Jones", 123);
        Employee employee2 = new Employee("John", "Doe", 4567);
        Employee employee3 = new Employee("Mary", "Smith", 22 );
        Employee employee4 = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());


        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);

        System.out.println(list.getSize());

        list.printList();
        System.out.println("____________________");
        list.removeFront();
        System.out.println(list.getSize());
        list.printList();


    }
}
