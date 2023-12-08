import java.util.ArrayList;

public class Example1 {


    static class Person {
        String name;

        public String getName() {
            return name;
        }

        public Person(String name) {
            this.name = name;
        }

        public void display() {
            System.out.println("Name: " + name);
        }
    }

    static class Employee extends Person {
        public Employee(String name) {
            super(name);
        }

        @Override
        public void display() {
            System.out.println("Employee name: " + name);
        }

        public void sell() {
            // ...
        }
    }

    static class Consumer extends Person {
        public Consumer(String name) {
            super(name);
        }

        @Override
        public void display() {
            System.out.println("Consumer name: " + name);
        }

        public void buy() {
            // ...
        }

    }

    public static void main(String[] args) {

        Object object1 = new Employee("Vasa");
        ((Employee) object1).display();

        // Inheritor example

        /*Employee employee = new Employee("Worker");
        Consumer consumer = new Consumer("Buyer");

        employee.display();
        consumer.display();

        employee.sell();
        consumer.buy();*/

        // Polymorphism example

        ArrayList<Person> peopleList = new ArrayList<>();

        Person person1 = new Employee("Ivan");
        Person person2 = new Consumer("Michal");
        Person person3 = new Consumer("Vasiliy");
        Person person4 = new Employee("Fedora");

        peopleList.add(person1);
        peopleList.add(person2);
        peopleList.add(person3);
        peopleList.add(person4);

        for (Person person : peopleList)
            person.display();
    }
}




