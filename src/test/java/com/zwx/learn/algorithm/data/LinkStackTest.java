package com.zwx.learn.algorithm.data; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* LinkStack Tester. 
* 
* @author <Authors name> 
* @version 1.0 
*/ 
public class LinkStackTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: push(T obj) 
* 
*/ 
@Test
public void testPush() throws Exception { 
//TODO: Test goes here...
    LinkStack linkStack=new LinkStack<Integer>();
    linkStack.push(1);
    linkStack.push(2);
    linkStack.push(3);
    linkStack.push(4);
    linkStack.push(5);
    linkStack.push(6);
    linkStack.push(7);
    linkStack.push(8);
    linkStack.push(9);
    linkStack.push(10);
    linkStack.push(11);
    linkStack.push(12);
    linkStack.push(13);
    System.out.println(linkStack.toString());
} 

/** 
* 
* Method: pop() 
* 
*/ 
@Test
public void testPop() throws Exception { 
//TODO: Test goes here...
    LinkStack linkStack=new LinkStack<Integer>();
    linkStack.push(1);
    linkStack.push(2);
    linkStack.push(3);
    linkStack.push(4);
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    linkStack.push(5);
    linkStack.push(6);
    linkStack.push(7);
    System.out.println(linkStack.peek());
    System.out.println(linkStack.peek());
    linkStack.push(8);
    linkStack.push(9);
    linkStack.push(10);
    linkStack.push(11);
    linkStack.push(12);
    linkStack.push(13);
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.pop());
    System.out.println(linkStack.toString());
} 

/** 
* 
* Method: peek() 
* 
*/ 
@Test
public void testPeek() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception { 
//TODO: Test goes here... 
} 


} 
