package com.busra.DateTime;

public class App  {

    public static void main(String [] args){

        for (;;){
            Time now = new Time();
            System.out.printf("%s\r", now.toLongTimeString());
        }

    }
}
