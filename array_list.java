// #->method number

import java.util.*;

public class array_list {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>(50);
        ArrayList<Integer> arr2 = new ArrayList<Integer>(50);
        ArrayList<Integer> arr3 = new ArrayList<Integer>(50);
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
        arr2.add(4, 55555);

        // #3 -> add anoter arraylist
        // arr.addAll(arr2);

        // #4 -> add anoter arraylist specific position
        arr.addAll(2, arr2);

        // #5-> clear all array element
        // arr.clear();

        // #6-> if element persant in this arr than return true otherwie return false
        if (arr.contains(4)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        // #7-> we can check as other arraylist
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

        // #11-> remove of specific element from this list
        arr.remove(4);

        // #12-> replace element of given index
        // and a is replace element of this list
        int a = arr.set(1, 1234);

        // print as a list form
        System.out.println(arr);

        // this is print as a itrator form
        for (int i = 0; i < arr.size(); i++) {
            // # 10 -> get the value
            System.out.println(arr.get(i) + " ");
        }
    }
}
