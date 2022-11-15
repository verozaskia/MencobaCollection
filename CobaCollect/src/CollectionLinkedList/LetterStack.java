/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionLinkedList;

import java.util.LinkedList;

/**
 *
 * @author USER
 */

public class LetterStack {
    public static void main(String[] args) {
    //This will be implemented as a stack
    LinkedList<String> letterS = new LinkedList<>();
    
    //Adding elements to the top of the stack
    letterS.push("A");
    letterS.push("B");
    letterS.push("C");
    letterS.push("D");
    
    //display the contents of the linked list
    System.out.println("Linked list : " + letterS);
    //display the size of the linked list
    System.out.println("Stack Size: " + letterS.size());
    
    //while the stack is not empty remove each element
    while(!letterS.isEmpty()) {
        System.out.println(letterS.pop());
    }//endwhile
    //display the contents of the linked list
    System.out.println("Linked list : " + letterS);
    
    }//end method main
}//end class Letters
    

