package org.softpost.junit;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by Sagar on 22-01-2017.
 */
public class MyTests {

    @Test @Category(Sanity.class)
    public void test1(){
        System.out.println("This is a sanity test");
    }

    @Test
    public void test2(){

        System.out.println("This is a regression test");
    }

    @Test @Ignore
    public void test3(){
        System.out.println("This is an ignored test");
    }
}
