package com.zwx.learn.algorithm.demo;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * StringDemo Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>05/23/2020</pre>
 */
public class StringDemoTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: isHWStr(String str)
     */
    @Test
    public void testIsHWStr() throws Exception {
        //TODO: Test goes here...
        String[] arr = {"asa", "sdfs", "awsswa", "weew"};
        for (String s : arr) {
            System.out.println(StringDemo.isHWStr(s));
        }
    }


} 
