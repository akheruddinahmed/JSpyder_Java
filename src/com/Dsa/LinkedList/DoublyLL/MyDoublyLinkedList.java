package com.Dsa.LinkedList.DoublyLL;

public class MyDoublyLinkedList {
    private Node head;
    private int count=0;
    private Node tail; // it is used only for pointing last node

    public void add(Object ele){
        Node n=new Node(ele);
        if (head==null){
            head=n;
            tail=head;
            count++;
            return;
        }
//        Node curr=head;
//        while (curr.next!=null)
//            curr=curr.next;
//        curr.next=n;
//        n.prev=curr;
//        tail=n;
//        count++;

        tail.next = n;
        n.prev = tail;
        tail = n;
        count++;
    }

    public boolean contains(Object ele){
        Node curr=head; // for iterating purpose curr node is taken
        while (curr!=null){
            if (curr.ele.equals(ele))
                return true;
            curr=curr.next;
        }
        return false;
    }

    public void addFirst(Object ele){
        Node n=new Node(ele);
        n.next=head;
        head.prev=n;
        head=n;
        count++;
    }
    public void addIndex(Object ele,int index) {
        if (index<0||index>size())
            throw new IndexOutOfBoundsException();
        if (index==0){
            addFirst(ele);
            return;
        }
        if (index==size()){
            addLast(ele);
            return;
        }
        //adding between 1st and last element
        Node n=new Node(ele);
        Node curr=head;
        for (int i=1;i<index;i++)
            curr=curr.next;
        n.next=curr.next;
        n.prev=curr;
        curr.next.prev=n;
        curr.next=n;
        count++;
    }

    public void addLast(Object ele){
        Node n=new Node(ele);
        tail.next=n;
        n.prev=tail;
        tail=n;
        count++;
    }

    public void removeFirst(){
        head=head.next;
        head.prev=null;
        count--;
    }

    public void remove(int index){
        if (index<0||index>=size())
            throw new IndexOutOfBoundsException();
        if (index==0){
            removeFirst();
            return;
        }
        if (index==size()-1){
            removLast();
            return;
        }

        //removing between 1st and last-1 element
        Node curr=head;
        for (int i=1;i<index;i++)
            curr=curr.next;
        curr.next.next.prev=curr;
        curr.next=curr.next.next;
        count--;

    }

    public void removLast(){
        tail=tail.prev;
        tail.next=null;
        count--;
    }


    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }

    public void display(){
        Node curr=head;
        while (curr!=null){
            System.out.println(curr.ele);
            curr=curr.next;
        }
    }

    public void revDisplay(){
        Node curr=tail;
        while (curr!=null){
            System.out.println(curr.ele);
            curr=curr.prev;
        }
    }
}
