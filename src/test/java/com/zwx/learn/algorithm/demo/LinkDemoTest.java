package com.zwx.learn.algorithm.demo;

import com.alibaba.fastjson.JSON;
import com.zwx.learn.algorithm.data.OneWayNode;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/**
 * LinkDemo Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>05/23/2020</pre>
 */
public class LinkDemoTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: findMid(OneWayNode head)
     */
    @Test
    public void testFindMid() throws Exception {
        //TODO: Test goes here...
        OneWayNode node1 = new OneWayNode("1");
        OneWayNode node2 = new OneWayNode("2");
        node1.setNext(node2);
        OneWayNode node3 = new OneWayNode("3");
        node2.setNext(node3);
        OneWayNode node4 = new OneWayNode("4");
        node3.setNext(node4);
        OneWayNode node5 = new OneWayNode("5");
        node4.setNext(node5);
        System.out.println(JSON.toJSONString(LinkDemo.findMid(node1)));
        OneWayNode node6 = new OneWayNode("6");
        node5.setNext(node6);
        System.out.println(JSON.toJSONString(LinkDemo.findMid(node1)));
    }

    @Test
    public void testIsHWLink() throws Exception {
        //TODO: Test goes here...
        OneWayNode node11 = new OneWayNode("1");
        OneWayNode node12 = new OneWayNode("2");
        node11.setNext(node12);
        OneWayNode node13 = new OneWayNode("3");
        node12.setNext(node13);
        OneWayNode node14 = new OneWayNode("3");
        node13.setNext(node14);
        OneWayNode node15 = new OneWayNode("2");
        node14.setNext(node15);
        OneWayNode node16 = new OneWayNode("1");
        node15.setNext(node16);
        System.out.println(LinkDemo.isHWLink(node11));

        OneWayNode node21 = new OneWayNode("1");
        OneWayNode node22 = new OneWayNode("2");
        node21.setNext(node22);
        OneWayNode node23 = new OneWayNode("3");
        node22.setNext(node23);
        OneWayNode node24 = new OneWayNode("2");
        node23.setNext(node24);
        OneWayNode node25 = new OneWayNode("1");
        node24.setNext(node25);
        System.out.println(LinkDemo.isHWLink(node21));
    }


} 
