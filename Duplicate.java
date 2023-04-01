/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author hp
 */
//shahad hassan adadi 436004870
//checkDuplicate Pseudocode
//Algorithem check Duplicate(head)
//C<-head 
//IF c=null 
//PRINT is empty 
//ElSE 
//LOOP c!=tail
//LOOP g<-c->next , g !=tail-> next , g<-g<-next  
//IF c->data=g->data 
//return true 
//END LOOP 
//c=c->next 
//return  false

public class Duplicate {
    
     public static Boolean checkDuplicate(Node head) { // CircularlyLinkedList : head=tail.next
        Node beginning = head, current = head; // Put the first node in a variable named current=head

        while (current.getNext() != head) {//The external loop expresses the current
            Node R = current.getNext();
            while (R != head) {//The interior loop expresses the rest of the node after the current
                if (R.getElement().equals(current.getElement())) {//
                    return true;
                }
                R = R.getNext();
            }
            current = current.getNext();
        }
        return false;
    }
}
