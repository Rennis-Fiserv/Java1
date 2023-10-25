package com.xpanxion.assignments.student;

public class Product extends Base {

    private int id;
    private String name;
    private Double cost;

    public Product(int id, String name, Double cost){

        super(id);
        this.name = name;
        this.cost = cost;

    }

    public double getCost(){
        return this.cost;
    }
}
