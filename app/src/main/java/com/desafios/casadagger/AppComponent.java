package com.desafios.casadagger;

import com.desafios.casadagger.model.Casa;

import dagger.Component;

@Component
public interface AppComponent {
    Casa getCasa();

}
