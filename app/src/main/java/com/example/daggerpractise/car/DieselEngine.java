package com.example.daggerpractise.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";
    int horsePower;

    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
        Log.d(TAG, "DieselEngine: "+horsePower);
    }

    @Override
    public void start() {
        Log.d(TAG, "start: "+this);
    }
}
