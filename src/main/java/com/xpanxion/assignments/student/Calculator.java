package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Calculator {

    ArrayList<String> list;

    public Calculator(){
        list = new ArrayList<String>();
    }

    public int add(int num1, int num2){
        int sum = num1 + num2;
        list.add(num1 + "+" + num2 + "=" + sum);
        return sum;
    }

    public int sub(int num1, int num2){
        int difference = num1 - num2;
        list.add(num1 + "-" + num2 + "=" + difference);
        return difference;
    }

    public int mult(int num1, int num2){

        int product = num1*num2;
        list.add(num1 + "*" + num2 + "=" + product);
        return product;
    }
    public int div(int num1, int num2){
        int quotient = num1/num2;
        list.add(num1 + "/" + num2 + "=" + quotient);
        return quotient;
    }

}
