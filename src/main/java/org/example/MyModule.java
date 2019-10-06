package org.example;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(injects = Test1.class)
public class MyModule {
    @Provides
    @Singleton
    public Test2 test2() {
        return new Test2();
    }
}
