package com.zwx.learn.algorithm.data; 

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* ArrayStack Tester. 
* 
* @author <Authors name> 
* @version 1.0 
*/ 
public class ArrayStackTest { 

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
    ArrayStack arrayStack=new ArrayStack<Integer>();
    arrayStack.push(1);
    arrayStack.push(2);
    arrayStack.push(3);
    arrayStack.push(4);
    arrayStack.push(5);
    arrayStack.push(6);
    arrayStack.push(7);
    arrayStack.push(8);
    arrayStack.push(9);
    arrayStack.push(10);
    arrayStack.push(11);
    arrayStack.push(12);
    arrayStack.push(13);
    System.out.println(arrayStack.toString());
} 

/** 
* 
* Method: pop() 
* 
*/ 
@Test
public void testPop() throws Exception {
//TODO: Test goes here...
    ArrayStack arrayStack=new ArrayStack<Integer>();
    arrayStack.push(1);
    arrayStack.push(2);
    arrayStack.push(3);
    arrayStack.push(4);
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    arrayStack.push(5);
    arrayStack.push(6);
    arrayStack.push(7);
    System.out.println(arrayStack.peek());
    System.out.println(arrayStack.peek());
    arrayStack.push(8);
    arrayStack.push(9);
    arrayStack.push(10);
    arrayStack.push(11);
    arrayStack.push(12);
    arrayStack.push(13);
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.toString());
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
* Method: resize() 
* 
*/ 
@Test
public void testResize() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ArrayStack.getClass().getMethod("resize"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: isNeedResize() 
* 
*/ 
@Test
public void testIsNeedResize() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ArrayStack.getClass().getMethod("isNeedResize"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
