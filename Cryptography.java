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
public class Cryptography {
Character []upper={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
Character []lower={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

// the encoder method is made by Renad Zaid Almurayshid 439012192
// pseudo code 

// Renad Zaid Almurayshid 439012192
// FUNCTION: encoder(Lettrs , number)
// Ciphertext <- " "
// loop from i <- 0 until i = Letter ->length // 26 
//    Character x -> uppercase(x)
//    IF character x = letter -> charat(i)
//    for j =0; j < upper->length ; j+1
//    IF x -> equals upper (j)
//    ciphertext =ciphertext +upper(j+number)%upper->length
//    ELSE 
//    for j =0; j < lower->length ; j+1
//    IF x -> equals lower(j)
//    ciphertext =ciphertext +lower(j+number)%lower->length
//       End IF //INER IF1
//      END IF // IF2
//     END IF  // IF3
//    END LOOP // LOOP
//  END FOR 
// END FOR
//  RETURN  cipher text
// End FUNCTION



//first step is following the method signature which it included string in while entering the needed paramaners
// the string represents the letters and the number represents the numberof index that will be used to encode the message
// encoder is a method that takes the normal texts and turn it a ciphered one 
String encoder (String Letters, int number) {//start methode encode
    // i started by creating an empty space for proper encoder 
String Ciphertext=" ";
// here i created a loop for the letter in order to recongnize all the letters i put length to indicate the number of elements with 26 in English alphabet 
for(int i=0;i<Letters.length();i++){//start outter for
    // creation for a new variable that stores a new charachter for a specific number this was used to start the deconding within number chosen within letter 
Character x= Letters.charAt(i);
// make a condition for the if the desired message was written in upper case 
// after the case conditon i determined whether the new character stored is the same range/size of 26 for short array length 
// if this case is true then the cypher text will be printed instead of being empty 
if(Character.isUpperCase(x))
{
for(int j=0;j<upper.length;j++){
if(x.equals(upper[j]))
Ciphertext=Ciphertext+upper[(j+number)%upper.length];
}
}
else
{
    // make a condition for the if the desired message was written in lower  case 
// after the case conditon i determined whether the new character stored is the same range/size of 26 for short array length 
// if this case is true then the cypher text will be printed instead of being empty 
for(int j=0;j<lower.length;j++){//start inner for
if(x.equals(lower[j]))
Ciphertext=Ciphertext+lower[(j+number)%lower.length];
}
}
}
return Ciphertext;
}

// Renad Zaid Almurayshid 439012192
// FUNCTION: dcoder(ciphertext , number)
// plaintext -> " "
// loop from i <- 0 until i =  ciphertext->length 
// chararter x = chipertext->charat(i)
// IF character->isUpperCase(x)
//  for j =0; j < upper->length ; j+1
//  IF x -> equals upper (j)
//   IF (j-number)>=0)
//  plaintext =plaintext +upper(j-number)
// ELSE
//   plaintext =plaintext +upper(j-number)+upper->lenght
// ELSE 
//  for j =0; j < lower->length ; j+1
//  IF x -> equals lower (j)
//   IF (j-number)>=0)
//  plaintext =plaintext +lower(j-number)
// ELSE
//   plaintext =plaintext +lower(j-number)+lower->lenght
//        END LOOP //1
//      END FOR 
//     END FOR 
//    END IF // 1
//   END IF //2
//  END IF //3
// RETURN plaintext
// END FUNCTION

// the decoder method is made by Renad Zaid Almurayshid 439012192
// the decoder is a method that takes a cipher text and turns to a normal and understadable
// first create an empty variable for the normal text
String decoder (String cipherText, int number){//start method decode
String plainText="";
//i started creating a loop for the ciphered text 
for(int i=0;i<cipherText.length();i++){//start outter for
    
    // this x variable is made to check the ciphered text with in the index  
Character x= cipherText.charAt(i);
// checks if the the charachter desired is upper case if that is the case enter the loop otherwise enter the small case loop
if(Character.isUpperCase(x))
{//start outter if
    // the inner loop i check if the charachter is below the the length and is in the first index
    // then it updates the normal texr an index less to decode
for(int j=0;j<upper.length;j++){//start inner for
if(x.equals(upper[j])){//start inner if
if((j-number)>=0)
plainText=plainText+upper[(j-number)];
else
plainText=plainText+upper[(j-number+upper.length)];
}
}
} 
else
{
for(int j=0;j<lower.length;j++){
if(x.equals(lower[j])){
if((j-number)>=0)
plainText=plainText+lower[(j-number)];
else
plainText=plainText+lower[(j-number+lower.length)];
}
}
}
}
return plainText;
}
}