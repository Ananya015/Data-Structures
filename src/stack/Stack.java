package stack;

import LinkedList.SinglyLinkedList;

public class Stack <E>{

    private SinglyLinkedList<E> mystack=new SinglyLinkedList<> ();

    void push(E data){
       mystack.add(data);
    }
    void peek(){

    }

    E pop() throws Exception{
      if(mystack.isEmpty ()){
          throw new Exception ("popping is not allowed");
      }
      return mystack.deleteLastNode();

    }
    void showStack(){
        mystack.print();
    }
}
