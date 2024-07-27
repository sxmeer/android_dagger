package com.example.daggerpractise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.daggerpractise.car.Car;
import com.example.daggerpractise.di.CarComponent;
import com.example.daggerpractise.di.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Inject
    Car car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*CarComponent carComponent = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(10))
                .build();*/
        CarComponent carComponent = DaggerCarComponent.builder()
                .horsePower(100)
                .engineCapacity(1400)
                .build();
        carComponent.inject(this);
        Car car = carComponent.getCar();
        Log.d(TAG, "onCreate: " + car);
        Log.d(TAG, "onCreate: " + car2);
    }
}


