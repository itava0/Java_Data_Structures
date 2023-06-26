package com.itavare0;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Call of Duty");

        stack.pop();
        stack.search("Skyrim");

        System.out.println(stack);
    }
}
