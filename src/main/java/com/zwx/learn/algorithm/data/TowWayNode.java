package com.zwx.learn.algorithm.data;

/**
 * Title: TowWayNode
 * Project: learn-algorithm
 * Description:
 * Date: 2020/5/23 22:56
 * Copyright: Copyright (c) 2020
 * Company: 北京中科院软件中心有限公司 (SEC)
 *
 * @author wxzhao
 * @version 1.0
 */
public class TowWayNode {
    private Object obj;
    private TowWayNode prev;
    private TowWayNode next;


    public TowWayNode(Object obj) {
        this.obj = obj;
    }

    public TowWayNode(Object obj, TowWayNode prev, TowWayNode next) {
        this.obj = obj;
        this.prev = prev;
        this.next = next;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public TowWayNode getPrev() {
        return prev;
    }

    public void setPrev(TowWayNode prev) {
        this.prev = prev;
    }

    public TowWayNode getNext() {
        return next;
    }

    public void setNext(TowWayNode next) {
        this.next = next;
    }
}
