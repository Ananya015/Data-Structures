package LinkedList;

import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> myLL= new SinglyLinkedList<> ();
        myLL.add ( 44 );
        myLL.add ( 89 );
        myLL.add ( 49 );
        myLL.atpostion ( 33,2 );
        myLL.print ();
    }
}
