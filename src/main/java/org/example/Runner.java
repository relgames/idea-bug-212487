package org.example;

import dagger.ObjectGraph;

public class Runner {
    public static void main(String[] args) {
        ObjectGraph objectGraph = ObjectGraph.create(new MyModule());
        Test1 test1 = objectGraph.get(Test1.class);

        System.out.println(test1);
    }
}
