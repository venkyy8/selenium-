package org.softpost.framworkutils;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Sagar on 22-01-2017.
 */
public class VariablesTest {

    @Test
    public void test1() {
        //Print all JVM system properties
        System.getProperties().list(System.out);

        System.out.println("*********************************************8");
        //Print all Environment variables
        Map<String,String> envVariables = System.getenv();


        for(String key : envVariables.keySet()){
               System.out.println(key + " -> " + envVariables.get(key));
        }
    }

    @Test
    public void test2() {
        //Creating and accessing JVM property
        System.setProperty("p1","v1");
        System.out.println("p1 -> " + System.getProperty("p1"));

        System.out.println("os.name -> " + System.getProperty("os.name"));
        System.out.println("user.dir -> " + System.getProperty("user.dir"));
        //Similarly we can read user.timezone, user.home, java.version, file.separator

    }

    @Test
    public void test3() {
        //Loading JVM properties from a file
        Properties prop = new Properties();

        try {
            InputStream inputStream = VariablesTest.class.getClassLoader().getResourceAsStream("xyz.properties");
            prop.load(inputStream);
        } catch (IOException ex) {
            System.out.println("Exception " + ex.getMessage());
        }
        System.out.println("browser -> " + prop.getProperty("browser"));
        System.out.println("user -> " + prop.getProperty("user"));

    }
}
