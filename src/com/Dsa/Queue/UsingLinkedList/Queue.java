package com.Dsa.Queue.UsingLinkedList;

public class Queue {
    Node head;
    int count=0;

    public void add(Object ele){
        Node n=new Node(ele);
        if(head==null){
            head=n;
            count++;
            return;
        }
        Node curr=head;
        while (curr.next!=null)
            curr=curr.next;
        curr.next=n;
        count++;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }
    public Object peek(){
        return head.ele;
    }

    public Object poll(){
        Object key=head.ele;
        head=head.next;
        count--;
        return key;
    }
}
