package com.mycompany.builder_pattern;

public class Builder_pattern {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setName("seif")
                .setAge(22)
                .setAddress("egypt")
                .setPhone("000000")
                .build();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getAddress());
        System.out.println(person.getPhone());

    }
}
