package org.softpost.framworkutils;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;


import java.sql.Timestamp;
import java.util.Calendar;
import java.util.UUID;

/**
 * Created by Sagar on 22-01-2017.
 */
public class RandomNumTest {

    @Test
    public void test(){

        System.out.println("Random alphabetic string of length 8 using Apache -> " + RandomStringUtils.randomAlphabetic(8));

        System.out.println("Random alphanumeric string of length 8 using Apache -> " + RandomStringUtils.randomAlphanumeric(8));

        System.out.println("Random numeric string of length 8 using Apache -> " + RandomStringUtils.randomNumeric(8));

        //Using calendar
        Calendar date = Calendar.getInstance();
        String day = String.valueOf(date.get(Calendar.DAY_OF_MONTH));
        String month = String.valueOf(date.get(Calendar.MONTH)+1);
        String year = String.valueOf(date.get(Calendar.YEAR));

        if (day.length()==1){day = "0"+day;}
        if (month.length()==1){month = "0"+month;}

        String time =  String.valueOf(date.get(Calendar.HOUR_OF_DAY))
                + String.valueOf(date.get(Calendar.MINUTE)) +
                String.valueOf(date.get(Calendar.SECOND));
        System.out.println("Unique random number using calendar is -> " + time +
                year + month + day);

        //Using UUID
        UUID id1 = UUID.randomUUID();
        System.out.println("Unique random number using UUID is -> "+ id1);

        //Using time stamp
        java.util.Date date1= new java.util.Date();
        System.out.println("Unique timestamp is -> " +
                String.valueOf(new Timestamp(date1.getTime())).replaceAll(" ",""));


    }
}
