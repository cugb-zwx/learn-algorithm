package com.zwx.learn.algorithm.data;

/**
 * @Description: java类作用描述
 * @Author: zwx
 * @CreateDate: 2020/5/25 20:59
 */
public class LinkStack<T> {
    private TowWayNode head;
    private TowWayNode tail;

    public LinkStack(){
        head=new TowWayNode(null);
        tail=head;
    }

    public void push(T obj){
        TowWayNode node=new TowWayNode(obj);
        tail.setNext(node);
        node.setPrev(tail);
        tail=node;
    }

    public T pop(){
        TowWayNode node=tail;
        if(tail!=head){
            tail=node.getPrev();
            tail.setNext(null);
            node.setPrev(null);
        }
        return (T)node.getObj();
    }

    public T peek(){
        return (T)tail.getObj();
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        TowWayNode node=head.getNext();
        while (node!=null){
            sb.append(String.valueOf(node.getObj())).append(",");
            node=node.getNext();
        }
        int len=sb.length()-1;
        return sb.toString().substring(0,len>0?len:0);
    }
}
