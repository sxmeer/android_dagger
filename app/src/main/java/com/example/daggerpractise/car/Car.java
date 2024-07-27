package com.example.daggerpractise.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    public Car(Engine engine, Wheels wheels, Driver driver) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
        Log.d(TAG, "Car: "+this+" was driven by "+driver);
    }

    public void drive() {
        Log.d(TAG, "drive: called");
    }
}

//here engine is third party class not owned by us
//engine is an interface which is initiated using provider methods in respective module