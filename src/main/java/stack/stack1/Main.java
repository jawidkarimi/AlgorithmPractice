package stack.stack1;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

       ArrayStack stack = new ArrayStack(10);
       stack.push(new Employee("Jane", "Jones", 122));
       stack.push(new Employee("John", "Doe", 122));
       stack.push(new Employee("Mary", "Smith", 122));
       stack.push(new Employee("Mike", "Wilson", 122));
       stack.push(new Employee("Bill", "End", 122));

       stack.printStack();
       System.out.println("-----------------------------------------");

       System.out.println(stack.peek());
       System.out.println("-----------------------------------------");
       stack.pop();
       System.out.println(stack.peek());



    }
}
