package com.itavare0;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());

        Stack<String> stack1 = new Stack<>();

        stack1.push("Minecraft");
        stack1.push("Skyrim");
        stack1.push("Doom");
        stack1.push("Call of Duty");

        stack1.pop();
        stack1.search("Skyrim");

        System.out.println(stack1);
    }
}
