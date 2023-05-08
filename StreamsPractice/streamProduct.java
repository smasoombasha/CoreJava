package StreamsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Products{
    int id ;String  name;double price;

    public Products(int id, String name, double price){// constructor
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class streamProduct {
    public static void main(String a[]){
        List<Products> products = new ArrayList<Products>();
        List<Products> sortedProducts = new ArrayList<Products>();
        List<Products> notpayable = new ArrayList<Products>();
        products.add(new Products(1, "Coconut Oil", 230.9));// here we are creating the object of Products class
        products.add(new Products(2, "SurfExcel Soap", 45));
        products.add(new Products(3, "Santoor Soap", 30));
        products.add(new Products(4, "Floot ata", 350.5));
        products.add(new Products(5, "Jower Power", 69));
        sortedProducts = products.stream()
                                .filter(p -> p.price >=1 && p.price<=250)
                                .collect(Collectors.toList());
        notpayable = products.stream()
                .filter(p -> p.price >=251 && p.price<=1000)
                .collect(Collectors.toList());
        System.out.println("Payable Products : ");
        for(Products str : sortedProducts) System.out.println(str.id+" : "+str.name+" : " +str.price);
       // sortedProducts.forEach(n-> System.out.println(n.id +":"+n.name+":"+n.price));
        System.out.println("Not Payable Products : ");
        for(Products str : notpayable) System.out.println(str.id+" : "+str.name +" : "+str.price);

    }
}
