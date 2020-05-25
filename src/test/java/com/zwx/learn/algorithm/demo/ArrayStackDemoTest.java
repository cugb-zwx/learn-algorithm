package com.zwx.learn.algorithm.demo; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* ArrayStackDemo Tester. 
* 
* @author <Authors name> 
* @version 1.0 
*/ 
public class ArrayStackDemoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: matchOpretion(String str) 
* 
*/ 
@Test
public void testMatchOpretion() throws Exception { 
//TODO: Test goes here...
    System.out.println(ArrayStackDemo.matchOpretion("[1+2*(4-5)]"));
    System.out.println(ArrayStackDemo.matchOpretion("([1+2*(4-5)]*3)"));
    System.out.println(ArrayStackDemo.matchOpretion("{[1+2*(4-5)]}"));
    System.out.println(ArrayStackDemo.matchOpretion("[1+{2*}(4-5)]"));
    System.out.println(ArrayStackDemo.matchOpretion("[1+2*4-5)]"));
    System.out.println(ArrayStackDemo.matchOpretion("([1+2*4-5*3)"));
    System.out.println(ArrayStackDemo.matchOpretion("{[1+2*(4-5)}"));
    System.out.println(ArrayStackDemo.matchOpretion("1+{2*(4-5)]"));
} 

/** 
* 
* Method: calcExpression(String str) 
* 
*/ 
@Test
public void testCalcExpression() throws Exception { 
//TODO: Test goes here...
    System.out.println(ArrayStackDemo.calcExpression("1+2*3-2"));
    System.out.println(ArrayStackDemo.calcExpression("1+2"));
    System.out.println(ArrayStackDemo.calcExpression("1+2+3"));
    System.out.println(ArrayStackDemo.calcExpression("1*2"));
    System.out.println(ArrayStackDemo.calcExpression("1*2*3"));
    System.out.println(ArrayStackDemo.calcExpression("1+2-3"));
    System.out.println(ArrayStackDemo.calcExpression("1+2*3"));
    System.out.println(ArrayStackDemo.calcExpression("1+2*3/2"));
    System.out.println(ArrayStackDemo.calcExpression("1+2*3*2"));
} 


/** 
* 
* Method: getLevel(Character c) 
* 
*/ 
@Test
public void testGetLevel() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ArrayStackDemo.getClass().getMethod("getLevel", Character.class); 
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
* Method: calc(char calc, int a, int b) 
* 
*/ 
@Test
public void testCalc() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ArrayStackDemo.getClass().getMethod("calc", char.class, int.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
