package com.demo.hello.test;

import com.demo.hello.list.LinkList;

public class linklistTest {
    public static void main(String[] args) {
        LinkList<String> list = new LinkList<>();
        list.insert(0,"张三");
        list.insert("科比");
        list.insert(1,"麦迪");
        for(String s: list){
            System.out.println(s);
        }
        System.out.println("---------------------------------------------------");
        String getResult = list.get(1);
        System.out.println("获取索引1处的结果为："+getResult);
        String removeResult = list.remove(0);
        System.out.println("删除的元素是"+removeResult);
    }
}
