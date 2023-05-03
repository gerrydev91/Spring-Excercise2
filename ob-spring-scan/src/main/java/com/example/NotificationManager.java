package com.example;


public class NotificationManager {

    SaluteService saluteService;

    String name;

    public NotificationManager(SaluteService saluteService, String name){

        System.out.println("Running from NotificationManager constructor");

        this.saluteService = saluteService;
        this.name = name;

         
    }
    
}
