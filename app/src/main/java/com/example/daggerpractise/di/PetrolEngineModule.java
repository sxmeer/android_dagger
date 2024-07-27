package com.example.daggerpractise.di;

import com.example.daggerpractise.car.Engine;
import com.example.daggerpractise.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindPetrolEngine(PetrolEngine petrolEngine);
}

// we can use binds keyword when only the method argument needs to be returned as it  is
