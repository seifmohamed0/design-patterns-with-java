package com.mycompany.builder_pattern;

public class Person {

    private final String name;
    private final int age;
    private final String address;
    private final String phone;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public static class Builder {

        private String name;
        private int age;
        private String address;
        private String phone;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        
        public Person build(){
            return new Person(this);
        }
        
    }

}
