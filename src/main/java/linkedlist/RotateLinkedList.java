package linkedlist;

import java.util.List;

public class RotateLinkedList {

    public static class LinkedList {
        int val;
        LinkedList next;

        public LinkedList(int val){
            this.val = val;
        }
    }

    public static LinkedList rotateList(LinkedList list, int k){
        if(list ==null || k==0){
            return list;
        }

        // calculate the length
        int length = 1;
        LinkedList current = list;

        while (current.next != null){
            length++;
            current = current.next;
        }

        // find new head and tails position after rotate

        int stepsToRotate = k % length;
        if(stepsToRotate == 0){
            return list;
        }

        int newTailPosition = length - stepsToRotate ;
        current.next = list; // make the list circular

        //Traverse to the new tails position

        for (int i = 0 ; i < newTailPosition; i++){
            current = current.next;

        }

        // Update the head and tail pointer
        LinkedList newList = current.next;
        current.next = null;

        return newList;
    }

    public static  void printLinkedList(LinkedList current){
        while (current != null){
            System.out.println(current.val + " ");
            current =current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.next = new LinkedList(2);
        list.next.next = new LinkedList(3);
        list.next.next.next = new LinkedList(4);
        printLinkedList(list);

        LinkedList newList = rotateList(list, 6);
        printLinkedList(newList);

    }
}
