package com.zwx.learn.algorithm.demo;

import com.zwx.learn.algorithm.data.OneWayNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: LinkDemo
 * Project: learn-algorithm
 * Description:
 * Date: 2020/5/23 22:51
 * Copyright: Copyright (c) 2020
 * Company: 北京中科院软件中心有限公司 (SEC)
 *
 * @author wxzhao
 * @version 1.0
 */
public class LinkDemo {

    //找到单向链表的中位数
    public static List<Object> findMid(OneWayNode head) {
        if (head == null) return null;
        List<Object> list = new ArrayList(2);
        OneWayNode left = head;
        OneWayNode right = head;
        while (right.getNext() != null && right.getNext().getNext() != null) {
            left = left.getNext();
            right = right.getNext().getNext();
        }
        if (right.getNext() == null) {
            list.add(left.getObj());
        } else {
            list.add(left.getObj());
            list.add(left.getNext().getObj());
        }
        return list;
    }

    //判断单向链表中内容是否为回文字符
    public static boolean isHWLink(OneWayNode head) {
        if (head == null) return false;
        OneWayNode leftPrev = null;
        OneWayNode left = head;
        OneWayNode right = head;
        while (right.getNext() != null && right.getNext().getNext() != null) {
            OneWayNode temp = left;
            left = left.getNext();
            right = right.getNext().getNext();
            temp.setNext(leftPrev);
            leftPrev = temp;
        }
        if (right.getNext() == null) {
            left = left.getNext();
        } else {
            OneWayNode temp = left;
            left = left.getNext();
            temp.setNext(leftPrev);
            leftPrev = temp;
        }
        while (!leftPrev.getObj().equals(left.getObj())) {
            return false;
        }
        return true;
    }
}
