package stack;

public class MainStack{
    public static void main(String[] args) throws Exception {
      Stack<Integer> stack=new Stack ();
      stack.push ( 99 );
        stack.push ( 48 );
        stack.push ( 56 );
       stack.showStack ();
        int popped=stack.pop ();
        System.out.println ("popped element is : "+ popped);

        int peeked=stack.peek ();
        System.out.println ("peeked element is : "+peeked);

    }


}
