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
    //adding a node at specific position
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
        // deleting a node at particular position
    void delNode(int positionOfToBeDeleted){
        Node temp=head;
        int index=1;
        while(index<positionOfToBeDeleted-1){
            temp=temp.next;

        }
        Node deletedNode=temp.next.next;
        temp.next=deletedNode;

    }

    //remove duplicates from sorted(ascending) array
    void deleteduplicates( ){
            Node temp=head;
            if(temp==null) return;
            while(temp.next!=null){
                if(temp.data==temp.next.data){
                    temp.next=temp.next.next;
                }
                else{
                    temp=temp.next;
                }

            }
    }


// printing linkedList
    void print(){
        Node temp=head;
        while (temp!=null){
            System.out.println (temp.data +" ");
            temp=temp.next;
        }
    }
//deleting a particular node
    // deleting a last node


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
