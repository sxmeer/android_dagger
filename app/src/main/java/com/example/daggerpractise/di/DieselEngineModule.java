package com.example.daggerpractise.di;

import com.example.daggerpractise.car.DieselEngine;
import com.example.daggerpractise.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsPower;

    public DieselEngineModule(int horsPower) {
        this.horsPower = horsPower;
    }

    @Provides
    Engine provideDieselEngine(){
        return new DieselEngine(horsPower);
    }
}

//this module is using the values passed while creation of dagger component

