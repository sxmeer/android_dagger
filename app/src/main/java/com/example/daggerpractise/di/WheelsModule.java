package com.example.daggerpractise.di;

import com.example.daggerpractise.car.Rims;
import com.example.daggerpractise.car.Tyres;
import com.example.daggerpractise.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    @Provides
    static Rims provideRims(){
        return new Rims();
    }
    @Provides
    static Tyres provideTyres(){
        return new Tyres();
    }
    @Provides
    static Wheels provideWheels(Rims rims, Tyres tyres){
        return new Wheels(rims,tyres);
    }
}
