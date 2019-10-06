package org.example;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Test1 {
    private final Test2 test2;

    @Inject
    public Test1(Test2 test2) {
        this.test2 = test2;
    }
}
