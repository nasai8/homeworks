// Assignment 2 - Data Structures
// Solved by: Student
// Questions: Odd numbers only

import java.util.*;

public class Assignment_2 {

    // ---------- Q1: Reverse a string using Stack ----------
    static void reverseString() {
        String str = "DataStructure";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        System.out.print("Q1 Reverse String: ");
        while (!stack.isEmpty())
            System.out.print(stack.pop());
        System.out.println();
    }

    // ---------- Q3: Reverse a Queue ----------
    static void reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) return;
        int x = q.poll();
        reverseQueue(q);
        q.add(x);
    }

    // ---------- Q5: Merge two sorted queues ----------
    static Queue<Integer> mergeQueues(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> result = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() < q2.peek())
                result.add(q1.poll());
            else
                result.add(q2.poll());
        }

        result.addAll(q1);
        result.addAll(q2);
        return result;
    }

    // ---------- Main ----------
    public static void main(String[] args) {

        reverseString();

        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3);
        reverseQueue(q);
        System.out.println("Q3 Reverse Queue: " + q);

        Queue<Integer> q1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        Queue<Integer> q2 = new LinkedList<>(Arrays.asList(2, 4, 6));
        System.out.println("Q5 Merge Queues: " + mergeQueues(q1, q2));
    }
}