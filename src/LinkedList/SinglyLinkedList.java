package LinkedList;

public class SinglyLinkedList<E> {

    Node<E> head;

    void add(E data){
        Node toAdd = new Node ( data );

        if(head==null) {
            head=toAdd;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=toAdd;
    }

    void print(){
        Node temp=head;
        while (temp!=null){
            System.out.println (temp.data +" ");
            temp=temp.next;
        }
    }


    static class Node<E>{
       E data;
       Node<E> next;

        public Node( E data){
            this.data=data;
            next=null;
        }
    }

}
