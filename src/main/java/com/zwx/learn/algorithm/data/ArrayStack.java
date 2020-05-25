package com.zwx.learn.algorithm.data;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @Description: java类作用描述
 * @Author: zwx
 * @CreateDate: 2020/5/25 20:22
 */
public class ArrayStack<T> {
    private int count=0;
    private Object[] array;

    public ArrayStack(){
        array=new Object[5];
    }

    private void resize(){
        Object[] newArray=new Object[array.length+array.length/2];
        System.arraycopy(array,0,newArray,0,array.length);
        array=newArray;
    }

    private boolean isNeedResize(){
        if(count==array.length) return true;
        return false;
    }

    public void push(T obj){
        if(isNeedResize()){
            resize();
        }
        array[count]=obj;
        count++;
    }

    public T pop(){
        if(count==0) return null;
        return (T)array[--count];
    }

    public T peek(){
        if(count==0) return null;
        return (T)array[count-1];
    }

    public String toString(){
        return JSON.toJSONString(Arrays.copyOfRange(array,0,count));
    }
}
