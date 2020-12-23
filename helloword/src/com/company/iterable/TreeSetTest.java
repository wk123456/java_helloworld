package com.company.iterable;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<Item> objects = new TreeSet<>();
        objects.add(new Item(1994,"wang"));
        objects.add(new Item(1990,"li"));
        objects.add(new Item(2000,"an"));
        objects.forEach(u->{
            System.out.println(u.toString());
        });
        System.out.println(
                "-------------------------"
        );


       // TreeSet<Item> items = new TreeSet<>(Comparator.comparing(Item::getDes));
        TreeSet<Item> items = new TreeSet<>(Comparator.comparing(u->{
            return u.getDes();
        }));
        items.addAll(objects);
        items.forEach(u->{
            System.out.println(
                    u.toString()
            );
        });
    }
}

class Item implements Comparable<Item>{
    private Integer number;
    private String des;

    public Item(Integer number, String des) {
        this.number = number;
        this.des = des;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


    @Override
    public int compareTo(Item item) {
        return Integer.compare(number,item.number);
        //return Integer.compare(item.number,number);
    }

    @Override
    public String toString() {
        return "Item{" +
                "number=" + number +
                ", des='" + des + '\'' +
                '}';
    }
}
