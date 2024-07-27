package com.example.daggerpractise.di;

import com.example.daggerpractise.MainActivity;
import com.example.daggerpractise.car.Car;
import com.example.daggerpractise.car.PetrolEngine;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);//this is for manual injection used for lifecycle components

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder horsePower(@Named("horsePower")int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity")int engineCapacity);
        CarComponent build();
    }
}
//3 types of injection
//constructor injection, field and method injection
//for only field injection and method injection we need to inject manually
//else if we have constructor injection then no need for manual injection

//modules are used when we do not own the class which has provides method


//Builder is used to build the component and various constants can be passed to it using bindsInstance annotation
//and it can be named as well

//if inject is used then we can write @singleton directly above class
//or else we can write it above @provides
