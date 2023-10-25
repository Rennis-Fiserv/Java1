package com.xpanxion.assignments.student;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Thread.sleep;

public class JavaTwo {

    public JavaTwo() {}

    public void ex1() {
        ArrayList<Person> list = new ArrayList<>();

        int id=1;

        while(true){

            Scanner console = new Scanner(System.in);
            System.out.print("Enter a name: ");
            String name = console.nextLine();

            if(name.equals("done")){
                break;
            }

            String[] splitStr = name.split("\\s+");

            Person newPerson = new Person(id, splitStr[0],splitStr[1]);

            list.add(newPerson);

            id++;

        }

        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }

    public void ex2(){

        HashMap<Integer,Person> map = new HashMap<>();

        Person newPerson1 = new Person(1, "Peter","Jones");
        Person newPerson2 = new Person(2, "John", "Smith");
        Person newPerson3 = new Person(3, "Mary", "Jane");

        map.put(1,newPerson1);
        map.put(2,newPerson2);
        map.put(3,newPerson3);

        while (true) {

            Scanner console = new Scanner(System.in);
            System.out.print("Enter an id: ");
            String input = console.nextLine();

            if(input.equals("done")){
                break;
            }

            int id = Integer.parseInt(input);

            if(map.get(id)!=null){
                System.out.println(map.get(id).toString());
            }
            else{
                System.out.println("Not in hashmap");
            }
        }
    }
    public void ex3(){
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
    public void ex4(){
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5(){

        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);

    }

    public void ex6(){

        Scanner console = new Scanner(System.in);
        Calculator calc = new Calculator();

        while(true) {
            System.out.print("Enter first number: ");
            String input1 = console.next();

            if(input1.equals("done")){
                break;
            }

            System.out.print("Enter second number: ");
            String input2 = console.next();

            if(input2.equals("done")){
                break;
            }

            System.out.print("Enter operation (add, sub, mul, div): ");
            String operation = console.next();

            if(operation.equals("done")){
                break;
            }

            int num1 = Integer.parseInt(input1);

            int num2 = Integer.parseInt(input2);

            if (Objects.equals(operation, "add")) {

                int result = calc.add(num1,num2);

                System.out.println("Result: " + result);
            } else if (Objects.equals(operation, "sub")) {

                int result = calc.sub(num1,num2);

                System.out.println("Result: " + result);

            } else if (Objects.equals(operation, "mul")) {

                int result = calc.mult(num1,num2);

                System.out.println("Result: " + result);

            } else if (Objects.equals(operation, "div")) {

                int result = calc.div(num1,num2);

                System.out.println("Result: " + result);

            }
        }
        for(int i = 0; i < calc.list.size();i++){
            System.out.println(calc.list.get(i));
        }
    }

    public void ex7(){
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        List<Person> newPersonList = personList.stream().map(person -> new Person(person.getId(), person.getFirstName(), "xxx")).toList();

        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }

    public void ex8(){

        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        personList.sort(Comparator.comparing(Person::getFirstName));

        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public void ex9() throws InterruptedException {

        Queue<Cat> queue = new LinkedList<>();

        queue.add(new Cat("Alice"));
        queue.add(new Cat("Bob"));
        queue.add(new Cat("Charlie"));
        queue.add(new Cat("Dan"));

        while(!queue.isEmpty()){
            for(Cat cat : queue){
                System.out.print(cat.toString());
            }
            System.out.println();
            queue.remove();
            Thread.sleep(3000);
        }
    }
}
