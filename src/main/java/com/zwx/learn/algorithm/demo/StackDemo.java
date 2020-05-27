package com.zwx.learn.algorithm.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Description: java类作用描述
 * @Author: zwx
 * @CreateDate: 2020/5/27 20:45
 */
public class StackDemo {
    /**
     * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
     * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
     * （注意：这两个序列的长度是相等的）
     * @param pushA
     * @param popA
     * @return
     */
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA==null || pushA.length==0) return true;
        Map<Integer,Integer> map=new HashMap();
        int len=pushA.length;
        for(int i=0;i<len;++i){
            map.put(pushA[i],i+1);
        }
        int right=len-1;
        while(right>=0){
            Integer a=map.get(popA[right]);
            if(a==null) return false;
            int mid=right-1;
            if(mid<0) break;
            Integer b=map.get(popA[mid]);
            if(b==null) return false;
            int left=mid-1;
            if(left<0) break;
            Integer c=map.get(popA[left]);
            if(c==null) return false;
            if(b<a&&b<c) return false;
            --right;
        }
        return true;
    }

    public boolean IsPopOrder2(int [] pushA,int [] popA) {
        if(pushA==null || pushA.length==0) return true;
        Map<Integer,Integer> map=new HashMap();
        Stack<Integer> stack=new Stack();
        int j=0;
        for(int i=0;i<pushA.length;++i){
            stack.push(pushA[i]);
            while(!stack.isEmpty()&&stack.peek()==popA[j]){
                stack.pop();
                ++j;
            }
        }
        return stack.isEmpty();
    }
}
