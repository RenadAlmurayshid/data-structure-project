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

import java.util.Scanner;
import static project.Duplicate.checkDuplicate;
public class Project {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
           int ch=0;
         while (ch!=3)
       
   {
       System.out.println("1.Cryptography");
       System.out.println("2.CheckDuplicate");
       System.out.println("3.Stringreverse");  
       System.out.println("Enter your choice");
           ch=input.nextInt();
           switch (ch){
               
                case 1:
Cryptography cryp = new Cryptography();
System.out.println("1.Encoding ") ;
System.out.println("2.Decoding ") ;
System.out.println("Enter your choice ") ; 
int number=input.nextInt();
if(number==1){//start if to encode the decrypted word
System.out.println("Enter the text");
input.nextLine();
String firststring= input.nextLine();
System.out.println("Enter number");
int number1= input.nextInt();
System.out.println("Encoding text is: "+cryp.encoder(firststring, number1));
}//end if
else if (number==2){//start if else to decode the encrypted word
System.out.println("Enter the text");
input.nextLine();
String secondstring= input.nextLine();
System.out.println("Enter number");
int number2= input.nextInt();
System.out.println("Decoding text is: "+cryp.decoder(secondstring, number2));}

                    break;
                case 2:
     CircularlyLinkedList<String> Ourgroublist1 = new CircularlyLinkedList<String>();
          String one =input.next();
           String two =input.next();
            String three=input.next();
             String four=input.next();
             Ourgroublist1.addFirst(one);
              Ourgroublist1.addFirst(two);
              Ourgroublist1.addFirst(three);
              Ourgroublist1.addFirst(four);
             
              
    System.out.println(checkDuplicate( Ourgroublist1.tail.getNext()));
           
                 break;
                case 3:
       Singlylinkedlist Ourgroublist2 = new Singlylinkedlist ();
          String firstname =input.next();
           String secondname =input.next();
            String thirdname=input.next();
             String fourthname =input.next();
             Ourgroublist2.addFirst(firstname );
              Ourgroublist2.addFirst(secondname);
              Ourgroublist2.addFirst(thirdname);
              Ourgroublist2.addFirst(fourthname);
 System.out.println("FORWARD");       
Ourgroublist2.print();
System.out.println("REVERSED");
System.out.println(Ourgroublist2.reverse());
                    break;
                
            }

        } 

    }
}
   
    

