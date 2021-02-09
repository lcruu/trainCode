package com.demo.hello.tree;

public class BinaryTree<Key extends Comparable<Key>,Value> {
    private Node root;
    private int N;
    private class Node{
        public Key key;//存储键
        private Value value;//存储值
        public Node left;
        public Node right;
        public Node(Key key,Value value,Node left,Node right){
            this.key=key;
            this.value=value;
            this.left=left;
            this.right=right;
        }
    }
    public int size(){
        return N;
    }
    public void put(Key key,Value value){
        root=put(root,key,value);
    }
    private Node put(Node x,Key key,Value value){
        if(x==null){
            N++;
            return new Node(key,value,null,null);
        }
        int cmp= key.compareTo(x.key);
        if(cmp>0){
            x.right=put(x.right,key,value);
        }else if(cmp<0){
            x.left=put(x.left,key,value);
        }else{
            x.value=value;
        }
        return x;
    }
    public Value get(Key key){
        return get(root.key);
    }
    //从指定的树x中，查找key对应的值
    public Value get(Node x,Key key){
        if(x==null){
            return null;
        }
        int cmp= key.compareTo(x.key);
        if(cmp>0){
            return get(x.right,key);
        }else if(cmp<0){
            return get(x.left,key);
        }else{
            return x.value;
        }
    }
        //删除树中key对应的value
        public void delete(Key key){
        delete(root,key);
    }
    public Node delete(Node x,Key key){
        if(x==null){
            return null;
        }
        int cmp= key.compareTo(x.key);
        if(cmp>0){
            x.right=delete(x.right,key);
        }else if(cmp<0){
            x.left=delete(x.left,key);
        }else{
            N--;
            if(x.right==null){
                return x.left;
            }
        }

    return x.right;}

}

