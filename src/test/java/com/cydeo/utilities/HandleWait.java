package com.cydeo.utilities;

public class HandleWait {


    public static void staticWait(int i){
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
