package com.haige.collectionapi.listmethod;

import java.util.LinkedList;

public class ListStack {
    private LinkedList<Object> list = new LinkedList<>();

    public void push(Object e){
        list.addFirst(e);
    }

    public Object top(){
        return list.getFirst();
    }
    
    public Object pop(){
        return list.removeFirst();
    }

    public static void main(String[] args) {
        ListStack stack = new ListStack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println(stack.top());
        stack.push(100);
        System.out.println(stack.top());

    }

}
