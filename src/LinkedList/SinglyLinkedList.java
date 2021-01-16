package LinkedList;

public class SinglyLinkedList<E> {

    Node<E> head;
 //adding new node
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

    void atpostion( E data,int  position){
        Node toAdd= new Node (data);
        Node temp=head;
        int index=1;
        while(index<position-1){
            temp=temp.next;
            index++;
        }
        toAdd.next=temp.next;
        temp.next=toAdd;

    }
// printing linkedList
    void print(){
        Node temp=head;
        while (temp!=null){
            System.out.println (temp.data +" ");
            temp=temp.next;
        }
    }

//node class
    static class Node<E>{
       E data;
       Node<E> next;
       public Node( E data){
            this.data=data;
            next=null;
        }
    }

}
