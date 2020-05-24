package com.zwx.learn.algorithm.data;

/**
 * Title: OneWayNode
 * Project: learn-algorithm
 * Description:
 * Date: 2020/5/23 22:53
 * Copyright: Copyright (c) 2020
 * Company: 北京中科院软件中心有限公司 (SEC)
 *
 * @author wxzhao
 * @version 1.0
 */
public class OneWayNode {
    private Object obj;
    private OneWayNode next;

    public OneWayNode(Object obj) {
        this.obj = obj;
    }

    public OneWayNode(Object obj, OneWayNode next) {
        this.obj = obj;
        this.next = next;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public OneWayNode getNext() {
        return next;
    }

    public void setNext(OneWayNode next) {
        this.next = next;
    }
}
