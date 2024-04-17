package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (Integer item : sourceList) {
           if (item % 2 != 0) {
               linkedList.addFirst(item);
           } else {
               linkedList.addLast(item);
           }
        }

        return linkedList;
    }
}
