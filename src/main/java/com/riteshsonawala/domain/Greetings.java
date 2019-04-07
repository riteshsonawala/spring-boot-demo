package com.riteshsonawala.domain;

public class Greetings {

    String greeting;

    public Greetings(String name) {
        greeting="Hello " + name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
