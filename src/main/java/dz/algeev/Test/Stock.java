package dz.algeev.Test;

import lombok.Data;


import java.util.ArrayList;
import java.util.List;

@Data
public class Stock {
    String name;
    int price;
    int newPrice;
    public Stock(String name, int price) {
        this.name = name;
        this.price = price;
        newPrice = price;
    }
    public void notifications(int newPrice){
        if(price != newPrice){
            price = newPrice;
            System.out.println("price changed, " + name + " new price - " + newPrice);
        }
    }
}
