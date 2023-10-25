package com.xpanxion.assignments.student;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Random;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = console.nextLine();

        String answer = name.toUpperCase();

        System.out.println("Your name in uppercase letters: " + answer);
    }

    public void ex2() {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = console.nextLine();

        int answer = counter(string);

        System.out.println("Number of Uppercase letters: " + answer);
    }

    public void ex3() {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = console.nextLine();

        String[] result = string.split("\\s");
        for (int x=0; x<result.length; x++) {
            if(x%2==0){
                System.out.print(result[x].toUpperCase() + " ");
            }
            else{
                System.out.print(result[x] + " ");
            }
        }

        System.out.println();
    }

    public void ex4() {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = console.nextLine();

        int ptr1 = 0;

        int ptr2 = string.length()-1;

        while(ptr1<=ptr2){
            if(string.charAt(ptr1)!=string.charAt(ptr2)){
                System.out.println("NO");
                return;
            }
            ptr1++;
            ptr2--;
        }
        System.out.println("YES");
    }

    public void ex5() {

        String string;
        int vowelCount = 0;
        int consonantCount = 0;

        do{

            Scanner console = new Scanner(System.in);
            System.out.print("Enter a string: ");
            string = console.nextLine();

            vowelCount = 0;
            consonantCount = 0;

            String newString = string.toLowerCase();

            if(string.equals("quit")){
                break;
            }

                for(int i = 0; i < string.length(); i++){

                    if((newString.charAt(i) == 'a') || (newString.charAt(i) == 'e') || (newString.charAt(i) == 'i') || (newString.charAt(i) == 'o') || (newString.charAt(i) == 'u')){
                        vowelCount++;
                    }
                    else if(newString.charAt(i) >= 'a' && newString.charAt(i) <= 'z'){
                        consonantCount++;
                    }

                }
                System.out.println("Number of vowels: " + vowelCount);
                System.out.println("Number of consonants: " + consonantCount);

            }while(!string.equals("quit"));
    }

    public void ex6() {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = console.nextInt();

        System.out.print("Enter second number: ");
        int num2 = console.nextInt();

        int sum = num1+num2;

        System.out.println("Result: " + sum);
    }

    public void ex7() {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = console.nextInt();

        System.out.print("Enter second number: ");
        int num2 = console.nextInt();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = console.next();

        if(Objects.equals(operation, "add")){

            int sum = num1+num2;

            System.out.println("Result: " + sum);
        }
        else if(Objects.equals(operation, "sub")){

            int result = num1-num2;

            System.out.println("Result: " + result);

        }
        else if(Objects.equals(operation, "mul")){

            int result = num1*num2;

            System.out.println("Result: " + result);

        }
        else if(Objects.equals(operation, "div")){

            int result = num1/num2;

            System.out.println("Result: " + result);

        }
    }

    public void ex8() {
        Scanner console = new Scanner(System.in);
        String string;
        double total = 0;
        System.out.print("Enter price per sq ft: ");
        double price = console.nextDouble();
        do{

            System.out.print("Enter room dimensions (width x height): ");
            string = console.next();

            if(string.equals("done")){
                break;
            }

            String[] arr = string.split("x", 0);

            int width = Integer.parseInt(arr[0]);
            int length = Integer.parseInt(arr[1]);

            total+=price*(width*length);


        }while(string != "done");

        System.out.println("Total Cost: $" + total);
    }

    public void ex9() {
        Scanner console = new Scanner(System.in);

        int random_int = (int)Math.floor(Math.random() * (5 - 0 + 1) + 0);

        while(true){
            System.out.println("Enter a number: ");
            int guess = console.nextInt();

            if(guess == random_int){
                System.out.println("You guessed it!!!");
                break;
            }
            else{
                System.out.println("Try again...");
            }
        }
    }

    public void ex10() {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = console.nextLine();

        String[] splitStr = string.split("\\s+");

        for(String s: splitStr){
            int counter = 0;
            for(char c: s.toCharArray()){
                for(int i = 0; i < counter;i++){
                    System.out.print(" ");
                }
                System.out.println(c);
                counter++;
            }
        }
    }

    //
    // Private helper methods
    //

    private static int counter(String string){

        int count = 0;

        String newString = string.toUpperCase();

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == ' '){
                continue;
            }
            if(string.charAt(i) == newString.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
