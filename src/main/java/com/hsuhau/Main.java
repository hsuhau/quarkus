package com.hsuhau;

import org.graalvm.polyglot.Context;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World from Java!");

        Context context = Context.newBuilder().allowAllAccess(true).build();

        context.eval("js", "print('Hello World from JavaScript!');");
        context.eval("python", "print('Hello World from Python!')");
        context.eval("ruby", "puts 'Hello World from Ruby!'");
    }
}