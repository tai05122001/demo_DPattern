package com.example.demo_ds_pattern.model.singleton;


import java.util.Random;

public class LoginSingleton {

    // declare direct object LoginSingleton
//    private static LoginSingleton loginSingleton = new LoginSingleton();

    private int index;
    private static LoginSingleton loginSingleton ;


    private LoginSingleton(int index ){
        this.index = index ;
    }

    public synchronized static LoginSingleton getInstance(){

        if(loginSingleton == null ){
            Random r  = new Random();
            loginSingleton = new LoginSingleton(r.nextInt(1,100));
        }
        return loginSingleton;
    }

    public void SayHello(){
        System.out.println("Hello everyone! I am Tai " + index);
    }

}
