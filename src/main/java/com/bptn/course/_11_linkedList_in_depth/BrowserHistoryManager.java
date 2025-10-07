package com.bptn.course._11_linkedList_in_depth;

import java.util.LinkedList;

public class BrowserHistoryManager {
    public static void main(String[] args) {
        // 1. Create a LinkedList for history
        LinkedList<String> history = new LinkedList<String>();
        // 2. Visit Pages (Add to end/tail)
        history.addLast("homepage.com");
        history.addLast("products.com");
        history.addLast("aboutus.com");

        // 3. Go Back (Remove Last/Tail)
        String tail = history.removeLast();
        System.out.println("User went back from: " + tail);
        // 4. Visit a New Page
        history.addLast("sales.com");
        // 5. View Current History
        System.out.println("Current History: " + history);
    }
}
