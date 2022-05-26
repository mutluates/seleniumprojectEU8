package com.cydeo.tests.day8_properties_config_reader;

import org.testng.ITest;
import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){
        //    key     = value
        //  user.name = Windows 10
        //  user.name = Hp
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }
}
