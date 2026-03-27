package com.Dsa.Hashset;

public class MyHashSet {
    Node[] a=new Node[10];
    int count=0;
    public boolean add(Object ele){
        int index=Math.abs(ele.hashCode()%a.length); //hashing
        Node n=new Node(ele);
        if(a[index]==null){
            a[index]=n;
            count++;
            return true;
        }
        Node prev=null;
        Node curr=a[index];
        while (curr!=null){
            if (curr.ele.equals(ele))
                return false;
            prev=curr;
            curr=curr.next;
        }
        prev.next=n;
        count++;
        return true;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }

    public boolean contains(Object ele){
        int index=Math.abs(ele.hashCode()%a.length);
        Node curr=a[index];
        while (curr!=null){
            if (curr.ele.equals(ele))
                return true;
            curr=curr.next;
        }
        return false;
    }




   public boolean remove(Object ele){
       int index=Math.abs(ele.hashCode()%a.length);
       Node prev=null;
       Node curr=a[index];
       while (curr!=null){
           if (curr.ele.equals(ele)){


           if (prev==null){
               a[index]=a[index].next;
               count--;
               return true;
           }
           prev.next=prev.next.next;
           count--;
           return true;

       }
       prev=curr;
       curr=curr.next;
   }
       return false;
   }










    public void display(){
        for (int i=0;i<a.length;i++){
            Node curr=a[i];
            while (curr!=null){
                System.out.println(curr.ele);
                curr=curr.next;
            }
        }
    }
}
