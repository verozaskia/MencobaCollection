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
public class LettersQueue {
    public static void main(String[] args) {
    //This will be implemented as a queue
    LinkedList<String> lettersQ = new LinkedList<>();
    
    //Adding elements to the end of the queue
    lettersQ.add("A");
    lettersQ.add("B");
    lettersQ.add("C");
    lettersQ.add("D");
    
    //display the contents of the linked list
    System.out.println("Linked list : " + lettersQ);
    //display the size of the linked list
    System.out.println("Queue Size: " + lettersQ.size());
    
    //while the Queue is not empty remove each element
    while(!lettersQ.isEmpty()) {
        System.out.println(lettersQ.removeFirst());
    }//endwhile
    //display the contents of the linked list
    System.out.println("Linked list : " + lettersQ);
    
    }//end method main
}//end class LettersQueue

