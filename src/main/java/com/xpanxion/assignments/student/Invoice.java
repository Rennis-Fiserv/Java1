package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Invoice extends Base{

    private ArrayList<Product> list;

    private int id;

    public Invoice(int id){
        super(id);
        this.list = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        list.add(product);
    }

    public double getTotalCost(){
        double totalCost=0;

        for(int i = 0; i < list.size();i++){
            totalCost+=list.get(i).getCost();
        }
        return totalCost;
    }
}
