/**
* Custom exception class , which extends Exception class , has a constructor
* which takes in string arg and prints out the message
* 
* @author Piduruchetan_Reddy
*
*/
class ValueNotFoundException extends Exception {
String str;

ValueNotFoundException(String str) {
this.str = str;
}

public String toString() {
return (str);
}
}