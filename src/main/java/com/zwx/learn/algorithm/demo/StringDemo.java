package com.zwx.learn.algorithm.demo;

/**
 * Title: StringDemo
 * Project: learn-algorithm
 * Description:
 * Date: 2020/5/23 22:34
 * Copyright: Copyright (c) 2020
 * Company: 北京中科院软件中心有限公司 (SEC)
 *
 * @author wxzhao
 * @version 1.0
 */
public class StringDemo {

    //判断回文字符串
    public static boolean isHWStr(String str) {
        if (str == null || str.length() == 0) return false;
        int left = 0;
        int right = str.length() - 1;
        while (right > left) {
            if (!(str.charAt(left) == str.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }


}
