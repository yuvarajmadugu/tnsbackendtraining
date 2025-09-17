package com.tns.generics;

public class GenericMain {
    public static void main(String[] args) {
        GenericDemo<String> ob1 = new GenericDemo<>();
        ob1.setMsg("Hii");
        System.out.println(ob1.getMsg());

        GenericDemo<Integer> ob2 = new GenericDemo<>();
        ob2.setMsg(1);
        System.out.println(ob2.getMsg());
    }
}
