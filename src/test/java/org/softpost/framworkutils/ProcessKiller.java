package org.softpost.framworkutils;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by Sagar on 22-01-2017.
 */
public class ProcessKiller {

    @Test
    public void test(){
        try {

            String [] processNames = {"firefox","iexplore","notepad"};

            for (String process : processNames) {
                if (SystemUtils.IS_OS_LINUX) {
                    String[] cmd = {"/bin/sh",
                            "-c", "ps -ef | grep -w "+
                            process +" | grep -v grep | awk '/[0-9]/{print $2}' | xargs kill -9 "};

                    StringBuffer output = new StringBuffer();
                    try {
                        Process p = Runtime.getRuntime().exec(cmd);
                        List<String> result = IOUtils.readLines(p.getInputStream());
                        for (String line : result) {
                            System.out.println(line);
                            output.append(line);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                } else if (SystemUtils.IS_OS_WINDOWS) {
                    Runtime.getRuntime().exec("taskkill /F /IM "+
                            process +".exe");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
