import java.util.Iterator;

public class Main {
    public static void main(String args[]){
        SList<Integer> head = new SList<>(0);
        System.out.println(head);
        SListIterator<Integer> iter = head.iterator();
        //insert data through iterator
        iter.insert(1);
        System.out.println(head);
        iter.next();
        iter.insert(2);
        System.out.println(head);
        iter = head.iterator();
        //remove data through iterator
        iter.remove();
        System.out.println(head);
        iter.next();
        iter.remove();
        System.out.println(head);
        if(iter.hasNext())
            iter.remove();
        iter = head.iterator();
        if(iter.hasNext())
            iter.remove();
        System.out.println(head);
    }
}
