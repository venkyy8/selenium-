package org.softpost.framworkutils;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Sagar on 22-01-2017.
 */
public class NumberFormatter {

    @Test
    public void test(){
        String digitalAmount = "$ 4,343.55".replaceAll("[\\$,]","");

        System.out.println("'"+Double.parseDouble(digitalAmount)+"'");
    }

    @Test
    public void getDigits(){

        System.out.println("sdsd sd 33.44jhkjhj".replaceAll("[^0-9.]",""));
    }

    @Test
    public void getSpecificMatch(){
        Pattern p = Pattern.compile("([0-9]+(.[0-9]+)?)");
        Matcher m = p.matcher("sdsdsd33.11jhkjhj3443");

        if (m.find()) {
            System.out.println("First match found " + m.group(1));
        }

        if (m.find()) {
            System.out.println("Second match found " + m.group(1));
        }
    }
}
