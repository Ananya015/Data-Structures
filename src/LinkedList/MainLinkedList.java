package LinkedList;

import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> myLL= new SinglyLinkedList<> ();
        myLL.add ( 44 );
        myLL.add ( 49 );
        myLL.add ( 49 );
        myLL.add ( 42 );
        myLL.deleteduplicates (  );
//        myLL.atpostion ( 33,2 );
//        myLL.delNode ( 2 );

        myLL.print ();
    }
}
