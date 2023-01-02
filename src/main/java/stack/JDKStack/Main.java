package stack.JDKStack;

public class Main {
    public static void main(String[] args) {


       Employee employee1 = new Employee("Jane", "Jones", 122);
       Employee employee2 = new Employee("John", "Doe", 122);
       Employee employee3 = new Employee("Mary", "Smith", 122);
       Employee employee4 = new Employee("Mike", "Wilson", 122);
       Employee employee5 = new Employee("Bill", "End", 122);

       LinkedStack stack = new LinkedStack();
       stack.push(employee1);
       stack.push(employee2);
       stack.push(employee3);
       stack.push(employee4);
       stack.push(employee5);

       stack.printStack();

       System.out.println("____________________");

       System.out.println(stack.peek());

       System.out.println("-----------------------");
       stack.pop();
       stack.printStack();

    }
}
