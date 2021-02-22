package LinkedList;

public class SinglyLinkedList<E> {

    Node<E> head;
 //adding new node
    public void add(E data){
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
    //reverse the linked list
    void reverseLinkedList(){
        Node temp=head;
        Node dummy=null;
        while(temp.next!=null){
            temp.next=dummy;

        }
    }
    //printing length of LinkedList
    void lengthOfLinkedList(){

        Node temp=head;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println ("length of LinkedList is: "+count);

    }

    // deleting a last node
    public E deleteLastNode() throws Exception{
        Node<E> temp=head;

        if(temp==null){
            throw new Exception ("Cannot remove last element from emptied list");
        }
        //if list is having only one element
        if(temp.next==null){
            Node<E> toRemove=temp;
            head=null;
            return toRemove.data;
        }
        while (temp.next.next!=null){
            temp=temp.next;
        }
        Node<E> toRemove=temp.next;
        temp.next=null;
        return toRemove.data;
    }

   public boolean isEmpty(){
        return head==null;
    }

    // printing linkedList
   public void print(){
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
