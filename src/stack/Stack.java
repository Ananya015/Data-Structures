package stack;

import LinkedList.SinglyLinkedList;

public class Stack <E>{

    private SinglyLinkedList<E> mystack=new SinglyLinkedList<> ();
    //push
    void push(E data){
       mystack.add(data);
    }

    //peek
    E peek() throws Exception {
        return mystack.getLastElement ();
    }

    //popping
    E pop() throws Exception{
      if(mystack.isEmpty ()){
          throw new Exception ("popping is not allowed");
      }
      return mystack.deleteLastNode();

    }

    //showing elements of stack
    void showStack(){
        mystack.print();
    }
}
