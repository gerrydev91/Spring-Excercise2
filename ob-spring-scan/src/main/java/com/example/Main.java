package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        
        //To use the beans we must instatiate the container. 
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        //creation from Spring
        

        NotificationService notifService = (NotificationService) context.getBean("notificationService");

       
        

        String salute = notifService.saluteString();

        System.out.println(salute);


        //Calling objects from insise the second bean which has notificationService as a property.

        UserService userService = (UserService) context.getBean("userService");

        System.out.println(userService.notificationService.saluteString());




    }
    
}