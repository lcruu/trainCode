package com.demo.hello.list;
import java.util.Iterator;
public class LinkList<T>implements Iterable<T> {
    private Node head;//定义头结点
    private int N;//记录链表的长度

    public class Node {
        //存储数据
        T item;
        //下一个结点
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkList() {
        //初始化头结点
        this.head = new Node(null, null);
        //初始化元素个数
        this.N = 0;
    }

    //清空链表
    public void clear() {
        head.next = null;
        this.N = 0;
    }

    //获取链表的长度
    public int length() {
        return N;
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return N == 0;
    }

    //获取指定位置i的元素
    public T get(int i) {
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.item;
    }

    //向链表中添加元素t
    public void insert(T t) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        Node newNode = new Node(t, null);
        n.next = newNode;
        N++;
    }

    //向指定位置i处，添加元素t
    public void insert(int i, T t) {
        Node pre = head;
        for (int index = 0; index <= i - 1; index++) {
            pre = pre.next;
        }
        Node curr = pre.next;
        Node newNode = new Node(t, curr);
        pre.next = newNode;
        N++;
    }

    //删除指定位置i处的元素，并返回被删除的元素
    public T remove(int i) {
        Node pre = head;
        for (int index = 0; index <= i - 1; index++) {
            pre = pre.next;
        }
        Node curr = pre.next;
        Node nextNode = curr.next;
        pre.next = nextNode;
        N--;
        return curr.item;
    }

    //查找元素t在链表中第一次出现的位置
    public int indexOf(T t) {
        Node n = head;
        for (int i = 0; n.next == null; i++) {
            n = n.next;
            if (n.item.equals(t)) {
                return i;
            }
        }
        return -1;
    }


@Override
public Iterator<T> iterator(){
    return new LIterator();
}
private class LIterator implements Iterator{
    private Node n;
    public LIterator(){
        this.n = head;
    }

    @Override
    public boolean hasNext(){
        return n.next!=null;
}
    @Override
    public Object next(){
        n=n.next;
        return n.item;
    }
}
public void reverse(){
        if(isEmpty()){
            return;
        }
        reverse(head.next);
}
public Node reverse(Node curr){
        if(curr.next==null){
            head.next=curr;
            curr.next=null;
            return curr;
        }
        Node pre =reverse(curr.next);
        pre.next=curr;
        curr.next=null;
        return curr;
}
}