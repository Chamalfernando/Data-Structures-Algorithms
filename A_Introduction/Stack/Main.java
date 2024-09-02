package A_Introduction.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /*
         *
         * Stack - LIFO data structure. stores objects into a sort of
         * "vertical tower"
         * push() to add to the top
         * pop() to remove from the top
         * */

        Stack<String> stack = new Stack<String>();
//        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Boverlands");
        stack.push("FFVII");

//        System.out.println(stack.empty());
        System.out.println(stack);


//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop(); // after popping all elements if you try to pop() it will give an exception.

        // can assign popping element into a variable
//        String myFavGame = stack.pop();

//        System.out.println(stack);
//        System.out.println(myFavGame);
//        System.out.println(stack.peek());


        System.out.println(stack.search("DOOM"));
        System.out.println(stack.search("Boverlands"));
        System.out.println(stack.search("Hi There")); // if the search is not within the stack it will return -1.


        // this will give an outofMemory Error. Java heap space.
//        for (int i = 0; i < 1000000000; i++) {
//            stack.push("Fallout76");
//        }


        // USES OF STACK
        // 1.undo/redo features in text editor
        // 2.moving back/forward through browser history
        // 3.backtracking algorithms (maze,file directories)
        // 4.calling functions(call stack)

    }
}


