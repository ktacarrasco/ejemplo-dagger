package com.desafios.casadagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.desafios.casadagger.model.Casa;
import com.desafios.casadagger.model.Habitaciones;
import com.desafios.casadagger.model.Puertas;
import com.desafios.casadagger.model.Ventanas;

public class MainActivity extends AppCompatActivity {
    private Casa casa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent component = DaggerAppComponent.create();
        casa = component.getCasa();
        casa.construir();
    }
}
