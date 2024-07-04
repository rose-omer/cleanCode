package com.tutorial.clean.code.chapter10Sınıflar.c03;

import com.tutorial.clean.code.chapter10Sınıflar.c03.helper.SomeObject;

public class HighCohesion {
    SomeObject someObject = new SomeObject();

    public void method1(){
        someObject.helloItsMe();;
    }
}
