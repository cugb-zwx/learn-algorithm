package com.zwx.learn.algorithm.demo;

import com.zwx.learn.algorithm.data.ArrayStack;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: java类作用描述
 * @Author: zwx
 * @CreateDate: 2020/5/25 21:18
 */
public class ArrayStackDemo {

    //检测字符串中括号是否匹配
    public static boolean matchOpretion(String str) {
        ArrayStack<Character> stack = new ArrayStack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.pop() != '(') return false;
            } else if (c == ']') {
                if (stack.pop() != '[') return false;
            } else if (c == '}') {
                if (stack.pop() != '{') return false;
            }
        }
        if (stack.pop() != null) return false;
        return true;
    }

    //解析字符串运算表达式，并还原
    public static int calcExpression(String str) {
        if (str == null || str.trim().length() == 0) return 0;
        ArrayStack<Character> stack = new ArrayStack<>();
        ArrayStack<Integer> nums = new ArrayStack<>();
        StringBuilder sb = null;
        for (char c : str.toCharArray()) {
            if (sb == null) sb = new StringBuilder();
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                nums.push(Integer.parseInt(sb.toString()));
                sb = null;
                Character top = stack.peek();
                if (top != null && getLevel(top) >= getLevel(c)) {
                    nums.push(calc(stack.pop(), nums.pop(), nums.pop()));
                }
                stack.push(c);
            }
        }
        nums.push(Integer.parseInt(sb.toString()));
        while (stack.peek() != null) {
            nums.push(calc(stack.pop(), nums.pop(), nums.pop()));
        }
        return nums.pop();
    }

    private static Map<Character, Integer> map;
    private static Lock lock = new ReentrantLock();

    private static int getLevel(Character c) {
        if (map == null) {
            lock.lock();
            if (map == null) {
                map = new HashMap<>();
                map.put('-', 1);
                map.put('+', 1);
                map.put('*', 2);
                map.put('/', 2);
            }
            lock.unlock();
        }
        return map.get(c);
    }

    private static int calc(char calc, int a, int b) {
        if (calc == '-') return b - a;
        else if (calc == '+') return b + a;
        else if (calc == '*') return b * a;
        else if (calc == '/') return b / a;
        return 0;
    }

}
