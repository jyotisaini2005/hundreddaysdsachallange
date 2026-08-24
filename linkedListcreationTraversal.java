import java.util.*;
public class linkedListcreationTraversal
{
    static class node{
        int data;
        node next;
    
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
    public static void main(String[] args) {
         node first=new node(10);
         node second=new node(20);
         node third= new node(40);
         first.next=second;
         second.next=third;
         third.next=null;
         
         node temp=first;
         while(temp!=null)
         {
        System.out.println(temp.data);
        temp=temp.next;
         }
    }
}