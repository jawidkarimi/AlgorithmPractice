package doublyLinkedList;

public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Jane", "Jones", 123);
        Employee employee2 = new Employee("John", "Doe", 4567);
        Employee employee3 = new Employee("Mary", "Smith", 22 );
        Employee employee4 = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);

        list.printList();
        System.out.println(list.getSize());

        Employee employee5 = new Employee("Bill", "End", 78);
        list.addToEnd(employee5);
        list.printList();

        System.out.println("--------------------------");
        list.removeFront();
        list.printList();
        System.out.println(list.getSize());

        System.out.println("__________________________");
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

        System.out.println("___________________________");
        list.addBefore(employee1,employee3);
        list.printList();

        System.out.println("_____________________________");
        list.addBefore(new Employee("Someone", "Else", 1111), employee2);
        list.printList();



    }
}
