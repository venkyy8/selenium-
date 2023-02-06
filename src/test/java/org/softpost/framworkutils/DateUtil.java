package org.softpost.framworkutils;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;

import java.util.Calendar;

/**
 * Created by Sagar on 22-01-2017.
 */
public class DateUtil {

    @Test
    public void getDate(){
        String date = "2 years"; //2 years, -2 days, 3 months etc
        int durationToBeAddedOrSubtracted;
        Calendar newDate = Calendar.getInstance();

        //-20 years
        durationToBeAddedOrSubtracted = Integer.parseInt(date.split(" ")[0]);

        if (date.toLowerCase().contains("months")){
            newDate.add(Calendar.MONTH, durationToBeAddedOrSubtracted);
        } else if (date.toLowerCase().contains("years")){
            newDate.add(Calendar.YEAR, durationToBeAddedOrSubtracted);
        }else{
            newDate.add(Calendar.DATE, durationToBeAddedOrSubtracted);
        }

        //Converting date to string

        formatDate(newDate);
    }

    private void formatDate(Calendar newDate) {
        String day = String.valueOf(newDate.get(Calendar.DAY_OF_MONTH));
        String month = String.valueOf(newDate.get(Calendar.MONTH)+1);
        String year = String.valueOf(newDate.get(Calendar.YEAR));

        if (day.length()==1){
            day = "0"+day;
        }
        if (month.length()==1){
            month = "0"+month;
        }
        System.out.println("Date is -> " + day + "-" + month + "-" + year);
    }

    @Test
    public void test1(){
        Calendar newDate = Calendar.getInstance();
        newDate.set(2019, 2, 2, 0, 0);
        formatDate(newDate);

        System.out.println(DateFormatUtils.format(newDate,"dd-MM-yy"));


    }

}
