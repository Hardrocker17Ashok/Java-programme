// #->method number

import java.util.*;

public class linked_list {
    public static void main(String args[]) {
        LinkedList arr = new LinkedList();
        LinkedList arr3 = new LinkedList();
        LinkedList arr2 = new LinkedList();
        // # 1-> add element in list
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        arr2.add(11);
        arr2.add(22);
        arr2.add(33);
        arr2.add(44);

        arr3.add(1);
        arr3.add(3);
        arr3.add(4);
        arr3.add(2);

        // # 2 add spesefic position
        arr.add(1, 6);
        arr2.add(4, 00);

        // # 2 add element first position and las position
        arr.addFirst(10000);
        arr.addLast(20000);

        // #3 -> add anoter Linkedlist
        // arr.addAll(arr2);

        // #4 -> add anoter arraylist specific position
        arr.addAll(2, arr2);

        // #5-> clear all linkedlist element
        // arr.clear();

        // #6-> if element persant in this arr than return true otherwie return false
        if (arr.contains(4)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        // #7-> we can check as other linkedlist
        if (arr.containsAll(arr3)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        // #8-> return index of this value other wise return -1
        System.out.println(arr.indexOf(1));

        // #9-> check is empty ya not
        // arr.clear();
        if (arr.isEmpty()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        // #10-> check last index of given multiple element
        System.out.println(arr.lastIndexOf(2));

        // #11-> remove of specific element and remove firs and last from this
        // linkedlist
        arr.remove(4);
        arr.removeFirst();
        arr.removeLast();

        // push and pop element in linked_list because this is use stack
        // arr.pop();
        // arr.pop();
        // arr.pop();
        // arr.push(01);
        // arr.push(02);
        // arr.push(03);

        // print as a list form
        System.out.println(arr);

        // this is print as a itrator form
        for (int i = 0; i < arr.size(); i++) {
            // # 10 -> get the value
            System.out.println(arr.get(i) + " ");
        }
    }
}
