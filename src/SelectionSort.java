import java.util.Collections;

public class SelectionSort extends SinglyLinkedList{

    public static void sort(Node head) {

        //Reference to current Node
        Node temp = head;

        // Traverse the list of objects - Sorted set
        while(temp != null){
            Node min = temp;
            Node r = temp.next;

            // Traverse the unsorted sublist swap if left.data-item {'less than'} right.data-item
            while(r != null) {
                if (min.data.getPrn() > r.data.getPrn()){
                    min = r;
                }

                r = r.next;
            }

            // Swap Data

            //Collections.swap(head,);
            int x = temp.data.getPrn();
            temp.data.setPrn(min.data.getPrn());
            min.data.setPrn(x);

            //move to next iteration
            temp = temp.next;
        }
    }
}