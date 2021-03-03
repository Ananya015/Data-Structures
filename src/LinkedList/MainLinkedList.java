package LinkedList;

import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) throws Exception {

        SinglyLinkedList<Integer> myLL= new SinglyLinkedList<> ();
        myLL.add ( 44 );
        myLL.add ( 49 );
//        myLL.add ( 49 );
        myLL.add ( 42 );
        myLL.add ( 63 );
//        myLL.add ( 63 );
//        myLL.deleteduplicates (  );
//        myLL.lengthOfLinkedList ();
//        myLL.atpostion ( 33,2 );
//        myLL.delNode ( 2 );
//         myLL.deleteLastNode ();
//         myLL.findtheelement (  44);
//     int k=myLL.nthElementFromLast ( 2 );
//        System.out.println ("element is"+k);
        myLL.nthElementFromLast ( 4 );



        myLL.print ();

    }
}
