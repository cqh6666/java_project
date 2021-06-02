package com.haige.pojo;

import java.util.*;

/**
 * @className: com.haige.pojo-> Student
 * @description: 学生类
 * @author: cqh
 * @createDate: 2021-05-26 17:34
 * @version: 1.0
 * @todo:
 */
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbies;
    private Map<String,String> cards;
    private Set<String> games;

    public boolean isHasWife() {
        return hasWife;
    }

    public void setHasWife(boolean hasWife) {
        this.hasWife = hasWife;
    }

    private boolean hasWife;
    private Properties info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public void show(){
        System.out.println("name= " + name
                        +  ", area= " + address.getArea()
                        +  ", books= ");
        for(String book:books){
            System.out.print("<<" + book + ">>");
        }

        System.out.println("hobbys: " + hobbies);

        System.out.println("card:"+cards);

        System.out.println("games:"+games);

        System.out.println("wife:"+hasWife);

        System.out.println("info:"+info);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", hobbies=" + hobbies +
                ", cards=" + cards +
                ", games=" + games +
                ", hasWife=" + hasWife +
                ", info=" + info +
                '}';
    }

    public Map<String, String> getCards() {
        return cards;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }
}
