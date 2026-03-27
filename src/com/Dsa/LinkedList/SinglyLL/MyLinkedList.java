package com.Dsa.LinkedList.SinglyLL;

public class MyLinkedList {
    Node head;
    int count=0;

    public void add(Object ele){
        Node n=new Node(ele);
        if (head==null){
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

    public void addFirst(Object ele){
        Node n=new Node(ele);
        n.next=head;
        head=n;
        count++;
    }

    public void addIndex(Object ele,int index){
        if (index<0||index>size())
            throw new IndexOutOfBoundsException();
        if (index==0){
            addFirst(ele);
            return;
        }
        Node n=new Node(ele);
        Node curr=head;
        for (int i=1;i<index;i++){
            curr=curr.next;

        }
        n.next=curr.next;
        curr.next=n;
        count++;
    }

    public void removeFirst(){
        if (head == null) return;
        head=head.next;
        count--;
    }
    public void remove(int index){
        if (index<0||index>=size())
            throw new IndexOutOfBoundsException();
        if (index==0){
            removeFirst();
            return;
        }
        Node curr=head;
        for (int i=1;i<index;i++)
            curr=curr.next;
        curr.next=curr.next.next;
        count--;
    }

    public boolean contains(Object ele){
        Node curr=head;
        while (curr!=null){
            if (curr.ele.equals(ele))
                return true;
            curr=curr.next;
        }
        return false;
    }

    //reverseLL(H/W)

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;   // store next node
            curr.next = prev;   // reverse link
            prev = curr;        // move prev forward
            curr = next;        // move curr forward
        }

        head = prev; // new head
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


}
